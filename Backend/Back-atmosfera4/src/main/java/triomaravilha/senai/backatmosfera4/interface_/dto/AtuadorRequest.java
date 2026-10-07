package triomaravilha.senai.backatmosfera4.interface_.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AtuadorRequest {
    private String nomeAtuador;
    private int dispositivo;
    private boolean status;
    private LocalDateTime ultimoComando;
}
