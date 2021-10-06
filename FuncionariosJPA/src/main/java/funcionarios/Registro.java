package funcionarios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Registro {
    private static final String PERSISTENCE_UNIT_NAME = "funcsPU";
    private static EntityManagerFactory factory;
    
    public static void main(String[] args) throws Exception {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
//        em.getTransaction().begin();
//        
//        Funcionario f = new Funcionario();
//        f.setNome("Pedro");
//        f.setDtContratacao(df.parse("06/10/2021"));
//        f.setSalario(9000.00);
//        
//        List<Funcionario> funcionarios = new ArrayList<>();
//        funcionarios.add(f);
//        
//        Departamento d = new Departamento();
//        d.setDescricao("Personal Trainer");
//        d.setFuncionarios(funcionarios);
//        
//        f.setDepartamento(d);
//        
//        
//        em.persist(d);
//        em.persist(f);
//        em.getTransaction().commit();

        Query q = em.createQuery("select d from Departamento d");
        List<Departamento> departamentos = q.getResultList();
        for(Departamento d: departamentos) {
            System.out.printf("\n%d ", d.getCod());
            System.out.printf("\n%s ", d.getDescricao());
            for(Funcionario f: d.getFuncionarios()) {
                System.out.println("\n" + f.toString());
            }
        }
        
        
        em.close();
    }
}
