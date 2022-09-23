package co.gov.mintic.proyecto.gestion.Service;

import co.gov.mintic.proyecto.gestion.entities.Empleado;
import co.gov.mintic.proyecto.gestion.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("UserDetailsService")
public class LoginService implements UserDetailsService {

    @Autowired
    IEmpleadoRepository empleadoRepository;

    @Override
    public UserDetails loadUserByUsername(String username){
        Empleado empleado = empleadoRepository.findByUsername(username);
        if (empleado == null){
            throw new UsernameNotFoundException(username);
        }
        var roles = new ArrayList<GrantedAuthority>();

        roles.add(new SimpleGrantedAuthority(empleado.getRol().getDescripcion()));

        return new User(empleado.getUsername(), empleado.getClave(), roles);
    }
}
