package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author gsutavo
 */
public class Main {
    
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("teste4");
        l1.add("teste1");
        l1.add("teste2");
        l1.add("teste5");
        l1.add("teste1");
        Iterator it = l1.iterator();
        while(it.hasNext()) {
            String resultado = (String)it.next();
            System.out.println("Resultado: " + resultado);
        }
        
        System.out.println("--------------------");
        
        Collections.sort(l1);
        it = l1.iterator();
        while(it.hasNext()) {
            String resultado = (String)it.next();
            System.out.println("Resultado: " + resultado);
        }
        
        System.out.println("--------------------");
        
        Set s1 = new TreeSet();
        s1.add("teste4");
        s1.add("teste1");
        s1.add("teste2");
        s1.add("teste5");
        s1.add("teste1");
        Iterator it2 = s1.iterator();
        while(it2.hasNext()) {
            String resultado = (String)it2.next();
            System.out.println("Resultado: " + resultado);
        }
        
        System.out.println("-------------------------------");
        
        Map m1 = new TreeMap();
        m1.put("key1", "teste4");
        m1.put("key4", "teste1");
        m1.put("key3", "teste2");
        m1.put("key1", "teste1");
        m1.put("key5", "teste3");
        Set s2 = m1.keySet();
        Iterator it3 = s2.iterator();
        while(it3.hasNext()) {
            String key = (String)it3.next();
            String resultado = (String)m1.get(key);
            System.out.println("Key = " + key + " Resultado: " + resultado);
        }
    }
    
}
