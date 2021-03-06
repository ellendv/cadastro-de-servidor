package br.com.ambiente.testejava.model.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.Date;
public class LotacaoDto {
    @NotBlank
    private String nome;
    @Column(columnDefinition = "datetime")
    private Date dataCadastro;

    public LotacaoDto(String nome) {
        this.nome = nome;
        this.dataCadastro = new Date();
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
