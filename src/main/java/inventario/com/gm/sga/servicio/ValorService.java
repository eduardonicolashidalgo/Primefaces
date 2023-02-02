/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventario.com.gm.sga.servicio;

import inventario.com.gm.sga.domain.Valor;
import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author nicko
 */
@Local
public interface ValorService {
    public List<Valor> listarValor();
    
    public Valor encontrarValorPorId (Valor valor);
    
    public void registrarValor (Valor valor);
    
    public void modificarValor (Valor valor);
    
    public void eliminarValor (Valor valor);
}
