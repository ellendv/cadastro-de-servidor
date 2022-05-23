package br.com.ambiente.testejava.model.dto;

import java.util.Date;
public class ServidorDto {
    private String nome;
    private String matricula;
    private Date dataCadastro;
    private Long lotacaoId;


    public ServidorDto(String nome, String matricula, Date dataCadastro, Long lotacaoId) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataCadastro = dataCadastro;
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
