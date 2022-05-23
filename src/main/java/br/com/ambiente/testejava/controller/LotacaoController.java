package br.com.ambiente.testejava.controller;

import br.com.ambiente.testejava.model.Lotacao;
import br.com.ambiente.testejava.model.dto.LotacaoDto;
import br.com.ambiente.testejava.service.LotacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/lotacao")
public class LotacaoController {
    private final LotacaoService lotacaoService;

    public LotacaoController(LotacaoService lotacaoService) {
        this.lotacaoService = lotacaoService;
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Lotacao> cadastrarLotacao(@Valid @RequestBody LotacaoDto lotacaoDto){
         Lotacao lotacao = lotacaoService.cadastrarLotacao(lotacaoDto);
        return ResponseEntity.status(CREATED).body(lotacao);
    }

    @GetMapping({"/{nome}"})
    public Lotacao lotacaoPorNome(@PathVariable("nome") String nome){
        return lotacaoService.buscarNome(nome);
    }
    @PutMapping("{id}")
    public ResponseEntity<Lotacao> atualizar(@PathVariable("id") Long id, @RequestBody @Valid LotacaoDto lotacaoDto){
        Lotacao lotacao = lotacaoService.atualizarLotacao(id, lotacaoDto);
        return ResponseEntity.status(CREATED).body(lotacao);
    }

}
