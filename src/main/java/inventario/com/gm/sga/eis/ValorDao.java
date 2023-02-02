/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventario.com.gm.sga.eis;

import inventario.com.gm.sga.domain.Valor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nicko
 */
@Local
public interface ValorDao {

    void create(Valor valor);

    void edit(Valor valor);

    void remove(Valor valor);

    Valor find(Object id);

    List<Valor> findAll();

    List<Valor> findRange(int[] range);

    int count();
    
}
