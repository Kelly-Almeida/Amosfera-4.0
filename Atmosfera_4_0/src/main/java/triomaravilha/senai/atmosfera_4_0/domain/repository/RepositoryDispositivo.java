package triomaravilha.senai.atmosfera_4_0.domain.repository;

import triomaravilha.senai.atmosfera_4_0.application.dto.DispositivoResponse;
import triomaravilha.senai.atmosfera_4_0.interface_.dto.DispositivoRequest;

import java.util.List;

public interface RepositoryDispositivo {
    DispositivoResponse save(DispositivoRequest dispositivo);
    DispositivoResponse findById(int id);
    List<DispositivoResponse> findAll();
    void deleteById(int id);
}
