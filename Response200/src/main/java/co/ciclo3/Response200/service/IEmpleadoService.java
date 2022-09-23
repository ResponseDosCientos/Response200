package co.ciclo3.Response200.service;

import co.ciclo3.Response200.entity.Empleado;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IEmpleadoService {
    public Empleado findById(long id);

    public List<Empleado> findAll();

    public Empleado createEmpleado(Empleado empleado);

    public Empleado updateEmpleado(Empleado empleado);

    public void deleteEmpleado(long id);

}
