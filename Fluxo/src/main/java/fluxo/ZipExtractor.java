package fluxo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 *
 * @author gsutavo
 */
public class ZipExtractor {
    
    public static void main(String[] args) throws IOException {
        String fileZip = "/home/gsutavo/teste.zip";
        File destDir = new File("/home/gsutavo/unzipTest");
        byte[] buffer = new byte[1024];
        ZipInputStream zis = new ZipInputStream(new FileInputStream(fileZip));
        ZipEntry zipEntry = zis.getNextEntry();
        while(zipEntry != null) {
            File newFile = newFile(destDir, zipEntry);
            if(zipEntry.isDirectory()) {
                if(!newFile.isDirectory() && !newFile.mkdir()) {
                    throw new IOException("Failed to create directory " + newFile);
                }
            } else {
                File parent = newFile.getParentFile();
                if(!parent.isDirectory() && !parent.mkdir()) {
                    throw new IOException("Failed to create directory " + newFile);
                }
            }
            FileOutputStream fos = new FileOutputStream(newFile);
            int len;
            while((len = zis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            fos.close();
        }
        zipEntry = zis.getNextEntry();
        zis.closeEntry();
        zis.close();
    }
    
    public static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
        File destFile = new File(destinationDir, zipEntry.getName());
        
        String destDirPath = destinationDir.getCanonicalPath();
        String destFilePath = destFile.getCanonicalPath();
        
        if(!destFilePath.startsWith(destDirPath + File.separator)) {
            throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
        }
        
        return destFile;
    }
    
}
