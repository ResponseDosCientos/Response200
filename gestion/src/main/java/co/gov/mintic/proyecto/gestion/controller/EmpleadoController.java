package co.gov.mintic.proyecto.gestion.controller;

import co.gov.mintic.proyecto.gestion.Service.IEmpleadoService;
import co.gov.mintic.proyecto.gestion.Service.IEmpresaService;
import co.gov.mintic.proyecto.gestion.Service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import co.gov.mintic.proyecto.gestion.entities.Empleado;
import co.gov.mintic.proyecto.gestion.entities.Empresa;
import co.gov.mintic.proyecto.gestion.entities.Rol;


import javax.validation.Valid;
import javax.validation.Validator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class EmpleadoController {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IRolService rolService;

    @Autowired
    private IEmpresaService empresaService;

    private final Logger LOG = Logger.getLogger("" + EmpleadoController.class);
    private Validator validator;

<<<<<<< HEAD

=======
>>>>>>> development
    @GetMapping("/empleados/listar")
    public String getListEmpleados(Model model) {
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


    @PostMapping("/guardar")
    public String guardarEmpleado(@Valid Empleado user, BindingResult error, Model modelo){
        LOG.log(Level.INFO,"guardarEmpleado");
        if(user.getRol().getIdRol() == 0) {
            FieldError field = new FieldError("empleado", "rol","No puede ser null");
            error.addError(field);
        }
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            //Roles
            List<Rol> roles = rolService.findAll();
            modelo.addAttribute("roles", roles);

            return "empleados/modificar";
        }
        user.setEstado(true);
        user = empleadoService.createEmpleado(user);
        return "redirect:/empleados/listar";
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
    public String editEmpleado(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "editEmpleado");
        Empleado empleado = empleadoService.findById(id);
        modelo.addAttribute("empleado", empleado);
        //Roles
        List<Rol> roles = rolService.findAll();
        modelo.addAttribute("roles", roles);
        //Empresa
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresas", empresas);
        return "empleados/modificar";
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public String deletEmpleado(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deletEmpleado");
        empleadoService.deletEmpleado(id);
        return "redirect:/empleados/listar";
    }


}