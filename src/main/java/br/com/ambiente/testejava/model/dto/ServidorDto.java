package br.com.ambiente.testejava.model.dto;

import br.com.ambiente.testejava.model.Lotacao;
import lombok.Data;

import java.util.Date;
@Data
public class ServidorDto {
    private String nome;
    private String maricula;
    private Date dataCadastro;
    private LotacaoDto lotacaoDto;
}
