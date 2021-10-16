package co.usa.recursohumanog35.recursohumanog35.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursohumanog35.recursohumanog35.repository.crud.DepartamentoCrudRepositorio;
import co.usa.recursohumanog35.recursohumanog35.model.Departamento;

@Repository
public class DepartamentoRepositorio {

    @Autowired
    DepartamentoCrudRepositorio departamentoCrudRepositorio;

    public List<Departamento>getAll(){
        return (List<Departamento>)departamentoCrudRepositorio.findAll();
    }

    public Optional<Departamento>getDepartamento(int id){
        return departamentoCrudRepositorio.findById(id);
    }

    public Departamento save(Departamento dpto){
        return departamentoCrudRepositorio.save(dpto);
    }




    
    
}
