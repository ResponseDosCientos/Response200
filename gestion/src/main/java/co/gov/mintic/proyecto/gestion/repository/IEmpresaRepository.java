package co.gov.mintic.proyecto.gestion.repository;

import co.gov.mintic.proyecto.gestion.entities.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaRepository extends CrudRepository<Empresa, Long> {
}
