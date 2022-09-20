package co.gov.mintic.enterprise.empresa.thymeleaf.repository;

import co.gov.mintic.enterprise.empresa.thymeleaf.entities.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaRepository extends CrudRepository<Empresa, Long> {
}
