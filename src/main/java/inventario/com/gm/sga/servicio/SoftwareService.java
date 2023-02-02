/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventario.com.gm.sga.servicio;

import inventario.com.gm.sga.domain.Software;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nicko
 */
@Local
public interface SoftwareService {
    public List<Software> listarSoftware();
    
    public Software encontrarSoftwarePorId (Software software);
    
    public void registrarSoftware (Software software);
    
    public void modificarSoftware (Software software);
    
    public void eliminarSoftware (Software software);
}
