package triomaravilha.senai.atmosfera_4_0.infra.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(
        name ="Dispositivos"
)
public class DispositivoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_dispositivo")
    private Long id_dispositivo;

    @Column(nullable = false, length = 30)
    private String nome_dispositivo;

    @Column(length = 50)
    private String localizacao;

    @Column(nullable = false, length = 30)
    private String tipo_dispositivo;

    @ManyToOne
    @JoinColumn(name = "gateway_pai_fk")
    private DispositivoModel gateway_pai_fk;

    public DispositivoModel(String nome_dispositivo, String localizacao, String tipo_dispositivo, DispositivoModel gateway_pai_fk) {
        this.nome_dispositivo = nome_dispositivo;
        this.localizacao = localizacao;
        this.tipo_dispositivo = tipo_dispositivo;
        this.gateway_pai_fk = gateway_pai_fk;
    }
}
