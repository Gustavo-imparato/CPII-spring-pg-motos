package br.com.fiap.motos.dto.response;

import br.com.fiap.motos.entity.Veiculo;

import java.time.Year;

public record CaracteristicaResponse (

        String nome,
        String descricao,
        Veiculo veiculo

){

}
