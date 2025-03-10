package br.com.bicicletario.bicicletarioap;

import br.com.bicicletario.bicicletarioap.persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import view.TelaLogin;

/**
 *
 * @author Player14109423498
 */
public class BicicletarioAp {

    public static void main(String[] args) {
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);

        EntityManager em = JPAUtil.conectar();

        try {
            if (em != null) {
                System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
            } else {
                System.out.println("Falha ao conectar ao banco de dados.");
            }
        } finally {
            JPAUtil.desconectar(em);
        }

        // Fechar a fábrica de persistência ao finalizar o programa
        Runtime.getRuntime().addShutdownHook(new Thread(JPAUtil::fecharFactory));
    }
}
