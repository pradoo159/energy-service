package br.com.fiap.energy.dto;

import java.time.LocalDate;

import br.com.fiap.energy.dominio.Pessoa;
import br.com.fiap.energy.dominio.enums.Genero;
import br.com.fiap.energy.dominio.enums.Parentesco;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;

@Data
public class PessoaDto implements Dto {

    private final String nome;
    private final LocalDate dataNascimento;
    private final Genero genero;
    private final Parentesco parentesco;

    @JsonCreator
    public PessoaDto(
            String nome,
            @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy") LocalDate dataNascimento,
            @JsonFormat(shape = Shape.STRING) Genero genero,
            @JsonFormat(shape = Shape.STRING) Parentesco parentesco
    ) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.parentesco = parentesco;
    }

    @Override
    public Pessoa toDomain() {
        return new Pessoa(nome, dataNascimento, genero, parentesco);
    }
}
