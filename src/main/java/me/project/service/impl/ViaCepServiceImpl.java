package me.project.service.impl;

import me.project.domain.model.Endereco;
import me.project.domain.repository.EnderecoRepository;
import me.project.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ViaCepServiceImpl implements ViaCepService {

    @Autowired
    private  ViaCepService viaCepService;



    @Override
    public Endereco consultarCep(String cep) {
        var endereco = viaCepService.consultarCep(cep);
        return endereco;

    }
}
