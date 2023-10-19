package me.project.domain.controller;

import me.project.domain.model.Endereco;
import me.project.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private ViaCepService viaCepService;




    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> findById(@PathVariable String cep) {
        var endereco = viaCepService.consultarCep(cep);
        return ResponseEntity.ok(endereco);


    }
}
