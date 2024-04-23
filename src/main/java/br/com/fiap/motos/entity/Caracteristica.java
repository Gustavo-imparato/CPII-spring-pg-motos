package br.com.fiap.motos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "TB_CARACTERISTICA", uniqueConstraints = {
        @UniqueConstraint( name = "UK_NOME_CARACTERISTICA", columnNames = {"NOME_CARACTERISTICA", "VEICULO"})
})
public class Caracteristica {

    private Long id;

    //30 digitos
    @Column(name = "NOME_CARACTERISTICA")
    private String nome;

    //20 digitos
    private String descricao;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "VEICULO",
            referencedColumnName = "ID_VEICULO",
            foreignKey = @ForeignKey(
                    name = "FK_VEICULO"
            )
    )
    private Veiculo veiculo;


}
