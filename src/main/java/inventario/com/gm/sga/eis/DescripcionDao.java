/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventario.com.gm.sga.eis;

import inventario.com.gm.sga.domain.Descripcion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nicko
 */
@Local
public interface DescripcionDao {

    void create(Descripcion descripcion);

    void edit(Descripcion descripcion);

    void remove(Descripcion descripcion);

    Descripcion find(Object id);

    List<Descripcion> findAll();

    List<Descripcion> findRange(int[] range);

    int count();
    
}
