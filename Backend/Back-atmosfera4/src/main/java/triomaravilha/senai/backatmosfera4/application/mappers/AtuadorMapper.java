package triomaravilha.senai.backatmosfera4.application.mappers;

import triomaravilha.senai.backatmosfera4.application.dto.AtuadorResponse;
import triomaravilha.senai.backatmosfera4.interface_.dto.AtuadorRequest;

public interface AtuadorMapper {
    public static AtuadorResponse mapper(AtuadorModel model){
        if (model == null) return null;

        return new AtuadorResponse(
                model.getId(),
                model.getNomeAtuador(),
                model.getDispositivo(),
                model.getStatus,
                model.getUltimoComando()
        );
    }
z
    public static AtuadorModel mapper(AtuadorRequest request){
        if (request == null) return null;

        return new AtuadorModel(
            null,
            request.getNomeAtuador(),
            request.getDispositivo(),
            request.getStatus(),
            request.getUltimoComando()

        );
    }

}
