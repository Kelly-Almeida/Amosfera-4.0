package triomaravilha.senai.backatmosfera4.infra.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(
        name = "Atuadores"
)
public class AtuadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_atuador;

    @OneToMany(cascade = CascadeType.MERGE)
    @Column(nullable = false)
    private int id_dispositivo_fk;

    @Column(nullable = false)
    private String nome_atuador;

    @Column(nullable = true)
    private boolean status_atual;

    @Column(nullable = true)
    private LocalDateTime ultimo_comando;

    public boolean getStatus_atual() {return this.status_atual; }


     public AtuadorModel(int id_dispositivo_fk,String nome_atuador, boolean status_atual,LocalDateTime ultimo_comando) {
            this.id_dispositivo_fk = id_dispositivo_fk;
            this.nome_atuador = nome_atuador;
            this.status_atual = status_atual;
            this.ultimo_comando = ultimo_comando;
     }
}
