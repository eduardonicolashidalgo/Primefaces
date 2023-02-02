/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.servicio;

import inventario.com.gm.sga.domain.Software;
import inventario.com.gm.sga.eis.SoftwareDao;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author nicko
 */
public class SoftwareServiceImpl implements SoftwareService{
    @Inject
    private SoftwareDao softwareDao;
    
    @Override
    public List<Software> listarSoftware(){
        return softwareDao.findAll();
    }
    
    @Override
    public Software encontrarSoftwarePorId (Software software){
        return softwareDao.find(software);
    }        
    
    @Override
    public void registrarSoftware(Software software){
        softwareDao.create(software);
    }
    
    @Override
    public void modificarSoftware(Software software){
        softwareDao.edit(software);
    }
    
    @Override
    public void eliminarSoftware(Software software){
        softwareDao.remove(software);
    }
}
