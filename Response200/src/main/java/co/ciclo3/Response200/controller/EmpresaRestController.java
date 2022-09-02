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

    @GetMapping("/empresa/{nit}")
    public Empresa findByNit(@PathVariable long nit) {
        return empresaService.findByNit(nit);
    }
    @GetMapping("/empresa")
    public List<Empresa> findAll(){
        return this.empresaService.findAll();
    }
    @PostMapping("/empresa")
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return this.empresaService.createEmpresa(empresa);
    }
    @PutMapping("/empresa/{nit}")
    public Empresa updateEmpresa(@PathVariable long nit, @RequestBody Empresa empresa){
        return this.empresaService.updateEmpresa(nit, empresa);
    }


    @DeleteMapping("/empresa/{nit}")
    public void deleteEmpresa(@PathVariable long nit) {
        empresaService.deleteEmpresa(nit);
    }


}