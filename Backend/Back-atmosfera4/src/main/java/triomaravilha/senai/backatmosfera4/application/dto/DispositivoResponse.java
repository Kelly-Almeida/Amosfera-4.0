package triomaravilha.senai.backatmosfera4.application.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import triomaravilha.senai.backatmosfera4.application.mappers.DispositivoMapper;
import triomaravilha.senai.backatmosfera4.domain.entity.Dispositivo;
import triomaravilha.senai.backatmosfera4.infra.model.DispositivoModel;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DispositivoResponse {
    private Long id;
    private String nomeDispositivo;
    private String localizacao;
    private String tipoDispositivo;
    private int gatewayPai;

    public DispositivoResponse fromModel(DispositivoModel model) {
        return DispositivoMapper.mapper(model);
    }
}
