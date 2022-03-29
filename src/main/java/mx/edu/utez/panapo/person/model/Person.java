package mx.edu.utez.panapo.person.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.panapo.personTeam.model.PersonTeam;
import mx.edu.utez.panapo.profession.Profession;
import mx.edu.utez.panapo.user.model.User;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;

    private String lastName;
    @Column(nullable = false)
    private String email;
    private String dateBirth;
    private String phone;
    @ManyToOne
    @JoinColumn(name = "profession_id", nullable = false)
    @NonNull
    private Profession profession;
    @OneToMany(mappedBy = "person")
    @JsonIgnore
    private List<PersonTeam> personTeamList;
    @OneToOne(mappedBy = "person")
    @JsonIgnore
    private User users;

    public Person() {
    }

    public Person(long id, String name, String lastName, String email, String dateBirth, String phone,  Profession profession) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dateBirth = dateBirth;
        this.phone = phone;
        this.profession = profession;
    }

    public Person(String name, String lastName, String email, String dateBirth, String phone,  Profession profession) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dateBirth = dateBirth;
        this.phone = phone;
        this.profession = profession;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @NonNull
    public Profession getProfession() {
        return profession;
    }

    public void setProfession(@NonNull Profession profession) {
        this.profession = profession;
    }
}
