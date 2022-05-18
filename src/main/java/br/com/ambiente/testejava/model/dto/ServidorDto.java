package br.com.ambiente.testejava.model.dto;

import br.com.ambiente.testejava.model.Lotacao;
import lombok.Data;

import java.util.Date;
public class ServidorDto {
    private String nome;
    private String matricula;
    private Date dataCadastro;
    private LotacaoDto lotacaoDto;


    public ServidorDto(String nome, String matricula, Date dataCadastro, LotacaoDto lotacaoDto) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataCadastro = dataCadastro;
        this.lotacaoDto = lotacaoDto;
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

    public LotacaoDto getLotacaoDto() {
        return lotacaoDto;
    }
}
