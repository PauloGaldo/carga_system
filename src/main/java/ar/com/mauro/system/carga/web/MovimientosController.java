package ar.com.mauro.system.carga.web;

import ar.com.mauro.system.carga.model.Movimientos;
import ar.com.mauro.system.carga.service.MovimientosService;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("web/operaciones/movimientos")
public class MovimientosController {

    private MovimientosService movimientosService;

    @Autowired
    public MovimientosController(MovimientosService movimientosService) {
        this.movimientosService = movimientosService;
    }    

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity todosLosMovimientos() {
        Collection<Movimientos> movimientos = movimientosService.obtenerTodosLosMovimientos();
        return new ResponseEntity(movimientos, HttpStatus.OK);
    }

}
