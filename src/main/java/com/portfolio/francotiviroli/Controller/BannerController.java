
package com.portfolio.francotiviroli.Controller;

import com.portfolio.francotiviroli.Dto.BannerDto;
import com.portfolio.francotiviroli.Entity.Banner;
import com.portfolio.francotiviroli.Security.Controller.Mensaje;
import com.portfolio.francotiviroli.Service.BannerService;
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
@RequestMapping("/banner")
@CrossOrigin(origins = "http://localhost:4200")
public class BannerController {
    
    @Autowired
    BannerService sBanner;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Banner>> list(){
        List<Banner> list = sBanner.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Banner> getById(@PathVariable("id")int id){
        if(!sBanner.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        Banner banner = sBanner.getOne(id).get();
        return new ResponseEntity(banner, HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sBanner.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sBanner.delete(id);
        return new ResponseEntity(new Mensaje("Información eliminada"), HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody BannerDto dtoBanner){
        if(StringUtils.isBlank(dtoBanner.getNombreBanner())){
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        
        if(StringUtils.isBlank(dtoBanner.getUbicacionBanner())){
            return new ResponseEntity(new Mensaje("La ubicación es obligatoria"), HttpStatus.BAD_REQUEST);
        }
        
        
        Banner banner = new Banner(
                dtoBanner.getNombreBanner(), dtoBanner.getUbicacionBanner());
        sBanner.save(banner);
        return new ResponseEntity(new Mensaje("Banner creado"), HttpStatus.OK);
                
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody BannerDto dtoBanner){
        if(!sBanner.existsById(id)){
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(sBanner.existsByNombreBanner(dtoBanner.getNombreBanner()) && sBanner.getByNombreBanner(dtoBanner.getNombreBanner()).get().getId() != id){
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoBanner.getNombreBanner())){
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        
        
        
        Banner banner = sBanner.getOne(id).get();
        
        banner.setNombreBanner(dtoBanner.getNombreBanner());
        banner.setUbicacionBanner(dtoBanner.getUbicacionBanner());
        
        sBanner.save(banner);
        
        return new ResponseEntity(new Mensaje("Banner actualizado"), HttpStatus.OK);
    }



    
}