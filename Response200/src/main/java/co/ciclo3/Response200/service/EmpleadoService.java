package co.ciclo3.Response200.service;

import co.ciclo3.Response200.entity.Empleado;
<<<<<<< HEAD
=======

import co.ciclo3.Response200.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
>>>>>>> cd7278eebb3a1a9a2877b78b0985b7f7791e80f4

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    private IEmpleadoRepository empleadoRepository;

    @Override
    public Empleado findById(long id) {
<<<<<<< HEAD
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(id);
        empleado.setNombreEmpleado("Carlos");
        empleado.setEmailEmpleado("carlos@nose.com");
        empleado.setEmpresa("Claro");
        //empleado.setRol("Operario");
        return empleado;
=======
        Optional<Empleado> empleado = empleadoRepository.findById((Long) id);
        return empleado.get();
>>>>>>> cd7278eebb3a1a9a2877b78b0985b7f7791e80f4
    }

    @Override
    public List<Empleado> findAll() {
<<<<<<< HEAD
        List<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setNombreEmpleado("Carlos");
        empleado1.setEmailEmpleado("carlos@nose.com");
        empleado1.setEmpresa("Claro");
        //empleado1.setRol("Operario");
        empleados.add(empleado1);
        Empleado empleado2 = new Empleado();
        empleado2.setIdEmpleado(2);
        empleado2.setNombreEmpleado("Oscar");
        empleado2.setEmailEmpleado("oscar@nose.com");
        empleado2.setEmpresa("Movistar");
        //empleado2.setRol("Operario");
        empleados.add(empleado2);
=======
        List<Empleado> empleados = (List<Empleado>) empleadoRepository.findAll();
>>>>>>> cd7278eebb3a1a9a2877b78b0985b7f7791e80f4
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
