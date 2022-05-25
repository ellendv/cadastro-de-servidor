package br.com.ambiente.testejava.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "Lotacoes")
public class Lotacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(name = "descricao", length = 400)
     private String nome;
    private Date dataCadastro;


    public Lotacao(String nome) {
        this.nome = nome;
        this.dataCadastro = new Date();
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCdastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
