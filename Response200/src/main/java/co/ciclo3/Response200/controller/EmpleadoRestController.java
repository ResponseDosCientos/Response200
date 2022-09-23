package co.ciclo3.Response200.controller;

import co.ciclo3.Response200.entity.Empleado;
import co.ciclo3.Response200.entity.Empresa;
import co.ciclo3.Response200.service.IEmpleadoService;
import co.ciclo3.Response200.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleado/{id}")
//    public Empleado findById(@PathVariable long id) {
//        return this.empleadoService.findById(id);
//    }
    public Empleado findById(@PathVariable long id) {
        return empleadoService.findById(id);
    }

    @GetMapping("/empleado")
    public List<Empleado> findAll(){
        return this.empleadoService.findAll();
    }
    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado) {
        return this.empleadoService.createEmpleado(empleado);
    }
    @PutMapping("/empleado")
    public Empleado updateEmpleado(@RequestBody Empleado empleado){

        return this.empleadoService.updateEmpleado(empleado);
    }
    @DeleteMapping("/empleado/{id}")
    public void deleteEmpleado(@PathVariable long id) {
        empleadoService.deleteEmpleado(id);
    }

}
