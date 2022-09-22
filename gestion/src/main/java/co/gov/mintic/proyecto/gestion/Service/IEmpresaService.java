package co.gov.mintic.proyecto.gestion.Service;

import co.gov.mintic.proyecto.gestion.entities.Empresa;

import java.util.List;

public interface IEmpresaService {

    public Empresa findById(long id);
    public List<Empresa> findAll();
    public Empresa createEmpresa(Empresa empresa);
    public Empresa updateEmpresa(int id, Empresa empresa);
    public void deleteEmpresa(long id);
}
