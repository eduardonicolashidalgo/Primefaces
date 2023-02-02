/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.servicio;

import inventario.com.gm.sga.domain.General;
import inventario.com.gm.sga.eis.GeneralDao;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author nicko
 */
public class GeneralServiceImpl implements GeneralService{
    @Inject
    private GeneralDao generalDao;
    
    @Override
    public List<General> listarGeneral(){
        return generalDao.findAll();
    }
    
    @Override
    public General encontrarGeneralPorId (General general){
        return generalDao.find(general);
    }        
    
    @Override
    public void registrarGeneral(General general){
        generalDao.create(general);
    }
    
    @Override
    public void modificarGeneral(General general){
        generalDao.edit(general);
    }
    
    @Override
    public void eliminarGeneral(General general){
        generalDao.remove(general);
    }
}
