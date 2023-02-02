/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.beans;

import inventario.com.gm.sga.domain.General;
import inventario.com.gm.sga.servicio.GeneralService;
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

@Named("generalBean")
@RequestScoped
public class GeneralBean {
    @Inject
    private GeneralService generalService;
    
    private General generalSeleccionado;
    
    List<General> general;
    
    public GeneralBean(){        
    }
    
    @PostConstruct
    public void inicializar(){
        general = generalService.listarGeneral();
        generalSeleccionado = new General();
    }
    
    public void editListener(RowEditEvent event){
        General general = (General) event.getObject();
        generalService.modificarGeneral(general);
    }
    
    public List<General> getGeneral(){
        return general;
    }
    
    public void setGeneral (List<General> general){
        this.general = general;
    }
    
    public General getGeneralSeleccionado(){
        return generalSeleccionado;
    }
    
    public void setGeneralSeleccionado(General generalSeleccionado){
        this.generalSeleccionado = generalSeleccionado;
    }
    
    public void reiniciarGeneralSeleccionado(){
        this.generalSeleccionado = new General();
    }
    
    public void agregarGeneral(){
        generalService.registrarGeneral(this.generalSeleccionado);
        this.generalSeleccionado = null;
    }
    
   public void eliminarGeneral(){
       generalService.eliminarGeneral(this.generalSeleccionado);
       this.generalSeleccionado = null;
   }
   
   public GeneralService getGeneralService(){
       return generalService;
   }
   
   public void setGeneralService (GeneralService generalService){
       this.generalService = generalService;
   }
    
}
