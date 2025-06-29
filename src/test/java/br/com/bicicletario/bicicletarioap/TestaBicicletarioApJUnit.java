package br.com.bicicletario.bicicletarioap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestaBicicletarioApJUnit {

    @BeforeAll
    public static void setUpClass() {
        // Setup global se necessário
    }

    @AfterAll
    public static void tearDownClass() {
        // Cleanup global se necessário
    }

    @BeforeEach
    public void setUp() {
        // Setup antes de cada teste
    }

    @AfterEach
    public void tearDown() {
        // Cleanup após cada teste
    }

    @Test
    public void testConexaoBancoDados() {
        boolean resultado = BicicletarioAp.iniciarAplicacao();
        assertTrue(resultado, "A conexão com o banco de dados deve ser bem-sucedida.");
    }
}
