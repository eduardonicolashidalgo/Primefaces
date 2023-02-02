/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import inventario.com.gm.sga.domain.Accesorios;
import inventario.com.gm.sga.servicio.AccesoriosService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author nicko
 */
@Named("accesoriosBean")
@RequestScoped
public class AccesoriosBean {
    
    @Inject
    private AccesoriosService accesorioService;
    
    private Accesorios accesorioSeleccionado;
    
    List<Accesorios> accesorios;
    
    public AccesoriosBean(){        
    }
    
    @PostConstruct
    public void inicializar(){
        accesorios = accesorioService.listarAccesorios();
        accesorioSeleccionado = new Accesorios();
    }
    
    public void editListener(RowEditEvent event){
        Accesorios accesorio = (Accesorios) event.getObject();
        accesorioService.modificarAccesorio(accesorio);
    }
    
    public List<Accesorios> getAccesorios(){
        return accesorios;
    }
    
    public void setAccesorios (List<Accesorios> accesorios){
        this.accesorios = accesorios;
    }
    
    public Accesorios getAccesoriosSeleccionado(){
        return accesorioSeleccionado;
    }
    
    public void setAccesorioSeleccionado(Accesorios accesoriosSeleccionado){
        this.accesorioSeleccionado = accesoriosSeleccionado;
    }
    
    public void reiniciarAccesoriosSeleccionado(){
        this.accesorioSeleccionado = new Accesorios();
    }
    
    public void agregarAccesorios(){
        accesorioService.registrarAccesorio(this.accesorioSeleccionado);
        this.accesorioSeleccionado = null;
    }
    
   public void eliminarAccesorios(){
       accesorioService.eliminarAccesorio(this.accesorioSeleccionado);
       this.accesorioSeleccionado = null;
   }
   
   public AccesoriosService getAccesoriosService(){
       return accesorioService;
   }
   
   public void setAccesoriosService (AccesoriosService accesoriosService){
       this.accesorioService = accesoriosService;
   }
    
}
