package br.com.fiap.motos.dto.response;

import br.com.fiap.motos.dto.request.AbstractRequest;
import br.com.fiap.motos.entity.Acessorio;
import br.com.fiap.motos.entity.Fabricante;
import br.com.fiap.motos.entity.TipoVeiculo;
import jakarta.persistence.*;

import java.time.Year;

public record VeiculoResponse(
        String nome,
        Year anoDeFabricacao,
        String cor,
        Double preco,
        Short cilindradas,
        String modelo,
        String palavraDeEfeito,
        Fabricante fabricante,
        TipoVeiculo tipo,
        Acessorio acessorio


        ) {
}
