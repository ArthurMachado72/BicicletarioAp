/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Bicicleta;

public class BicicletaService {
        private EntityManagerFactory emf = Persistence.createEntityManagerFactory("BiciletarioApPU");

    public void salvarBicicleta(Bicicleta bicicleta) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bicicleta);
        em.getTransaction().commit();
        em.close();
    }

    public List<Bicicleta> listarBicicletas() {
        EntityManager em = emf.createEntityManager();
        List<Bicicleta> bicicletas = em.createQuery("SELECT b FROM Bicicleta b", Bicicleta.class).getResultList();
        em.close();
        return bicicletas;
    }

    public void excluirBicicleta(int bicicletaId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Bicicleta bicicleta = em.find(Bicicleta.class, bicicletaId);
        if (bicicleta != null) {
            em.remove(bicicleta);
        }
        em.getTransaction().commit();
        em.close();
    }
}
