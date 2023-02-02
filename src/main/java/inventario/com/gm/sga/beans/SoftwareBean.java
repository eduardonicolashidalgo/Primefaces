/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.beans;

import inventario.com.gm.sga.domain.Software;
import inventario.com.gm.sga.servicio.SoftwareService;
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
@Named("softwareBean")
@RequestScoped
public class SoftwareBean {
    @Inject
    private SoftwareService softwareService;
    
    private Software softwareSeleccionado;
    
    List<Software> software;
    
    public SoftwareBean(){        
    }
    
    @PostConstruct
    public void inicializar(){
        software = softwareService.listarSoftware();
        softwareSeleccionado = new Software();
    }
    
    public void editListener(RowEditEvent event){
        Software software = (Software) event.getObject();
        softwareService.modificarSoftware(software);
    }
    
    public List<Software> getSoftware(){
        return software;
    }
    
    public void setSoftware (List<Software> software){
        this.software = software;
    }
    
    public Software getSoftwareSeleccionado(){
        return softwareSeleccionado;
    }
    
    public void setSoftwareSeleccionado(Software softwareSeleccionado){
        this.softwareSeleccionado = softwareSeleccionado;
    }
    
    public void reiniciarSoftwareSeleccionado(){
        this.softwareSeleccionado = new Software();
    }
    
    public void agregarSoftware(){
        softwareService.registrarSoftware(this.softwareSeleccionado);
        this.softwareSeleccionado = null;
    }
    
   public void eliminarSoftware(){
       softwareService.eliminarSoftware(this.softwareSeleccionado);
       this.softwareSeleccionado = null;
   }
   
   public SoftwareService getSoftwareService(){
       return softwareService;
   }
   
   public void setSoftwareService (SoftwareService softwareService){
       this.softwareService = softwareService;
   }
}
