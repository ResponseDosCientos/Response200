 package co.gov.mintic.proyecto.gestion.Service;

 import org.springframework.beans.factory.annotation.Autowired;
 import co.gov.mintic.proyecto.gestion.entities.*;
 import org.springframework.stereotype.Service;
 import co.gov.mintic.proyecto.gestion.repository.IMovimientoRepository;


import java.util.List;
import java.util.Optional;

 @Service
 public class MovimientoDineroService implements IMovimientoDineroService {

     @Autowired
     private IMovimientoRepository movimientoRepository;

     @Override
     public MovimientoDinero findById(long id) {
         Optional<MovimientoDinero> movimientoDinero = movimientoRepository.findById((long) id);
         return movimientoDinero.get();
     }
     @Override
     public List<MovimientoDinero> findAll() {
         List<MovimientoDinero> movimientos = (List<MovimientoDinero>) movimientoRepository.findAll();
         return movimientos;
     }
     @Override
     public MovimientoDinero creatMovimiento(MovimientoDinero movimiento)  {
         return movimientoRepository.save(movimiento);
     }

     @Override
     public MovimientoDinero updateMovimiento(int id, MovimientoDinero movimiento)  {
         return movimientoRepository.save(movimiento);
     }
     @Override
     public void deletMovimiento(long id)  {
         movimientoRepository.deleteById((long)id);
     }
 }