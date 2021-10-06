package simple;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class main {
    private static final String PERSISTENCE_UNIT_NAME = "carsPU";
    private static EntityManagerFactory factory;
    
    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        Query q = em.createQuery("SELECT c FROM Carro c");
        List<Carro> carros = q.getResultList();
        for(Carro c: carros) {
            System.out.println(c.toString());
        }
        System.out.println("Size: " + carros.size());
        
//        em.getTransaction().begin();
//        Carro carro = new Carro();
//        carro.setNome("Celta");
//        carro.setPreco(15000.0);
//        em.persist(carro);
//        em.getTransaction().commit();
        
        em.close();
    }
}
