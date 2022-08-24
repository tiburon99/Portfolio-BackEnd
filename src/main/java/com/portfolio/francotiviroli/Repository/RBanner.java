
package com.portfolio.francotiviroli.Repository;

import com.portfolio.francotiviroli.Entity.Banner;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RBanner extends JpaRepository<Banner, Integer>{
    
    public Optional<Banner> findByNombreBanner(String nombreBanner);
    public boolean existsByNombreBanner(String nombreBanner);

    
}
