package co.gov.mintic.proyecto.gestion.repository;

import co.gov.mintic.proyecto.gestion.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Long> {

    Empleado findByUsername(String username);

}
