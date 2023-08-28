import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Runner {

  public static void main(String[] args){
    Equipo equipo1 = new Equipo("Equipo 1",null,null);
    Auto auto = new Auto(equipo1, "Civic", "Honda","17",1200);

    EntityManager em = PerThreadEntityManagers.getEntityManager();
    EntityTransaction transaction = em.getTransaction();

    transaction.begin();
    em.persist(equipo1);
    em.persist(auto);
    transaction.commit();

  }
}
