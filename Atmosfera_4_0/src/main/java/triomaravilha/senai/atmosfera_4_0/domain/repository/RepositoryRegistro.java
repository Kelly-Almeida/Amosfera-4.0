package triomaravilha.senai.atmosfera_4_0.domain.repository;


import triomaravilha.senai.atmosfera_4_0.application.dto.RegistroResponse;
import triomaravilha.senai.atmosfera_4_0.interface_.dto.RegistroRequest;

import java.util.List;

public interface RepositoryRegistro {
    RegistroResponse save(RegistroRequest atuador);
    RegistroResponse findyById(Long id);
    List<RegistroResponse> findAll();
    void deleteId(Long id);
}
