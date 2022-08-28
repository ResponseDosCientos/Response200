package co.ciclo3.Response200.controller;

import co.ciclo3.Response200.entity.Empleado;
import co.ciclo3.Response200.entity.Empleado;
import co.ciclo3.Response200.entity.Empleado;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    /*
    @GetMapping("/empleado/{id}")
    public Empleado findById(@PathVariable long id) {
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(id);
        empleado.setNombreEmpleado("Carlos");
        empleado.setEmailEmpleado("carlos@nose.com");
        empleado.setEmpresa("Claro");
        empleado.setRol("Operario");
        return empleado;
    }

    @GetMapping("/empleado")
    public List<Empleado> finAll(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado();
        empleado1.setIdEmpleado(1);
        empleado1.setNombreEmpleado("Carlos");
        empleado1.setEmailEmpleado("carlos@nose.com");
        empleado1.setEmpresa("Claro");
        empleado1.setRol("Operario");
        empleados.add(empleado1);
        Empleado empleado2 = new Empleado();
        empleado2.setIdEmpleado(2);
        empleado2.setNombreEmpleado("Oscar");
        empleado2.setEmailEmpleado("oscar@nose.com");
        empleado2.setEmpresa("Movistar");
        empleado2.setRol("Operario");
        empleados.add(empleado2);
        return empleados;
    }
    @PostMapping("/empleado")
    public Empleado createRol(@RequestBody Empleado empleado) {
        Empleado newEmpleado = new Empleado();
        newEmpleado.setIdEmpleado(empleado.getIdEmpleado());
        newEmpleado.setNombreEmpleado(empleado.getNombreEmpleado());
        newEmpleado.setEmailEmpleado(empleado.getEmailEmpleado());
        newEmpleado.setEmpresa(empleado.getEmpresa());
        newEmpleado.setRol(empleado.getRol());
        return newEmpleado;
    }
    @PutMapping("/empleado/{id}")
    public Empleado updateRol(@PathVariable long id, @RequestBody Empleado empleado){
        Empleado putEmpleado = findById(id);
        putEmpleado.setIdEmpleado(empleado.getIdEmpleado());
        putEmpleado.setNombreEmpleado(empleado.getNombreEmpleado());
        putEmpleado.setEmailEmpleado(empleado.getEmailEmpleado());
        putEmpleado.setEmpresa(empleado.getEmpresa());
        putEmpleado.setRol(empleado.getRol());
        return putEmpleado;
    }
    @DeleteMapping("/empleado/{id}")
    public void deleteEmpleado(@PathVariable long id) {
        Empleado putEmpleado = findById(id);
    }


     */
}
