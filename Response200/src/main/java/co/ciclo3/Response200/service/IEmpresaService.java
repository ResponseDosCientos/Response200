package co.ciclo3.Response200.service;

import co.ciclo3.Response200.entity.Empresa;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IEmpresaService {
    public Empresa findById(long id);

    public List<Empresa> findAll();

    public Empresa createEmpresa(Empresa empresa);

    public Empresa updateEmpresa(Empresa empresa);

    public void deleteEmpresa(long id);
}
