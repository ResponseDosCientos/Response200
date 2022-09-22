package co.gov.mintic.proyecto.gestion.Service;

import co.gov.mintic.proyecto.gestion.entities.Profile;

import java.util.List;

public interface IProfileService {

    public Profile findById(long id);
    public List<Profile> findAll();
    public Profile creatProfile(Profile profile);
    public Profile updateProfile(long id, Profile profile);
    public void deletProfile(long id);
}
