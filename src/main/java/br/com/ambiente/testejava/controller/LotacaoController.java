package br.com.ambiente.testejava.controller;

import br.com.ambiente.testejava.model.Lotacao;
import br.com.ambiente.testejava.model.dto.LotacaoDto;
import br.com.ambiente.testejava.service.LotacaoService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/lotacao")
public class LotacaoController {
    private final LotacaoService lotacaoService;

    public LotacaoController(LotacaoService lotacaoService) {
        this.lotacaoService = lotacaoService;
    }

    @PostMapping
    public Lotacao cadastrarLotacao(@Valid @RequestBody LotacaoDto lotacaoDto){
        return lotacaoService.cadastrarLotacao(lotacaoDto);

    }

    @GetMapping({"/{nome}"})
    public Lotacao lotacaoPorNome(@PathVariable("nome") String nome){
        return lotacaoService.buscarNome(nome);
    }
    @PutMapping("{id}")
    public Lotacao atualizar(@PathVariable("id") Long id, @RequestBody @Valid LotacaoDto lotacaoDto){
        return lotacaoService.atualizarLotacao(id, lotacaoDto);

    }

}
