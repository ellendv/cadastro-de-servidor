package br.com.ambiente.testejava.model.dto;

import java.util.Date;
public class ServidorDto {
    private Long id;
    private String nome;
    private String matricula;
    private Date dataCadastro;
    private Long lotacaoId;


    public ServidorDto(String nome, String matricula, Date dataCadastro, Long lotacaoId) {
        this.id = id;
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


    public Long getId() {
        return id;
    }
}
