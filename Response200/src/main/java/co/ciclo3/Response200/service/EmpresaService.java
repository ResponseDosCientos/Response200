package co.ciclo3.Response200.service;

import co.ciclo3.Response200.entity.Empresa;
import co.ciclo3.Response200.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IEmpresaService{

    @Autowired
    private IEmpresaRepository empresaRepository;

    @Override
    public Empresa findById(long id) {
        Optional<Empresa> empresa = empresaRepository.findById((Long) id);
        return empresa.get();
    }

    @Override
    public List<Empresa> findAll() {
        List<Empresa> empresas = (List<Empresa>) empresaRepository.findAll();
        return empresas;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public Empresa updateEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public void deleteEmpresa(long id) {
        empresaRepository.deleteById(id);
    }

}

