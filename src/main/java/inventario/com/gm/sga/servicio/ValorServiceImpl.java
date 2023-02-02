/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.servicio;

import inventario.com.gm.sga.domain.Valor;
import inventario.com.gm.sga.eis.ValorDao;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author nicko
 */
public class ValorServiceImpl implements ValorService{
    @Inject
    private ValorDao valorDao;
    
    @Override
    public List<Valor> listarValor(){
        return valorDao.findAll();
    }
    
    @Override
    public Valor encontrarValorPorId (Valor valor){
        return valorDao.find(valor);
    }        
    
    @Override
    public void registrarValor(Valor valor){
        valorDao.create(valor);
    }
    
    @Override
    public void modificarValor(Valor valor){
        valorDao.edit(valor);
    }
    
    @Override
    public void eliminarValor(Valor valor){
        valorDao.remove(valor);
    }
}
