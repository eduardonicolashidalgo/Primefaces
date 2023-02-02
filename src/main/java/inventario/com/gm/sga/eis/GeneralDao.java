/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventario.com.gm.sga.eis;

import inventario.com.gm.sga.domain.General;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nicko
 */
@Local
public interface GeneralDao {

    void create(General general);

    void edit(General general);

    void remove(General general);

    General find(Object id);

    List<General> findAll();

    List<General> findRange(int[] range);

    int count();
    
}
