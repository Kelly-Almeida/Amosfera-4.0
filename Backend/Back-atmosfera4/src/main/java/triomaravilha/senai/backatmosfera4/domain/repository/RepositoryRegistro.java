package triomaravilha.senai.backatmosfera4.domain.repository;


import triomaravilha.senai.backatmosfera4.application.dto.RegistroResponse;
import triomaravilha.senai.backatmosfera4.interface_.dto.RegistroRequest;

import java.util.List;

public interface RepositoryRegistro {
    RegistroResponse save(RegistroRequest atuador);
    RegistroResponse findyById(Long id);
    List<RegistroResponse> findAll();
    void deleteId(Long id);
}
