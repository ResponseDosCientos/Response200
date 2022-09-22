 package co.gov.mintic.proyecto.gestion.Service;

 import co.gov.mintic.proyecto.gestion.entities.MovimientoDinero;

 import java.util.List;

 public interface IMovimientoDineroService {

     public MovimientoDinero findById(long id);
     public List<MovimientoDinero> findAll();
     public MovimientoDinero creatMovimiento(MovimientoDinero movimiento);
     public MovimientoDinero updateMovimiento(int id, MovimientoDinero movimiento);
     public void deletMovimiento(long id);
 }
