package co.gov.mintic.proyecto.gestion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import co.gov.mintic.proyecto.gestion.entities.Profile;
import org.springframework.stereotype.Service;
import co.gov.mintic.proyecto.gestion.repository.IProfileRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService implements IProfileService {

    @Autowired
    private IProfileRepository profileRepository;

    @Override
    public Profile findById(long id) {
        Optional<Profile> profile = profileRepository.findById((long)id);
        return profile.get();
    }

    @Override
    public List<Profile> findAll() {
        List<Profile> perfiles = (List<Profile>) profileRepository.findAll();
        return perfiles;
    }

    @Override
    public Profile creatProfile(Profile profile) {return profileRepository.save(profile);
    }

    @Override
    public Profile updateProfile(long id, Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public void deletProfile(long id) {
        profileRepository.deleteById((long)id);
    }

}