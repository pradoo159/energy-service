package br.com.fiap.energy.dto;

import br.com.fiap.energy.dominio.Endereco;
import br.com.fiap.energy.dominio.enums.Estado;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EnderecoDto implements Dto {

    @JsonProperty
    @NotBlank(message = "Informe a rua")
    private final String rua;

    @JsonProperty
    @NotBlank(message = "Informe o número da residência")
    private final int numero;

    @JsonProperty
    @NotBlank(message = "Informe o bairro")
    private final String bairro;

    @JsonProperty
    @NotBlank(message = "Informe a cidade")
    private final String cidade;

    @JsonProperty
    @NotBlank(message = "Informe o estado")
    private final Estado estado;

    @JsonCreator
    public EnderecoDto(String rua,
            @JsonFormat(shape = Shape.STRING) int numero, String bairro, String cidade,
            @JsonFormat(shape = Shape.STRING) Estado estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public Endereco toDomain() {
        return new Endereco(rua, numero, bairro, cidade, estado);
    }
}
