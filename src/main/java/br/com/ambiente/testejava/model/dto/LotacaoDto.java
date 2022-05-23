package br.com.ambiente.testejava.model.dto;

import java.util.Date;
public class LotacaoDto {
    private String nome;
    private Date dataCadastro;

    public LotacaoDto(String nome, Date dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public LotacaoDto() {

    }

    public String getNome() {
        return nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
