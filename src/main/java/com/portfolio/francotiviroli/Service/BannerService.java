package com.portfolio.francotiviroli.Service;

import com.portfolio.francotiviroli.Entity.Banner;
import com.portfolio.francotiviroli.Repository.RBanner;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BannerService {

    @Autowired
    RBanner repositorio;

    public List<Banner> list() {
        return repositorio.findAll();
    }

    public Optional<Banner> getOne(int id) {
        return repositorio.findById(id);
    }

    public Optional<Banner> getByNombreBanner(String nombreBanner) {
        return repositorio.findByNombreBanner(nombreBanner);
    }

    public void save(Banner banner) {
        repositorio.save(banner);
    }

    public void delete(int id) {
        repositorio.deleteById(id);
    }

    public boolean existsById(int id) {
        return repositorio.existsById(id);
    }

    public boolean existsByNombreBanner(String nombreBanner) {
        return repositorio.existsByNombreBanner(nombreBanner);
    }
}


