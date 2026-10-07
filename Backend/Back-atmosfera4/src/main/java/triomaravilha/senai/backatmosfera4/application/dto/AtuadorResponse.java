package triomaravilha.senai.backatmosfera4.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import triomaravilha.senai.backatmosfera4.application.mappers.AtuadorMapper;
import triomaravilha.senai.backatmosfera4.domain.entity.Atuador;
import triomaravilha.senai.backatmosfera4.infra.model.AtuadorModel;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AtuadorResponse {
    private int id;
    private String nomeAtuador;
    private int dispositivo;
    private boolean status;
    private LocalDateTime ultimoComando;

    public static AtuadorResponse fromModel(AtuadorModel model) {
        return AtuadorMapper.mapper(model);
    }
}
