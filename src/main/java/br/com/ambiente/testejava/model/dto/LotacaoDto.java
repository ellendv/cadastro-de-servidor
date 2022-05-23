package br.com.ambiente.testejava.model.dto;

import java.util.Date;
public class LotacaoDto {
    private Long id;
    private String nome;
    private Date dataCadastro;

    public LotacaoDto(Long id, String nome, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public LotacaoDto() {

    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }



}
