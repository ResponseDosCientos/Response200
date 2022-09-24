package co.gov.mintic.proyecto.gestion.controller;

import co.gov.mintic.proyecto.gestion.Service.IEmpleadoService;
import co.gov.mintic.proyecto.gestion.Service.IEmpresaService;
import co.gov.mintic.proyecto.gestion.Service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import co.gov.mintic.proyecto.gestion.entities.Empleado;
import co.gov.mintic.proyecto.gestion.entities.Empresa;
import co.gov.mintic.proyecto.gestion.entities.Rol;


import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpleadoController {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IRolService rolService;

    @Autowired
    private IEmpresaService empresaService;

    private final Logger LOG = Logger.getLogger("" + EmpleadoController.class);

    @GetMapping("/empleados/listar")
    public String getListEmpleados(Model model){
        LOG.log(Level.INFO,"getListEmpleados");
        List<Empleado> empleados = empleadoService.findAll();
        model.addAttribute("empleados", empleados);
        return "empleados/list";
    }

    @GetMapping("/empleados/crear")
    public String createEmpleado(Model modelo) {
        LOG.log(Level.INFO, "createEmpleado");
        //Empleado
        Empleado empleado = new Empleado();
        modelo.addAttribute("empleado", empleado);
        //Roles
        List<Rol> roles = rolService.findAll();
        modelo.addAttribute("roles", roles);
        //Empresa
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresas", empresas);
        return "empleados/modificar";
    }


    @PostMapping("/empleados/guardar")
    public String guardarEmpleado(@Valid Empleado empleado, BindingResult error, Model modelo) {
        LOG.log(Level.INFO, "guardarEmpleado");
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            return "empleados/modificar";
        }
        empleado.setEstado(true);
        empleado = empleadoService.createEmpleado(empleado);
        return "redirect:/empleados/listar";
    }

    @RequestMapping(value = "/empleados/editar/{id}", method = RequestMethod.GET)
    public String editEmpleado(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "editEmpleado");
        System.out.println(id);
        Empleado empleado = empleadoService.findById(id);
        System.out.println(empleado.toString());
        modelo.addAttribute("empleado", empleado);
        //Roles
        List<Rol> roles = rolService.findAll();
        modelo.addAttribute("roles", roles);
        //Empresa
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresas", empresas);
        return "empleados/modificar";
    }

    @RequestMapping(value = "/empleados/eliminar/{id}", method = RequestMethod.GET)
    public String deletEmpleado(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deletEmpleado");
        empleadoService.deletEmpleado(id);
        return "redirect:/empleados/listar";
    }


}