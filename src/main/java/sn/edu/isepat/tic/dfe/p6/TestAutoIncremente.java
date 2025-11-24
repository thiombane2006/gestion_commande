package sn.edu.isepat.tic.dfe.p6;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sn.edu.isepat.tic.dfe.p6.entities.Utilisateur;

public class TestAutoIncremente {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionProduitsPU");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();
        Utilisateur u1 = new Utilisateur();
        u1.setNom("Franklin Saint");
        u1.setEmail("fs@gmail.com");
        em.persist(u1);
        em.getTransaction().commit();

        em.getTransaction().begin();
        Utilisateur u2 = new Utilisateur();
        u2.setNom("Baye Marame Thiombane");
        u2.setEmail("bmt@gmail.com");
        em.persist(u2);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
