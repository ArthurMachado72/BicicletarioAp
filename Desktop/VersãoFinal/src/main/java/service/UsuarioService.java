/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Usuario;

public class UsuarioService {
    private EntityManagerFactory emf;
    private EntityManager em;
    
        // Construtor
    public UsuarioService() {
        this.emf = Persistence.createEntityManagerFactory("BicicletarioApPU");
        this.em = emf.createEntityManager();
    }

        // Método para buscar usuário por nome
    public Usuario buscarUsuarioPorNome(String nome) {
        try {
            return em.createQuery("SELECT u FROM Usuario u WHERE u.nome = :nome", Usuario.class)
                     .setParameter("nome", nome)
                     .getSingleResult();
        } catch (Exception e) {
            return null; // Retorna null caso não encontre
        }
    }


    public void salvarUsuario(Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public List<Usuario> listarUsuarios() {
        EntityManager em = emf.createEntityManager();
        List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
        em.close();
        return usuarios;
    }

    public void excluirUsuario(int usuarioId) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, usuarioId);
        if (usuario != null) {
            em.remove(usuario);
        }
        em.getTransaction().commit();
        em.close();
    }

        // Fechar conexão
    public void fecharConexao() {
        if (em != null && em.isOpen()) {
            em.close();
        }
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
