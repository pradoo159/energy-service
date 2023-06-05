package br.com.fiap.energy.dominio;

import br.com.fiap.energy.dominio.enums.Genero;
import br.com.fiap.energy.dominio.enums.Parentesco;
import br.com.fiap.energy.dto.PessoaDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class Pessoa implements Domain {

    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;
    private Parentesco parentesco;

    @Override
    public PessoaDto toDto() {
        return new PessoaDto(nome, dataNascimento, genero, parentesco);
    }
}
