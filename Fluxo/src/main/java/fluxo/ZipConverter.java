package fluxo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author gsutavo
 */
public class ZipConverter {
    
    public static void main(String[] args) {
        try {
            String zipFile = "/home/gsutavo/teste.zip";
            String srcTxt = "/home/gsutavo/testePC2";
        
            byte[] buffer = new byte[1024];
        
            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);
        
            File dir = new File(srcTxt);
            File[] files = dir.listFiles();
        
            for(int i = 0; i < files.length; i++) {
                System.out.println("Adding file: " + files[i].getName());
                FileInputStream fis = new FileInputStream(files[i]);
            
                zos.putNextEntry(new ZipEntry(files[i].getName()));
            
                int length;
            
                while((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }
            
                zos.closeEntry();
                fis.close();
            }
            zos.close();
        } catch(IOException ioe) {
            System.out.println("Error creating zip file" + ioe);
        }
    }
    
}
