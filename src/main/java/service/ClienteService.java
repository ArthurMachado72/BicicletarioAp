/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Cliente;

public class ClienteService {
  
        private EntityManagerFactory emf;

    // Construtor que inicializa o EntityManagerFactory
    public ClienteService() {
        emf = Persistence.createEntityManagerFactory("BicicletarioApPU");
    }

    // Método para obter o EntityManager
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Método para buscar um cliente por ID
    public Cliente buscarClientePorId(Integer clienteId) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, clienteId);
        } finally {
            if (em != null && em.isOpen()) {
                em.close(); // Fecha o EntityManager
            }
        }
    }
    
    public void salvarCliente(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

    public List<Cliente> listarClientes() {
        EntityManager em = emf.createEntityManager();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
        em.close();
        return clientes;
    }

    public void excluirCliente(int clienteId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Cliente cliente = em.find(Cliente.class, clienteId);
        if (cliente != null) {
            em.remove(cliente);
        }
        em.getTransaction().commit();
        em.close();
    }
    
}
