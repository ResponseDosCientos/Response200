package co.ciclo3.Response200.service;

import co.ciclo3.Response200.entity.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoService implements IEmpleadoService{


    @Override
    public Empleado findById(long id) {
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(id);
        empleado.setNombreEmpleado("Carlos");
        empleado.setEmailEmpleado("carlos@nose.com");
        empleado.setEmpresa("Claro");
        //empleado.setRol("Operario");
        return empleado;
    }

    @Override
    public List<Empleado> findAll() {
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
        return empleados;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        Empleado newEmpleado = new Empleado();
        newEmpleado.setIdEmpleado(empleado.getIdEmpleado());
        newEmpleado.setNombreEmpleado(empleado.getNombreEmpleado());
        newEmpleado.setEmailEmpleado(empleado.getEmailEmpleado());
        newEmpleado.setEmpresa(empleado.getEmpresa());
        newEmpleado.setRol(empleado.getRol());
        return newEmpleado;
    }

    @Override
    public Empleado updateEmpleado(long id, Empleado empleado) {
        Empleado putEmpleado = findById(id);
        putEmpleado.setIdEmpleado(empleado.getIdEmpleado());
        putEmpleado.setNombreEmpleado(empleado.getNombreEmpleado());
        putEmpleado.setEmailEmpleado(empleado.getEmailEmpleado());
        putEmpleado.setEmpresa(empleado.getEmpresa());
        putEmpleado.setRol(empleado.getRol());
        return putEmpleado;
    }

    @Override
    public void deleteEmpleado(long id) {
        Empleado deleteEmpleado = findById(id);

    }
}
