package br.com.fiap.motos.dto.request;

import jakarta.validation.constraints.NotNull;

public record TipoVeiculoRequest (
        @NotNull(message = "O campo nome é obrigatório")
        String nome

){

}
