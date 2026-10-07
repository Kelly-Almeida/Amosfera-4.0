package triomaravilha.senai.backatmosfera4.interface_.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import triomaravilha.senai.backatmosfera4.application.dto.AtuadorResponse;
import triomaravilha.senai.backatmosfera4.application.mappers.AtuadorMapper;
import triomaravilha.senai.backatmosfera4.domain.entity.Atuador;
import triomaravilha.senai.backatmosfera4.infra.model.AtuadorModel;

import java.time.LocalDateTime;

public record AtuadorRequest (
        String nomeAtuador,
        int dispositivo,
        boolean status,
        LocalDateTime ultimoComando
){
    public AtuadorModel toModel(){
        return AtuadorMapper.mapper(new AtuadorRequest(nomeAtuador, dispositivo, status, ultimoComando));
    }

}
