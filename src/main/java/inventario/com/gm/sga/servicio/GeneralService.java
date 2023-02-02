/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventario.com.gm.sga.servicio;
import inventario.com.gm.sga.domain.General;
import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author nicko
 */
@Local
public interface GeneralService {
    public List<General> listarGeneral();
    
    public General encontrarGeneralPorId (General general);
    
    public void registrarGeneral (General general);
    
    public void modificarGeneral (General general);
    
    public void eliminarGeneral (General general);
}
