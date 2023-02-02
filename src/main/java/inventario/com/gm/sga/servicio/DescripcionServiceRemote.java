/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventario.com.gm.sga.servicio;

import inventario.com.gm.sga.domain.Descripcion;
import java.util.List;
import javax.ejb.Remote;
/**
 *
 * @author nicko
 */
@Remote
public interface DescripcionServiceRemote {
    public List<Descripcion> listarDescripcion();
    
    public Descripcion encontrarDescripcionPorId (Descripcion descripcion);
    
    public void registrarDescripcion (Descripcion descripcion);
    
    public void modificarDescripcion (Descripcion descripcion);
    
    public void eliminarDescripcion (Descripcion descripcion);
}
