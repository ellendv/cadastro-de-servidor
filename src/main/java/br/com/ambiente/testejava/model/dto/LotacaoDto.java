package br.com.ambiente.testejava.model.dto;

import lombok.Data;

import java.util.Date;
@Data
public class LotacaoDto {
    private String descricao;
    private Date dataCadastro;
}
