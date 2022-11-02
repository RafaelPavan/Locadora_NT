package com.nt.locadorant.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class MovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome", nullable = false)
    private String name;
    @Column(nullable = false)
    private String filmeReservado;
    @Column(nullable = false)
    private LocalDate dataReserva;
    @Column(nullable = false)
    private LocalDate dataEntrega;
    @Column(nullable = false)
    private Integer quantidadeFilmes;
    @Column(nullable = false)
    private Integer quantidadeDiasLocados;

    public MovieModel() {
    }

    public MovieModel(Long id, String name, String filmeReservado,
                      LocalDate dataReserva, LocalDate dataEntrega, Integer quantidadeFilmes,
                      Integer quantidadeDiasLocados) {
        this.id = id;
        this.name = name;
        this.filmeReservado = filmeReservado;
        this.dataReserva = dataReserva;
        this.dataEntrega = dataEntrega;
        this.quantidadeFilmes = quantidadeFilmes;
        this.quantidadeDiasLocados = quantidadeDiasLocados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilmeReservado() {
        return filmeReservado;
    }

    public void setFilmeReservado(String filmeReservado) {
        this.filmeReservado = filmeReservado;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Integer getQuantidadeFilmes() {
        return quantidadeFilmes;
    }

    public void setQuantidadeFilmes(Integer quantidadeFilmes) {
        this.quantidadeFilmes = quantidadeFilmes;
    }

    public Integer getQuantidadeDiasLocados() {
        return quantidadeDiasLocados;
    }

    public void setQuantidadeDiasLocados(Integer quantidadeDiasLocados) {
        this.quantidadeDiasLocados = quantidadeDiasLocados;
    }
}
