
package com.portfolio.francotiviroli.Interface;

import com.portfolio.francotiviroli.Entity.Persona;
import java.util.List;


public interface IPersonaService {
   
    public List<Persona> getPersonas();
    public Persona getPersona(Long id);
    public void savePersona(Persona per);
    public void deletePersona(Long id);
}
