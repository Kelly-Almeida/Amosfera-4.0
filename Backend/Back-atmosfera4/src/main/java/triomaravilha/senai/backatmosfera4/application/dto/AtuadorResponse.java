package triomaravilha.senai.backatmosfera4.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import triomaravilha.senai.backatmosfera4.domain.entity.Atuador;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AtuadorResponse {
    private Long id;
    private String nomeAtuador;
    private int dispositivo;
    private boolean status;
    private LocalDateTime ultimoComando;

    public static AtuadorResponse fromEntity(AtuadorEntity entity) {
        return new AtuadorMapper.mappper(entity);
    }
}
