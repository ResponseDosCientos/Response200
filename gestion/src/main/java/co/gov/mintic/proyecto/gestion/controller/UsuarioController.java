package co.gov.mintic.proyecto.gestion.controller;

import co.gov.mintic.proyecto.gestion.entities.Empleado;
import co.gov.mintic.proyecto.gestion.entities.Empresa;
import co.gov.mintic.proyecto.gestion.entities.Rol;
import co.gov.mintic.proyecto.gestion.Service.IEmpleadoService;
import co.gov.mintic.proyecto.gestion.Service.IEmpresaService;
import co.gov.mintic.proyecto.gestion.Service.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class UsuarioController {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IEmpresaService empresaService;

    @Autowired
    private IRolService rolService;

    private final Logger LOG = Logger.getLogger(""+UsuarioController.class);

    @GetMapping("/empleados/listar")
    public String getListEmpleados(Model model){
        LOG.log(Level.INFO,"getListEmpleados");
        List<Empleado> empleados = empleadoService.findAll();
        model.addAttribute("empleados", empleados);
        return "empleados/list";
    }

    @GetMapping("/empleados/crear")
    public String createEmpleado(Model modelo){
        LOG.log(Level.INFO,"createEmpleado");
        //Empleado
        Empleado empleado = new Empleado();
        modelo.addAttribute("empleado", empleado);
        //Roles
        List<Rol> roles = rolService.findAll();
        modelo.addAttribute("roles", roles);
        // Empresas
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresas", empresas);
        return "empleados/modificar";
    }

    @PostMapping("/guardar")
    public String guardarEmpleado(Empleado user){
        LOG.log(Level.INFO,"guardarEmpleado");
        user.setEstado(true);
        user = empleadoService.createEmpleado(user);
        return "redirect:/empleados/listar";
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
    public String editEmpleado(@PathVariable("id") long id, Model modelo){
        LOG.log(Level.INFO,"editEmpleado");
        Empleado empleado = empleadoService.findById(id);
        modelo.addAttribute("empleado", empleado);
        //Roles
        List<Rol> roles = rolService.findAll();
        modelo.addAttribute("roles", roles);
        // Tipo de documento
        List<Empresa> empresas = empresaService.findAll();
        modelo.addAttribute("empresa", empresas);
        return "empleados/modificar";
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public String deleteEmpleado(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteEmpleado");
        empleadoService.deletEmpleado(id);
        return "redirect:/empleados/listar";
    }
}
