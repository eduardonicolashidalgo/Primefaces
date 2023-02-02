/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.beans;

import inventario.com.gm.sga.domain.Valor;
import inventario.com.gm.sga.servicio.ValorService;
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

@Named("valorBean")
@RequestScoped
public class ValorBean {
    @Inject
    private ValorService valorService;
    
    private Valor valorSeleccionado;
    
    List<Valor> valor;
    
    public ValorBean(){        
    }
    
    @PostConstruct
    public void inicializar(){
        valor = valorService.listarValor();
        valorSeleccionado = new Valor();
    }
    
    public void editListener(RowEditEvent event){
        Valor valor = (Valor) event.getObject();
        valorService.modificarValor(valor);
    }
    
    public List<Valor> getValor(){
        return valor;
    }
    
    public void setValor (List<Valor> valor){
        this.valor = valor;
    }
    
    public Valor getValorSeleccionado(){
        return valorSeleccionado;
    }
    
    public void setValorSeleccionado(Valor valorSeleccionado){
        this.valorSeleccionado = valorSeleccionado;
    }
    
    public void reiniciarValorSeleccionado(){
        this.valorSeleccionado = new Valor();
    }
    
    public void agregarValor(){
        valorService.registrarValor(this.valorSeleccionado);
        this.valorSeleccionado = null;
    }
    
   public void eliminarValor(){
       valorService.eliminarValor(this.valorSeleccionado);
       this.valorSeleccionado = null;
   }
   
   public ValorService getValorService(){
       return valorService;
   }
   
   public void setValorService (ValorService valorService){
       this.valorService = valorService;
   }
}
