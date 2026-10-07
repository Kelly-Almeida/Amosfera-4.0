package triomaravilha.senai.backatmosfera4.interface_.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import triomaravilha.senai.backatmosfera4.application.mappers.RegistroMapper;
import triomaravilha.senai.backatmosfera4.infra.model.RegistroModel;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public record RegistroRequest(
     int dispositivo,
     Timestamp timestamp,
     LocalDateTime dataHora,
     float temperatura,
     float umidade,
     float pressao,
     float altitude,
     float luminosidade,
     float velVento,
     int direcaoVento,
     int intensidadeWifi
){

    public RegistroModel toModel() {
        return RegistroMapper.mapper(new RegistroRequest(
                dispositivo, timestamp,dataHora,temperatura,
                umidade, pressao, altitude, luminosidade,
                velVento, direcaoVento, intensidadeWifi));
    }
}
