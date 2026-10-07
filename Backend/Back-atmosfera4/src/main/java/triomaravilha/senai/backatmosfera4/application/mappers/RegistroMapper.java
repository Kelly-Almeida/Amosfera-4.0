package triomaravilha.senai.backatmosfera4.application.mappers;

import triomaravilha.senai.backatmosfera4.application.dto.RegistroResponse;
import triomaravilha.senai.backatmosfera4.infra.model.RegistroModel;
import triomaravilha.senai.backatmosfera4.interface_.dto.RegistroRequest;

public interface RegistroMapper {

    public static RegistroResponse mapper(RegistroModel model){
        return new RegistroResponse(
                model.getId(),
                model.getId_dispositivo_fk(),
                model.getTimestamp(),
                model.getData_hora(),
                model.getTemperatura(),
                model.getUmidade(),
                model.getPressao(),
                model.getAltitude(),
                model.getLuminosidade(),
                model.getVelocidade_vento(),
                model.getDirecao_vento(),
                model.getIntensidade_wifi()
        );
    }

    public static RegistroModel mapper(RegistroRequest request){
        return new RegistroModel(
                null,
                request.dispositivo(),
                request.timestamp(),
                request.dataHora(),
                request.temperatura(),
                request.umidade(),
                request.pressao(),
                request.altitude(),
                request.luminosidade(),
                request.velVento(),
                request.direcaoVento(),
                request.intensidadeWifi()
        );
    }
}
