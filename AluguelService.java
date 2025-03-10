/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Aluguel;

public class AluguelService {
        private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE_UNIT");

          public AluguelService() {
        // Inicializa a EntityManagerFactory
        emf = Persistence.createEntityManagerFactory("bicicletarioPU");
    }
             public EntityManager getEntityManager() {
        return emf.createEntityManager();
    } 
    public void salvarAluguel(Aluguel aluguel) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(aluguel);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Aluguel> listarAlugueisPorCliente(String nomeCliente) {
    EntityManager em = emf.createEntityManager();
    try {
        return em.createQuery(
            "SELECT a FROM Aluguel a WHERE a.cliente.nome = :nome", Aluguel.class)
            .setParameter("nome", nomeCliente)
            .getResultList();
    } finally {
        em.close();
    }
}

    public void excluirAluguel(int aluguelId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Aluguel aluguel = em.find(Aluguel.class, aluguelId);
        if (aluguel != null) {
            em.remove(aluguel);
        }
        em.getTransaction().commit();
        em.close();
    }

    public List<Aluguel> listarAlugueis() {
             EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT a FROM Aluguel a", Aluguel.class).getResultList();
        } finally {
            em.close();
        }
    }
    public double calcularTotalGastoPorCliente(int clienteId) {
    EntityManager em = emf.createEntityManager();
    try {
        String sql = "SELECT valor_total_aluguel FROM vw_total_aluguel_por_cliente WHERE cliente_id = :clienteId";
        Query query = em.createNativeQuery(sql);
        query.setParameter("clienteId", clienteId);
        Double total = (Double) query.getSingleResult();
        return total != null ? total : 0.0;
    } catch (Exception e) {
        e.printStackTrace();
        return 0.0;
    } finally {
        em.close();
    }
    }
}
