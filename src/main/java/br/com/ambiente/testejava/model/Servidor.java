package br.com.ambiente.testejava.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Servidores")
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
    @Column(columnDefinition = "datetime")
    private Date dataCadastro;
    @ManyToOne
    @NotNull
    private Lotacao lotacao;

    public Servidor(String nome, String matricula, Lotacao lotacao) {
        this.id = null;
        this.nome = nome;
        this.matricula = matricula;
        this.dataCadastro = new Date();
        this.lotacao = lotacao;
    }

    public Servidor() {
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Lotacao getLotacao() {
        return lotacao;
    }

    public void setLotacao(Lotacao lotacao) {
        this.lotacao = lotacao;
    }

    public Long getId() {
        return id;
    }
}

