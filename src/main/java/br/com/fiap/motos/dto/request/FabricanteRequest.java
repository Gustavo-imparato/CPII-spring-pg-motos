package br.com.fiap.motos.dto.request;

import jakarta.validation.constraints.NotNull;

public record FabricanteRequest (
        @NotNull(message = "O campo nome é obrigatorio")
        String nome,

        @NotNull(message = "o campo nome fantasia é obrigatorio")
        String nomeFantasia

){

}
