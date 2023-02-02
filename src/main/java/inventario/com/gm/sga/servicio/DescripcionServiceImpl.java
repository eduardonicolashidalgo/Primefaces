/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.servicio;

import inventario.com.gm.sga.domain.Descripcion;
import inventario.com.gm.sga.eis.DescripcionDao;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author nicko
 */
public class DescripcionServiceImpl implements DescripcionService{
    
    @Inject
    private DescripcionDao DescripcionDao;
    
    @Override
    public List<Descripcion> listarDescripcion(){
        return DescripcionDao.findAll();
    }
    
    @Override
    public Descripcion encontrarDescripcionPorId (Descripcion descripcion){
        return DescripcionDao.find(descripcion);
    }        
    
    @Override
    public void registrarDescripcion(Descripcion descripcion){
        DescripcionDao.create(descripcion);
    }
    
    @Override
    public void modificarDescripcion(Descripcion descripcion){
        DescripcionDao.edit(descripcion);
    }
    
    @Override
    public void eliminarDescripcion(Descripcion descripcion){
        DescripcionDao.remove(descripcion);
    }
    
}
