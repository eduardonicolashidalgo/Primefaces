/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.beans;

import inventario.com.gm.sga.domain.Descripcion;
import inventario.com.gm.sga.servicio.DescripcionService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author nicko
 */

@Named("descripcionBean")
@RequestScoped
public class DescripcionBean {
    @Inject
    private DescripcionService descripcionService;
    
    private Descripcion descripcionSeleccionado;
    
    List<Descripcion> descripcion;
    
    public DescripcionBean(){        
    }
    
    @PostConstruct
    public void inicializar(){
        descripcion = descripcionService.listarDescripcion();
        descripcionSeleccionado = new Descripcion();
    }
    
    public void editListener(RowEditEvent event){
        Descripcion descripcion = (Descripcion) event.getObject();
        descripcionService.modificarDescripcion(descripcion);
    }
    
    public List<Descripcion> getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion (List<Descripcion> descripcion){
        this.descripcion = descripcion;
    }
    
    public Descripcion getDescripcionSeleccionado(){
        return descripcionSeleccionado;
    }
    
    public void setDescripcionSeleccionado(Descripcion descripcionSeleccionado){
        this.descripcionSeleccionado = descripcionSeleccionado;
    }
    
    public void reiniciarDescripcionSeleccionado(){
        this.descripcionSeleccionado = new Descripcion();
    }
    
    public void agregarDescripcion(){
        descripcionService.registrarDescripcion(this.descripcionSeleccionado);
        this.descripcionSeleccionado = null;
    }
    
   public void eliminarDescripcion(){
       descripcionService.eliminarDescripcion(this.descripcionSeleccionado);
       this.descripcionSeleccionado = null;
   }
   
   public DescripcionService getDescripcionService(){
       return descripcionService;
   }
   
   public void setDescripcionService (DescripcionService descripcionService){
       this.descripcionService = descripcionService;
   }
    
}
