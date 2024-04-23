package br.com.fiap.motos.dto.response;

import lombok.Builder;

import java.time.Year;

@Builder
public record AcessorioResponse (
        String nome,
        Double preco


){

}
