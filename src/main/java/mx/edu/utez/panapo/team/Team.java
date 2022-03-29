package mx.edu.utez.panapo.team;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.panapo.personTeam.model.PersonTeam;
import mx.edu.utez.panapo.project.model.Project;
import mx.edu.utez.panapo.report.model.Report;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "team")
    @JsonIgnore
    private List<PersonTeam> personTeamList;
    @OneToMany(mappedBy = "team")
    @JsonIgnore
    private List<Project> projectList;

    public Team() {
    }

    public Team(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
