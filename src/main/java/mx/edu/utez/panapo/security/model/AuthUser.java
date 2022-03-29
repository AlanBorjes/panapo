package mx.edu.utez.panapo.security.model;

import mx.edu.utez.panapo.person.model.Person;
import mx.edu.utez.panapo.status.Status;
import mx.edu.utez.panapo.user.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AuthUser implements UserDetails {

    String username;
    String password;
    private Person person;
    private Status status;
    public Collection<? extends GrantedAuthority> authorities;

    public AuthUser(String username, String password, Person person, Status status, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.person = person;
        this.status = status;
        this.authorities = authorities;
    }
    public static AuthUser build(User user){
        List<GrantedAuthority> authorities =
                user.getAuthorities()
                        .stream()
                        .map(rol -> new SimpleGrantedAuthority(rol.getDescription()))
                        .collect(Collectors.toList());
        return new AuthUser(user.getUsername(), user.getPassword(), user.getPerson(),user.getStatus(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
