package br.com.fiap.energy.dominio;

import br.com.fiap.energy.dominio.enums.Estado;
import br.com.fiap.energy.dto.EnderecoDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Endereco implements Domain {

    @JsonProperty
    private String rua;

    @JsonProperty
    private int numero;

    @JsonProperty
    private String bairro;

    @JsonProperty
    private String cidade;

    @JsonProperty
    private Estado estado;

    @Override
    public EnderecoDto toDto() {
        return new EnderecoDto(rua, numero, bairro, cidade, estado);
    }
}