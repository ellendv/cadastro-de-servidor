package br.com.ambiente.testejava.model.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
public class ServidorDto {
    @NotBlank
    private String nome;
    @NotBlank
    private String matricula;
    @Column(columnDefinition = "datetime")
    private Date dataCadastro;
    @NotNull
    private Long lotacaoId;


    public ServidorDto(String nome, String matricula, Long lotacaoId) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataCadastro = new Date();
        this.lotacaoId = lotacaoId;
    }


    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Long getLotacaoId() {
        return lotacaoId;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setLotacaoId(Long lotacaoId) {
        this.lotacaoId = lotacaoId;
    }
}
