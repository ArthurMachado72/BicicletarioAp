package br.com.bicicletario.bicicletarioap.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Player14109423498
 */
public class JPAUtil {

    private static String PERSISTENCE_UNIT = "BicicletarioApPU";
    
     private static EntityManagerFactory factory;
    private static EntityManager manager;
    
        public static EntityManager conectar() {
        if (manager == null || !manager.isOpen()) {
            factory = Persistence.createEntityManagerFactory("PERSISTENCE_UNIT");
            manager = factory.createEntityManager();
        }
        return manager;
        }

    public static EntityManager getEntityManager() {
        if (manager == null || !manager.isOpen()) {
            factory = Persistence.createEntityManagerFactory("PERSISTENCE_UNIT");
            manager = factory.createEntityManager();
        }
        return manager;
    }

    public static void desconectar() {
        if (manager != null && manager.isOpen()) {
            manager.close();
        }
        if (factory != null && factory.isOpen()) {
            factory.close();
        }
    }
}