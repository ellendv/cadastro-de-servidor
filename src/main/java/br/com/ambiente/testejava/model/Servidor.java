package br.com.ambiente.testejava.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
public class Servidor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(length = 400)
    private String nome;
    @NotBlank
    @Column(length = 30)
    private String matricula;
    private Date dataCdastro;
    @ManyToOne
    @NotBlank
    private Lotacao lotacao;

}
