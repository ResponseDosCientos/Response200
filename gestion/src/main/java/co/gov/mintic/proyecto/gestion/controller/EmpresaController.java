package co.gov.mintic.proyecto.gestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import co.gov.mintic.proyecto.gestion.Service.IEmpresaService;
import co.gov.mintic.proyecto.gestion.entities.Empresa;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;
    private final Logger LOG = Logger.getLogger("" + EmpresaController.class);

    @GetMapping("/empresas/listar")
    public String getListEmpresas(Model model) {
        LOG.log(Level.INFO, "getListEmpresas");
        List<Empresa> empresas = empresaService.findAll();
        for (Empresa empr : empresas)
            System.out.println(empr.toString());
        model.addAttribute("empresas", empresas);
        return "empresas/list";
    }

    @GetMapping("/empresas/crear")
    public String createEmpresa(Model modelo) {
        LOG.log(Level.INFO, "createEmpresa");
        Empresa empresa = new Empresa();
        modelo.addAttribute("empresa", empresa);
        return "empresas/modificar";
    }

    @PostMapping("/empresas/guardar")
    public String guardarEmpresa(@Valid Empresa empresa, BindingResult error, Model modelo) {
        LOG.log(Level.INFO, "guardarEmpresa");
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            return "empresas/modificar";
        }
        empresa.setEstado(true);
        empresa = empresaService.createEmpresa(empresa);
        return "redirect:/empresas/listar";
    }

    @RequestMapping(value = "/empresas/editar/{id}", method = RequestMethod.GET)
    public String editEmpresa(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "editEmpresa");
        System.out.println(id);
        Empresa empresa = empresaService.findById(id);
        System.out.println(empresa.toString());
        modelo.addAttribute("empresa", empresa);
        return "empresas/modificar";
    }

    @RequestMapping(value = "/empresas/eliminar/{id}", method = RequestMethod.GET)
    public String deleteEmpresa(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteEmpresa");
        empresaService.deleteEmpresa(id);
        return "redirect:/empresas/listar";
    }

}