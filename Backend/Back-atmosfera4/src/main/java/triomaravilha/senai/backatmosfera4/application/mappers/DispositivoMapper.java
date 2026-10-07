package triomaravilha.senai.backatmosfera4.application.mappers;

import triomaravilha.senai.backatmosfera4.application.dto.DispositivoResponse;
import triomaravilha.senai.backatmosfera4.domain.entity.Dispositivo;
import triomaravilha.senai.backatmosfera4.infra.model.DispositivoModel;
import triomaravilha.senai.backatmosfera4.interface_.dto.DispositivoRequest;

public interface DispositivoMapper {
    public static DispositivoResponse mapper(DispositivoModel model) {
        if (model == null) return null;

        return new DispositivoResponse(
                model.getId_dispositivo(),
                model.getNome_dispositivo(),
                model.getLocalizacao(),
                model.getTipo_dispositivo(),
                model.getGateway_pai_fk()

        );
    }

    public static DispositivoModel mapper(DispositivoRequest request) {
        if (request == null) return null;

        return new DispositivoModel(
                request.nomeDispositivo(),
                request.localizacao(),
                request.tipoDispositivo(),
                request.gatewayPai()
        );
    }
}
