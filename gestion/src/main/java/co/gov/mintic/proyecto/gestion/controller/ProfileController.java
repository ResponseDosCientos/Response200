package co.gov.mintic.proyecto.gestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import co.gov.mintic.proyecto.gestion.Service.IMovimientoDineroService;
import co.gov.mintic.proyecto.gestion.Service.IProfileService;
import co.gov.mintic.proyecto.gestion.entities.Profile;
import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class ProfileController {

    @Autowired
    private IMovimientoDineroService movimientoDineroService;

    @Autowired
    private IProfileService profileService;

    private final Logger LOG = Logger.getLogger("" + ProfileController.class);

    @GetMapping("/perfiles/list")
    public String getListPerfiles(Model model) {
        LOG.log(Level.INFO, "getListPerfiles");
        List<Profile> perfiles = profileService.findAll();
        for (Profile pro : perfiles)
            System.out.println(pro.toString());
        model.addAttribute("perfiles", perfiles);
        return "/perfiles/list";
    }

    @GetMapping("/perfiles/crear")
    public String creatProfile(Model modelo) {
        LOG.log(Level.INFO, "creatProfile");
        Profile perfiles = new Profile();
        modelo.addAttribute("perfiles", perfiles);
        return "perfiles/modificar";
    }

    @PostMapping("/perfiles/guardar")
    public String guardarPeril(@Valid Profile profile, BindingResult error, Model modelo ) {
        LOG.log(Level.INFO, "guardarProfile");
        for(ObjectError e : error.getAllErrors())
            System.out.println(e.toString());
        if(error.hasErrors()) {
            return "empresas/modificar";
        }
        profile.setEstadoProfile(true);
        profile = profileService.creatProfile(profile);
        return "redirect:/perfiles/list";
    }

    @RequestMapping(value = "/perfiles/editar/{id}", method = RequestMethod.GET)
    public String editProfile(@PathVariable("id") int id, Model modelo) {
        LOG.log(Level.INFO, "editProfile");
        System.out.println(id);
        Profile profile = profileService.findById(id);
        System.out.println(profile.toString());
        modelo.addAttribute("perfiles", profile);
        return "perfiles/modificar";
    }

    @RequestMapping(value = "/perfiles/eliminar/{id}", method = RequestMethod.GET)
    public String deletProfile(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deletProfile");
        profileService.deletProfile(id);
        return "redirect:/perfiles/list";
    }
}
