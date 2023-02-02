/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import inventario.com.gm.sga.domain.Accesorios;
import inventario.com.gm.sga.eis.AccesoriosDao;


@Stateless
public class AccesoriosServiceImpl implements AccesoriosService {
    
    @Inject
    private AccesoriosDao accesorioDao;
    
    @Override
    public List<Accesorios> listarAccesorios(){
        return accesorioDao.findAll();
    }
    
    @Override
    public Accesorios encontrarAccesorioPorId (Accesorios accesorio){
        return accesorioDao.find(accesorio);
    }        
    
    @Override
    public void registrarAccesorio(Accesorios accesorio){
        accesorioDao.create(accesorio);
    }
    
    @Override
    public void modificarAccesorio(Accesorios accesorio){
        accesorioDao.edit(accesorio);
    }
    
    @Override
    public void eliminarAccesorio(Accesorios accesorio){
        accesorioDao.remove(accesorio);
    }
    
}
