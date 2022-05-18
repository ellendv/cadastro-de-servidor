package br.com.ambiente.testejava.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Servidor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(length = 400)
    private String nome;
    @NotBlank
    @Column(length = 30)
    private String matricula;
    private Date dataCdastro;
    @ManyToOne
    @NotBlank
    private Lotacao lotacao;

    public Servidor(String nome, String matricula, Date dataCdastro, Lotacao lotacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataCdastro = dataCdastro;
        this.lotacao = lotacao;
    }

    public Servidor() {
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataCdastro() {
        return dataCdastro;
    }

    public void setDataCdastro(Date dataCdastro) {
        this.dataCdastro = dataCdastro;
    }

    public Lotacao getLotacao() {
        return lotacao;
    }

    public void setLotacao(Lotacao lotacao) {
        this.lotacao = lotacao;
    }
}
