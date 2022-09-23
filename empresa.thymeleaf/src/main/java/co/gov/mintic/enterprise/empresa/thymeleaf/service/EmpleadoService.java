package co.gov.mintic.enterprise.empresa.thymeleaf.service;

import co.gov.mintic.enterprise.empresa.thymeleaf.entities.Empleado;
import co.gov.mintic.enterprise.empresa.thymeleaf.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    private IEmpleadoRepository empleadoRepository;

    @Override
    public Empleado findById(long id) {
        Optional<Empleado> empleado = empleadoRepository.findById((Long) id);
        return empleado.get();
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = (List<Empleado>) empleadoRepository.findAll();
        return empleados;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void deleteEmpleado(long id) {
        empleadoRepository.deleteById(id);
    }
}
