package co.gov.mintic.proyecto.gestion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import co.gov.mintic.proyecto.gestion.entities.Empleado;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import co.gov.mintic.proyecto.gestion.repository.IEmpleadoRepository;


import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    private IEmpleadoRepository empleadoRepository;

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Override
    public Empleado findById(long id) {
        Optional<Empleado> empleado = empleadoRepository.findById((long) id);
        return empleado.get();
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = (List<Empleado>) empleadoRepository.findAll();
        return empleados;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        String pass = empleado.getClave();
        String passEncrip = passwordEncoder.encode(pass);

        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(int id, Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void deletEmpleado(long id) {
        empleadoRepository.deleteById((long)id);
    }


}
