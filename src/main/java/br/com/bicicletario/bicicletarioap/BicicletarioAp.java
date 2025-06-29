package br.com.bicicletario.bicicletarioap;

import br.com.bicicletario.bicicletarioap.persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import view.TelaLogin;

public class BicicletarioAp {

    private static final Logger logger = LoggerFactory.getLogger(BicicletarioAp.class);

    public static void main(String[] args) {
        iniciarAplicacao();
    }

    public static boolean iniciarAplicacao() {
        boolean conectado = false;

        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);

        EntityManager em = JPAUtil.conectar();

        try {
            if (em != null) {
                logger.info("Conexão com o banco de dados estabelecida com sucesso!");
                conectado = true;
            } else {
                logger.warn("Falha ao conectar ao banco de dados.");
            }
        } catch (Exception e) {
            logger.error("Erro inesperado ao tentar conectar ao banco de dados", e);
        } finally {
            JPAUtil.desconectar(em);
        }

        Runtime.getRuntime().addShutdownHook(new Thread(JPAUtil::fecharFactory));
        return conectado;
    }
}
