package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EventoDAO {

    private final EntityManager em;

    //costruttore
    public EventoDAO() {
        //questo mi crea una connessione con il persistence unit che userò per gestire i metodi di persistenza sulle mie classi
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneEventiPU");
        this.em=emf.createEntityManager();
    }


    public void save(Evento evento) {
        try{
            em.getTransaction().begin();
            em.persist(evento);
            em.getTransaction().commit();
        }
        catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    //libera le risorse dopo aver finito
    public void close() {
        em.close();
    }



}
