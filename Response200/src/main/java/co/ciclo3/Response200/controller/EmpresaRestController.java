package co.ciclo3.Response200.controller;

import co.ciclo3.Response200.entity.Empresa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class EmpresaRestController {

    @GetMapping("/empresa/{nit}")
    public Empresa findByNit(@PathVariable long nit) {



    public class EmpresaRestController {

    @GetMapping("/empresa/{nit}")
    public Empresa findByNit(@PathVariable long nit) {

        Empresa empresa = new Empresa();
        empresa.setNitEmpresa(nit);
        empresa.setNomEmpresa("MSI");
        empresa.setDirEmpresa("Calle 25b");
        empresa.setTelEmpresa(321034432);
        return empresa;
    }

    @GetMapping("/empresa")
    public List<Empresa> finAll() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        Empresa empresa1 = new Empresa();
        empresa1.setNitEmpresa(1);
        empresa1.setNomEmpresa("MSI");
        empresa1.setDirEmpresa("Calle 25b");
        empresa1.setTelEmpresa(321034432);
        empresas.add(empresa1);
        Empresa empresa2 = new Empresa();
        empresa2.setNitEmpresa(2);
        empresa2.setNomEmpresa("Amazon");
        empresa2.setDirEmpresa("Transversal 34");
        empresa2.setTelEmpresa(44444444);
        empresas.add(empresa2);
        return empresas;
    }

    @PostMapping("/empresa")
    public Empresa createRol(@RequestBody Empresa empresa) {
        Empresa newEmpresa = new Empresa();
        newEmpresa.setNitEmpresa(empresa.getNitEmpresa());
        newEmpresa.setNomEmpresa(empresa.getNomEmpresa());
        newEmpresa.setDirEmpresa(empresa.getDirEmpresa());
        newEmpresa.setTelEmpresa(empresa.getTelEmpresa());
        return newEmpresa;
    }

    @PutMapping("/empresa/{nit}")
    public Empresa updateRol(@PathVariable long nit, @RequestBody Empresa empresa) {
        Empresa putEmpresa = findByNit(nit);
        putEmpresa.setNomEmpresa(empresa.getNomEmpresa());
        putEmpresa.setDirEmpresa(empresa.getDirEmpresa());
        putEmpresa.setTelEmpresa(empresa.getTelEmpresa());
        return putEmpresa;
    }

    @DeleteMapping("/empresa/{nit}")
    public void deleteEmpresa(@PathVariable long nit) {
        Empresa putEmpresa = findByNit(nit);
    }
}
