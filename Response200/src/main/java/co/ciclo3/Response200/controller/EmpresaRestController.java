package co.ciclo3.Response200.controller;
import co.ciclo3.Response200.entity.Empresa;
import co.ciclo3.Response200.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaRestController {

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping("/empresa/{id}")
    public Empresa findByNit(@PathVariable long id) {
        return empresaService.findById(id);
    }
    @GetMapping("/empresa")
    public List<Empresa> findAll(){
        return this.empresaService.findAll();
    }
    @PostMapping("/empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return this.empresaService.createEmpresa(empresa);
    }
    @PutMapping("/empresa")
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return this.empresaService.updateEmpresa(empresa);
    }
    @DeleteMapping("/empresa/{id}")
    public void deleteEmpresa(@PathVariable long id) {
        empresaService.deleteEmpresa(id);
    }

}