package triomaravilha.senai.atmosfera_4_0.domain.repository;

import triomaravilha.senai.atmosfera_4_0.application.dto.AtuadorResponse;
import triomaravilha.senai.atmosfera_4_0.interface_.dto.AtuadorRequest;

import java.util.List;

public interface RepositoryAtuador {
    AtuadorResponse save(AtuadorRequest atuador);
    AtuadorResponse findyById(int id);
    List<AtuadorResponse> findAll();
    void deleteId(int id);
    //List<AtuadorResponse> findByName(String name);
}
