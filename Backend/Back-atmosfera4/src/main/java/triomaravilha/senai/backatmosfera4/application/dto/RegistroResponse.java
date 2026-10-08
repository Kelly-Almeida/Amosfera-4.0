package triomaravilha.senai.backatmosfera4.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import triomaravilha.senai.backatmosfera4.application.mappers.RegistroMapper;
import triomaravilha.senai.backatmosfera4.domain.entity.Registro;
import triomaravilha.senai.backatmosfera4.infra.model.RegistroModel;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegistroResponse {
    private Long id;
    private int dispositivo;
    private Timestamp timestamp;
    private LocalDateTime dataHora;
    private float temperatura;
    private float umidade;
    private float pressao;
    private float altitude;
    private float luminosidade;
    private float velVento;
    private int direcaoVento;
    private int intensidadeWifi;

    public RegistroResponse fromModel(RegistroModel registro) {
        return RegistroMapper.mapper(registro);
    }
}
