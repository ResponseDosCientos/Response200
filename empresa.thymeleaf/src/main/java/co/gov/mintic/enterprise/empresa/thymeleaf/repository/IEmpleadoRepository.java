package co.gov.mintic.enterprise.empresa.thymeleaf.repository;

import co.gov.mintic.enterprise.empresa.thymeleaf.entities.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {

}
