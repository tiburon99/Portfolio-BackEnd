package com.portfolio.francotiviroli.Service;

import com.portfolio.francotiviroli.Entity.Acerca;
import com.portfolio.francotiviroli.Repository.RAcerca;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AcercaService {

    @Autowired
    RAcerca repositorio;

    public List<Acerca> list() {
        return repositorio.findAll();
    }

    //guardar
    public void save(Acerca acerca) {
        repositorio.save(acerca);
    }

    //borrar
    public void delete(int id) {
        repositorio.deleteById(id);
    }

    public Optional<Acerca> getOne(int id) {
        return repositorio.findById(id);
    }

    public boolean existsById(int id) {
        return repositorio.existsById(id);
    }

}
