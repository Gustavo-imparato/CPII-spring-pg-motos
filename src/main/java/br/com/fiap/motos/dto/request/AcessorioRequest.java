package br.com.fiap.motos.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AcessorioRequest (
        @Size(min = 2, max = 255, message = "A quantidade de caracteres do nome deve estar entre")
        @NotNull(message = "O nome é campo obrigatório")
        String nome,
        @NotNull(message = "O Preço é campo obrigatório")
        Double preco
){

}
