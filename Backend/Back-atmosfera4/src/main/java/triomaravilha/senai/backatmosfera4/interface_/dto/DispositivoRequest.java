package triomaravilha.senai.backatmosfera4.interface_.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import triomaravilha.senai.backatmosfera4.application.mappers.DispositivoMapper;
import triomaravilha.senai.backatmosfera4.infra.model.DispositivoModel;


public record DispositivoRequest (
        String nomeDispositivo,
        String localizacao,
        String tipoDispositivo,
        int gatewayPai
){

    public DispositivoModel toModel() {
        return DispositivoMapper.mapper(new DispositivoRequest(
                nomeDispositivo, localizacao, tipoDispositivo, gatewayPai
        ));
    }
}
