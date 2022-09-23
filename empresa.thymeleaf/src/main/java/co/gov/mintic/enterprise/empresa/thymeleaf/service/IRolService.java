package co.gov.mintic.enterprise.empresa.thymeleaf.service;

import co.gov.mintic.enterprise.empresa.thymeleaf.entities.Rol;

import java.util.List;

public interface IRolService {

    public Rol findById(int id);

    public List<Rol> findAll();

    public Rol createRol(Rol rol);

    public Rol updateRol(int id, Rol rol);

    public void deleteRol(int id);
}
