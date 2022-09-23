package co.gov.mintic.enterprise.empresa.thymeleaf.service;

import co.gov.mintic.enterprise.empresa.thymeleaf.entities.Empresa;

import java.util.List;

public interface IEmpresaService {
    public Empresa findById(long id);

    public List<Empresa> findAll();

    public Empresa createEmpresa(Empresa empresa);

    public Empresa updateEmpresa(Empresa empresa);

    public void deleteEmpresa(long id);
}
