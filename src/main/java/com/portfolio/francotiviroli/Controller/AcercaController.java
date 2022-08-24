
package com.portfolio.francotiviroli.Controller;

import com.portfolio.francotiviroli.Dto.AcercaDto;
import com.portfolio.francotiviroli.Entity.Acerca;
import com.portfolio.francotiviroli.Security.Controller.Mensaje;
import com.portfolio.francotiviroli.Service.AcercaService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/acerca")
@CrossOrigin(origins = "http://localhost:4200")
public class AcercaController {
    
    @Autowired
    AcercaService sAcerca;
    
  
    @GetMapping("/lista")
    public ResponseEntity<List<Acerca>> list(){
        List<Acerca> list = sAcerca.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        
        if(!sAcerca.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }

        
        sAcerca.delete(id);
        return new ResponseEntity(new Mensaje("Sección eliminada"), HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Acerca> getById(@PathVariable("id")int id){
        if(!sAcerca.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        Acerca acerca = sAcerca.getOne(id).get();
        return new ResponseEntity(acerca, HttpStatus.OK);

    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody AcercaDto dtoacerca){
        if(StringUtils.isBlank(dtoacerca.getTituloA())){
            return new ResponseEntity(new Mensaje("Indique el titulo"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoacerca.getSaludoA())){
            return new ResponseEntity(new Mensaje("Indique un saludo/titulo"), HttpStatus.BAD_REQUEST);
        }
        
        Acerca acerca = new Acerca(
                dtoacerca.getTituloA(), dtoacerca.getSaludoA(), dtoacerca.getDescripcionA(), dtoacerca.getImgA()
        );
        
        sAcerca.save(acerca);
        
        return new ResponseEntity(new Mensaje("Sección creada"), HttpStatus.OK);
                
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody AcercaDto dtoacerca){
        
        if(!sAcerca.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        if(StringUtils.isBlank(dtoacerca.getTituloA())){
            return new ResponseEntity(new Mensaje("Indique el titulo"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoacerca.getSaludoA())){
            return new ResponseEntity(new Mensaje("Indique un saludo/titulo"), HttpStatus.BAD_REQUEST);
        }
        
        if(StringUtils.isBlank(dtoacerca.getDescripcionA())){
            return new ResponseEntity(new Mensaje("Indique una descripción"), HttpStatus.BAD_REQUEST);
        }
        Acerca acerca = sAcerca.getOne(id).get();
        
        acerca.setTituloA(dtoacerca.getTituloA());
        acerca.setSaludoA(dtoacerca.getSaludoA());
        acerca.setDescripcionA(dtoacerca.getDescripcionA());
        acerca.setImgA(dtoacerca.getImgA());
        
       sAcerca.save(acerca);
        
       return new ResponseEntity(new Mensaje("Sección actualizada"), HttpStatus.OK);
    }
    
    

    
}
