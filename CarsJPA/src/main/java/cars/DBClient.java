package cars;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DBClient {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cars-pu");
        EntityManager em = emf.createEntityManager();
        
        try {
            String sql = "select c from Carro c";
            Query query = em.createQuery(sql);
            List<Carro> carros = query.getResultList();
            for(Carro c: carros) {
                System.out.printf("\n%d ", c.getId());
                System.out.printf("%s ", c.getNome());
                System.out.printf("R$%.2f", c.getPreco());
            }
        } finally {
            em.close();
            emf.close();
        }
    }
    
}
