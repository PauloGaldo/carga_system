package ar.com.mauro.system.carga.repository;

import ar.com.mauro.system.carga.model.Movimientos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("movimientosRepository")
public interface MovimientosRepository extends JpaRepository<Movimientos, Integer> {
    
}
