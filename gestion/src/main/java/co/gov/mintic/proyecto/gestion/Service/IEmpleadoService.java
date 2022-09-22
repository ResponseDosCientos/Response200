package co.gov.mintic.proyecto.gestion.Service;

import co.gov.mintic.proyecto.gestion.entities.Empleado;

import java.util.List;

public interface IEmpleadoService {

    public Empleado findById(long id);
    public List<Empleado> findAll();
    public Empleado createEmpleado(Empleado empleado);
    public Empleado updateEmpleado(int id, Empleado empleado);
    public void deletEmpleado(long id);

}
