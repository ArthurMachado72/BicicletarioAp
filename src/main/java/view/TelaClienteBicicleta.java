/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import jakarta.persistence.EntityManager;
import model.Bicicleta;
import model.Cliente;
import jakarta.persistence.*;
import javax.swing.JOptionPane;
import lombok.Getter;
import lombok.Setter;
import service.BicicletaService;
import service.ClienteService;


/**
 *
 * @author Player14109423498
 */
public class TelaClienteBicicleta extends javax.swing.JFrame {

    /**
     * Creates new form TelaClienteBicicleta
     */
    public TelaClienteBicicleta() {
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblContato = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        lblBicicletaId = new javax.swing.JLabel();
        txtBicicletaId = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnExcluir1 = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar1 = new javax.swing.JButton();
        lblClienteId = new javax.swing.JLabel();
        txtClienteId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setText("Gerenciar Clientes e Bicicletas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        lblStatus.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblStatus.setText("Status:");
        jPanel1.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtStatus.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 330, -1));

        lblNome.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblNome.setText("Nome:");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 360, -1));

        lblContato.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblContato.setText("Contato:");
        jPanel1.add(lblContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtContato.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jPanel1.add(txtContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 360, -1));

        lblBicicletaId.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblBicicletaId.setText("Bicicleta_id:");
        jPanel1.add(lblBicicletaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtBicicletaId.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jPanel1.add(txtBicicletaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 330, -1));

        lblNumero.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblNumero.setText("Numero:");
        jPanel1.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtNumero.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 330, -1));

        btnExcluir1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnExcluir1.setText("EXCLUIR");
        btnExcluir1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 100, 30));

        btnVoltar.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 90, 30));

        btnCadastrar.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 130, 30));

        btnExcluir.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 90, 30));

        btnCadastrar1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        btnCadastrar1.setText("CADASTRAR");
        btnCadastrar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 130, 30));

        lblClienteId.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblClienteId.setText("Cliente_Id:");
        jPanel1.add(lblClienteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtClienteId.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jPanel1.add(txtClienteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 360, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
            try {
        // Obtém o ID da bicicleta a ser excluída
        int bicicletaId = Integer.parseInt(txtBicicletaId.getText().trim());

        // Exclui a bicicleta do banco de dados
        BicicletaService bicicletaService = new BicicletaService();
        bicicletaService.excluirBicicleta(bicicletaId);

        JOptionPane.showMessageDialog(this, "Bicicleta excluída com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao excluir bicicleta: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }// Chama o método para excluir bicicleta
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaMenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
          try {
        // Obtém os dados dos campos de texto
        String nome = txtNome.getText().trim();
        String contato = txtContato.getText().trim();

        // Valida os dados
        if (nome.isEmpty() || contato.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria um novo cliente
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setContato(contato);

        // Cadastra o cliente no banco de dados
        ClienteService clienteService = new ClienteService();
        clienteService.salvarCliente(cliente);

        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar cliente: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
           try {
        // Obtém o ID do cliente a ser excluído
        int clienteId = Integer.parseInt(txtClienteId.getText().trim());

        // Exclui o cliente do banco de dados
        ClienteService clienteService = new ClienteService();
        clienteService.excluirCliente(clienteId);

        JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao excluir cliente: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar1ActionPerformed
          try {
        // Obtém os dados dos campos de texto
        String numero = txtNumero.getText().trim();
        String status = txtStatus.getText().trim();

        // Valida os dados
        if (numero.isEmpty() || status.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria uma nova bicicleta
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setNumero(numero);
        bicicleta.setStatus(status);

        // Cadastra a bicicleta no banco de dados
        BicicletaService bicicletaService = new BicicletaService();
        bicicletaService.salvarBicicleta(bicicleta);

        JOptionPane.showMessageDialog(this, "Bicicleta cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar bicicleta: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } 
    }//GEN-LAST:event_btnCadastrar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaClienteBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClienteBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClienteBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClienteBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClienteBicicleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCadastrar1;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBicicletaId;
    private javax.swing.JLabel lblClienteId;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtBicicletaId;
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
