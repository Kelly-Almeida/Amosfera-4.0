package triomaravilha.senai.backatmosfera4.interface_.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DispositivoRequest {
    private String nomeDispositivo;
    private String localizacao;
    private String tipoDispositivo;
    private int gatewayPai;
}
