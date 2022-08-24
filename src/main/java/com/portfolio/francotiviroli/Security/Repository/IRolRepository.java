
package com.portfolio.francotiviroli.Security.Repository;

import com.portfolio.francotiviroli.Security.Entity.Rol;
import com.portfolio.francotiviroli.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
