package co.gov.mintic.proyecto.gestion.service;

import co.gov.mintic.proyecto.gestion.entities.Empleado;

import java.util.List;

public interface IEmpleadoService {
    public Empleado findById(long id);

    public List<Empleado> findAll();

    public Empleado createEmpleado(Empleado empleado);

    public Empleado updateEmpleado(Empleado empleado);

    public void deleteEmpleado(long id);

}
