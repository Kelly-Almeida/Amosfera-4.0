package triomaravilha.senai.atmosfera_4_0.infra.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "Registros"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_registro")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_dispositivo_fk", nullable = false)
    private DispositivoModel id_dispositivo_fk;

    @Column
    private Timestamp timestamp;

    @Column
    private LocalDateTime data_hora;

    @Column
    private float temperatura;

    @Column
    private float umidade;

    @Column
    private float pressao;

    @Column
    private float altitude;

    @Column
    private float luminosidade;

    @Column
    private float velocidade_vento;

    @Column
    private int direcao_vento;

    @Column
    private int intensidade_wifi;


}
