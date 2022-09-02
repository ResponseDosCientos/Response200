package co.ciclo3.Response200.service;

import co.ciclo3.Response200.entity.Empresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService implements IEmpresaService{

    @Override
    public Empresa findByNit(long nit) {
        Empresa empresa = new Empresa();
        empresa.setNitEmpresa(nit);
        empresa.setNomEmpresa("MSI");
        empresa.setDirEmpresa("Calle 25b");
        empresa.setTelEmpresa(321034432);
        empresa.setBalance(1250000);
        return empresa;
    }

    @Override
    public List<Empresa> findAll() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        Empresa empresa1 = new Empresa();
        empresa1.setNitEmpresa(1);
        empresa1.setNomEmpresa("MSI");
        empresa1.setDirEmpresa("Calle 25b");
        empresa1.setTelEmpresa(321034432);
        empresa1.setBalance(1250000);
        empresas.add(empresa1);
        Empresa empresa2 = new Empresa();
        empresa2.setNitEmpresa(2);
        empresa2.setNomEmpresa("Amazon");
        empresa2.setDirEmpresa("Transversal 34");
        empresa2.setTelEmpresa(44444444);
        empresa2.setBalance(500000);
        empresas.add(empresa2);
        return empresas;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        Empresa newEmpresa = new Empresa();
        newEmpresa.setNitEmpresa(empresa.getNitEmpresa());
        newEmpresa.setNomEmpresa(empresa.getNomEmpresa());
        newEmpresa.setDirEmpresa(empresa.getDirEmpresa());
        newEmpresa.setTelEmpresa(empresa.getTelEmpresa());
        newEmpresa.setBalance(empresa.getBalance());
        return newEmpresa;
    }

    @Override
    public Empresa updateEmpresa(long nit, Empresa empresa) {
        Empresa putEmpresa = findByNit(nit);
        putEmpresa.setNomEmpresa(empresa.getNomEmpresa());
        putEmpresa.setDirEmpresa(empresa.getDirEmpresa());
        putEmpresa.setTelEmpresa(empresa.getTelEmpresa());
        return putEmpresa;
    }

    @Override
    public void deleteEmpresa(long nit) {
        Empresa deleteEmpresa = findByNit(nit);
    }

}

