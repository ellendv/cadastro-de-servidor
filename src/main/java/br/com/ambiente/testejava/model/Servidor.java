package br.com.ambiente.testejava.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Servidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(length = 400)
    private String nome;
    @NotBlank
    @Column(length = 30)
    private String matricula;
    private Date dataCadastro;
    @ManyToOne
    @NotBlank
    private Lotacao lotacao;



    public Servidor(String nome, String matricula, Date dataCadastro) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataCadastro = dataCadastro;
        this.lotacao = lotacao;
    }

    public Servidor() {

    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Lotacao getLotacao() {
        return lotacao;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
