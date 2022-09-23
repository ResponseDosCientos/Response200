 package co.gov.mintic.proyecto.gestion.repository;

 import org.springframework.data.repository.CrudRepository;
 import co.gov.mintic.proyecto.gestion.entities.MovimientoDinero;

 public interface IMovimientoRepository extends CrudRepository<MovimientoDinero, Long> {
 }
