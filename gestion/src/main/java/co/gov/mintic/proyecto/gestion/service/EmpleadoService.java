package co.gov.mintic.proyecto.gestion.service;

import co.gov.mintic.proyecto.gestion.entities.Empleado;
import co.gov.mintic.proyecto.gestion.repository.IEmpleadoRepository;
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
