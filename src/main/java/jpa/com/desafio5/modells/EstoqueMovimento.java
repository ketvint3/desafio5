package jpa.com.desafio5.modells;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity(name = "tb_estoque_movimento")
 public class EstoqueMovimento {
    @Id
    private Integer codigo;

    private Timestamp dataHora;

    @Column(length = 1, name = "tipo_movimento")
    private String tipoMovimento;

    private Integer quantidade;


}
