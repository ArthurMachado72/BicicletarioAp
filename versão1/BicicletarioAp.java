/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
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

        if (em != null) {
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
        } else {
            System.out.println("Falha ao conectar ao banco de dados.");
        }

        JPAUtil.desconectar();
    }
}