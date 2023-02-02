/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventario.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import inventario.com.gm.sga.domain.Accesorios;

@Local
public interface AccesoriosService {
    
    public List<Accesorios> listarAccesorios();
    
    public Accesorios encontrarAccesorioPorId (Accesorios accesorio);
    
    public void registrarAccesorio (Accesorios accesorio);
    
    public void modificarAccesorio (Accesorios accesorio);
    
    public void eliminarAccesorio (Accesorios accesorio);
}
