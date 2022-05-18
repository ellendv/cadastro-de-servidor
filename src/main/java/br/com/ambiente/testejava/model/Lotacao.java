package br.com.ambiente.testejava.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Lotacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "descricao", length = 400)
     private String nome;
    private Date dataCdastro;

    public Lotacao(String nome, Date dataCdastro) {
        this.nome = nome;
        this.dataCdastro = dataCdastro;
    }

    public Lotacao() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCdastro() {
        return dataCdastro;
    }

    public void setDataCdastro(Date dataCdastro) {
        this.dataCdastro = dataCdastro;
    }

}
