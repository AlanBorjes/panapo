package mx.edu.utez.panapo.personTeam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.panapo.person.model.Person;
import mx.edu.utez.panapo.rolProject.RolProject;
import mx.edu.utez.panapo.team.Team;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
public class PersonTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    @NonNull
    Person person;
    @ManyToOne
    @JoinColumn(name = "rolProject_id", nullable = false)
    @NonNull
    RolProject rolProject;
    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    Team team;

    public PersonTeam() {
    }

    public PersonTeam(Person person, RolProject rolProject, Team team) {
        this.person = person;
        this.rolProject = rolProject;
        this.team = team;
    }

    public PersonTeam(long id,  Person person, RolProject rolProject, Team team) {
        this.id = id;
        this.person = person;
        this.rolProject = rolProject;
        this.team = team;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson( Person person) {
        this.person = person;
    }

    public RolProject getRolProject() {
        return rolProject;
    }

    public void setRolProject( RolProject rolProject) {
        this.rolProject = rolProject;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
