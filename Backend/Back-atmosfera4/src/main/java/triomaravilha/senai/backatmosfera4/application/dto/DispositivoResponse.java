package triomaravilha.senai.backatmosfera4.application.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}
