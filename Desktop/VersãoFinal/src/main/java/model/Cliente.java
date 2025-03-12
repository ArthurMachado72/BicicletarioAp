/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Aluguel;
import jakarta.persistence.*;
import java.util.List;


/**
 *
 * @author Player14109423498
 */
@Entity
public class Cliente {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cliente_id;

    private String nome;
    private String contato;

    @OneToMany(mappedBy = "cliente")
    private List<Aluguel> alugueis;
    

    // Getters e Setters
    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
}
