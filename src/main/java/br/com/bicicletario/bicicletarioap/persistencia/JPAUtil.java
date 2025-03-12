package br.com.bicicletario.bicicletarioap.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Player14109423498
 */
public class JPAUtil {

    private static final String PERSISTENCE_UNIT_NAME = "BicicletarioApPU";
    
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    public static EntityManager conectar() {
        return factory.createEntityManager(); // Sempre cria um novo EntityManager
    }

    public static void desconectar(EntityManager manager) {
        if (manager != null && manager.isOpen()) {
            manager.close();
        }
    }

    public static void fecharFactory() {
        if (factory != null && factory.isOpen()) {
            factory.close();
        }
    }
}
