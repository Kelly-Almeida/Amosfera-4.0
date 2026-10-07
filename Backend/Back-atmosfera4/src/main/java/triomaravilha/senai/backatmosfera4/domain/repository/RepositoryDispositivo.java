package triomaravilha.senai.backatmosfera4.domain.repository;

import triomaravilha.senai.backatmosfera4.application.dto.DispositivoResponse;
import triomaravilha.senai.backatmosfera4.interface_.dto.DispositivoRequest;

import java.util.List;

public interface RepositoryDispositivo {
    DispositivoResponse save(DispositivoRequest dispositivo);
    DispositivoResponse findById(Long id);
    List<DispositivoResponse> findAll();
    void deleteById(Long id);
}
