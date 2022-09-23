package co.gov.mintic.proyecto.gestion.repository;
import co.gov.mintic.proyecto.gestion.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface IProfileRepository extends CrudRepository<Profile, Long> {
}
