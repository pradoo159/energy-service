package br.com.fiap.energy.service;

import br.com.fiap.energy.dto.Dto;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DataService {
    
    public <T extends Dto> void saveData(T request) {
        log.info("Dados recebidos: {}", request);
        log.info("Transformando para classe de domínio {}", request.toDomain());
       
    }
}
