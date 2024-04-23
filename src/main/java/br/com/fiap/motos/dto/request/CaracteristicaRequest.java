package br.com.fiap.motos.dto.request;

import br.com.fiap.motos.entity.Veiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record CaracteristicaRequest (

        @NotNull(message = "O campo nome é obrigatório")
        String nome,

        @NotNull(message = "O campo descricao é obrigatorio")
        String descricao,

        @Valid @NotNull(message = "É necessário informar os dados do veiculo")
        AbstractRequest veiculo

){
}
