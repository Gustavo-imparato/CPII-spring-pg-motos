package br.com.fiap.motos.dto.request;

import br.com.fiap.motos.entity.Fabricante;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Year;

public record VeiculoRequest (
        @NotNull(message = "O campo nome é obrigatório")
        String nome,

        @NotNull(message = "O campo ano de fabricacao é obrigatório")
        Year anoDeFabricacao,

        @NotNull(message = "O campo cor é obrigatório")
        String cor,

        @NotNull(message = "O campo preço é obrigatório")
        Double preco,

        @NotNull(message = "O campo cilindradas é obrigatório")
        Short cilindradas,

        @NotNull(message = "O campo modelo é obrigatório")
        String modelo,

        @Size(min = 0, max = 15, message = "A quantidade de caracteres de palavra de efeito deve estar entre")
        @NotNull(message = "O campo palavra de efeito é obrigatório")
        String palavraDeEfeito,

        @NotNull(message = "O campo fabricante é obrigatório")
        Fabricante fabricante,

        @Valid@NotNull(message = "é necessário informar o tipo de veiculo")
        AbstractRequest tipoVeiculo,

        @Valid@NotNull(message = "é necessário informar os acessórios do veiculo ")
        AbstractRequest acessorio


){

}
