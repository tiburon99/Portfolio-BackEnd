package com.portfolio.francotiviroli.Controller;

import com.portfolio.francotiviroli.Entity.Persona;
import com.portfolio.francotiviroli.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired
    IPersonaService ip;


        @GetMapping("/personas/listar")
        public List<Persona> getPersonas() {

            return ip.getPersonas();
        }

        //castea el long 1 porque es el ID mio 
        @GetMapping("/personas/listar/perfil")
        public Persona getPersona() {
            return ip.getPersona((long) 1);
        }
        
        @PreAuthorize("hasRole('ADMIN')")
        @PostMapping("/personas/guardar")
        public String savePersona(@RequestBody Persona per) {
            ip.savePersona(per);
            return "Proceso exitoso.";
        }
        
        @PreAuthorize("hasRole('ADMIN')")
        @DeleteMapping("/personas/eliminar/{id}")
        public String deletePersona(@PathVariable Long id) {
            ip.deletePersona(id);
            return "Proceso exitoso";
        }
        
        @PreAuthorize("hasRole('ADMIN')")
        @PutMapping("/personas/editar/{id}")
        public Persona editPersona(@PathVariable Long id,
                @RequestParam("nombre") String nuevoNombre,
                @RequestParam("apellido") String nuevoApellido,
                @RequestParam("img") String nuevoImg
        ) {
            Persona per = ip.getPersona(id);
            per.setNombre(nuevoNombre);
            per.setApellido(nuevoApellido);
            per.setImg(nuevoImg);
            ip.savePersona(per);

            return per;
        }

    }

