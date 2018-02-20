package ar.com.mauro.system.carga.service;

import ar.com.mauro.system.carga.model.Movimientos;
import ar.com.mauro.system.carga.repository.MovimientosRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("movimientosService")
public class MovimientosService {

    private MovimientosRepository movimientosRepository;

    @Autowired
    public MovimientosService(MovimientosRepository movimientosRepository) {
        this.movimientosRepository = movimientosRepository;
    }
    
    public Collection<Movimientos> obtenerTodosLosMovimientos(){
        return movimientosRepository.findAll();
    }

}
