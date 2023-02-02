/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventario.com.gm.sga.eis;

import inventario.com.gm.sga.domain.Accesorios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nicko
 */
@Local
public interface AccesoriosDao {

    void create(Accesorios accesorios);

    void edit(Accesorios accesorios);

    void remove(Accesorios accesorios);

    Accesorios find(Object id);

    List<Accesorios> findAll();

    List<Accesorios> findRange(int[] range);

    //int count();
    
}
