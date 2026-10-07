package triomaravilha.senai.backatmosfera4.infra.model;

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
    private Long id_dispositivo;

    @Column(nullable = false)
    private String nome_dispositivo;

    @Column
    private String localizacao;

    @Column(nullable = false)
    private String tipo_dispositivo;

    @Column
    @ManyToOne
    @JoinColumn(name = "id_dispositivo")
    private int gateway_pai_fk;

    public DispositivoModel(String nome_dispositivo, String localizacao, String tipo_dispositivo, int gateway_pai_fk) {
        this.nome_dispositivo = nome_dispositivo;
        this.localizacao = localizacao;
        this.tipo_dispositivo = tipo_dispositivo;
        this.gateway_pai_fk = gateway_pai_fk;
    }
}
