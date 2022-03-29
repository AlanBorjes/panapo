package mx.edu.utez.panapo.status;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.panapo.user.model.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true, length = 20)
    private String description;
    @OneToMany(mappedBy = "status")
    @JsonIgnore
    private List<User> users;

    public Status() {
    }

    public Status(long id, String description, List<User> users) {
        this.id = id;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
