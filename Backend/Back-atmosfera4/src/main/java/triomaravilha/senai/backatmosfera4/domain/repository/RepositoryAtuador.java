package triomaravilha.senai.backatmosfera4.domain.repository;

import triomaravilha.senai.backatmosfera4.application.dto.AtuadorResponse;
import triomaravilha.senai.backatmosfera4.interface_.dto.AtuadorRequest;

import java.util.List;

public interface RepositoryAtuador {
    AtuadorResponse save(AtuadorRequest atuador);
    AtuadorResponse findyById(Long id);
    List<AtuadorResponse> findAll();
    void deleteId(Long id);
    //List<AtuadorResponse> findByName(String name);
}
