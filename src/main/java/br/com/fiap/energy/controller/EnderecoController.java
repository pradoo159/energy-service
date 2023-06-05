package br.com.fiap.energy.controller;

import br.com.fiap.energy.dto.EnderecoDto;
import br.com.fiap.energy.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private DataService dataService;
    
    @PostMapping
    public void saveData(@RequestBody EnderecoDto endereco) {
        
    	dataService.saveData(endereco);
    	
    }
}
	