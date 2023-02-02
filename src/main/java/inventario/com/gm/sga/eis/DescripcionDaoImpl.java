/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.eis;

import inventario.com.gm.sga.domain.Descripcion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nicko
 */
@Stateless
public class DescripcionDaoImpl extends AbstractFacade<Descripcion> implements DescripcionDao {

    @PersistenceContext(unitName = "InventarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DescripcionDaoImpl() {
        super(Descripcion.class);
    }
    
}
