/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.*;
import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;



/**
 *
 * @author Player14109423498
 */
@Data
@Entity
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aluguel_id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "bicicleta_id")
    private Bicicleta bicicleta;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Temporal(jakarta.persistence.TemporalType.DATE)
    private Date hora_inicio;
    private Date hora_termino;
    private double preco_hora;

    // Getters e Setters
    public int getAluguel_id() {
        return aluguel_id;
    }

    public void setAluguel_id(int aluguel_id) {
        this.aluguel_id = aluguel_id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Date getHora_termino() {
        return hora_termino;
    }

    public void setHora_termino(Date hora_termino) {
        this.hora_termino = hora_termino;
    }

    public double getPreco_hora() {
        return preco_hora;
    }

    public void setPreco_hora(double preco_hora) {
        this.preco_hora = preco_hora;
    }

}
