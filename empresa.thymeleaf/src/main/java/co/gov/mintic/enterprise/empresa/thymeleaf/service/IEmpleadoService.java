package co.gov.mintic.enterprise.empresa.thymeleaf.service;

import co.gov.mintic.enterprise.empresa.thymeleaf.entities.Empleado;

import java.util.List;

public interface IEmpleadoService {
    public Empleado findById(long id);

    public List<Empleado> findAll();

    public Empleado createEmpleado(Empleado empleado);

    public Empleado updateEmpleado(Empleado empleado);

    public void deleteEmpleado(long id);

}
