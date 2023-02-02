/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventario.com.gm.sga.eis;

import inventario.com.gm.sga.domain.Software;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nicko
 */
@Local
public interface SoftwareDao {

    void create(Software software);

    void edit(Software software);

    void remove(Software software);

    Software find(Object id);

    List<Software> findAll();

    List<Software> findRange(int[] range);

    int count();
    
}
