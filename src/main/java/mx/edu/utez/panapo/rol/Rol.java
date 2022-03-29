package mx.edu.utez.panapo.rol;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.panapo.user.model.User;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true, length = 20)
    private String description;
    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn (name ="role_id"),
            inverseJoinColumns = @JoinColumn(name ="user_id"))
    @JsonIgnore
    private Set<User> users;

    public Rol() {
    }

    public Rol(long id, String description, Set<User> users) {
        this.id = id;
        this.description = description;
        this.users = users;
    }

    public Rol(String description, Set<User> users) {
        this.description = description;
        this.users = users;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
