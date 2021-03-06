package mx.edu.utez.panapo.project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.panapo.StatusProject.StatusProject;
import mx.edu.utez.panapo.client.model.Client;
import mx.edu.utez.panapo.person.model.Person;
import mx.edu.utez.panapo.personTeam.model.PersonTeam;
import mx.edu.utez.panapo.phases.Phases;
import mx.edu.utez.panapo.report.model.Report;
import mx.edu.utez.panapo.stages.Stages;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    private String dateStart;
    private String dateEnd;
    private String cotizacion;
    private String months;
    private String numberBeca;
    private String priceClient;
    @Column(nullable = true)
    private String acronym;
    @Column(nullable = true)
    private String priority;
    @ManyToOne
    @JoinColumn(name = "personTeam_id" )
    private PersonTeam personTeam;
    @ManyToOne
    @JoinColumn(name = "phases_id")
    private Phases phases;
    @ManyToOne
    @JoinColumn(name = "stages_id")
    private Stages stages;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private StatusProject statusProject;
    @ManyToOne
    @JoinColumn(name = "project_id")
        private Project project;
    @OneToMany(mappedBy = "project")
    @JsonIgnore
    private List<Report> personList;
    @OneToMany(mappedBy = "project")
    @JsonIgnore
    private List<Project> projectList;

    public Project() {
    }

    public Project(String name, String description, String dateStart, String dateEnd, String cotizacion, String months, String numberBeca, String priceClient, String acronym, String priority, PersonTeam personTeam, Phases phases, Stages stages, Client client, StatusProject statusProject, Project project) {
        this.name = name;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.cotizacion = cotizacion;
        this.months = months;
        this.numberBeca = numberBeca;
        this.priceClient = priceClient;
        this.acronym = acronym;
        this.priority = priority;
        this.personTeam = personTeam;
        this.phases = phases;
        this.stages = stages;
        this.client = client;
        this.statusProject = statusProject;
        this.project = project;
    }

    public Project(String name, String description, String cotizacion, String months, String numberBeca, String priceClient, Client client, StatusProject statusProject) {
        this.name = name;
        this.description = description;
        this.cotizacion = cotizacion;
        this.months = months;
        this.numberBeca = numberBeca;
        this.priceClient = priceClient;
        this.client = client;
        this.statusProject = statusProject;
    }
    public Project(long id,String name, String description, String cotizacion, String months, String numberBeca, String priceClient, Client client, StatusProject statusProject) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cotizacion = cotizacion;
        this.months = months;
        this.numberBeca = numberBeca;
        this.priceClient = priceClient;
        this.client = client;
        this.statusProject = statusProject;
    }

    public Project(long id, String name, String description, String dateStart, String dateEnd, String cotizacion, String months, String numberBeca, String priceClient, String acronym, String priority, PersonTeam personTeam, Phases phases, Stages stages, Client client, StatusProject statusProject, Project project) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.cotizacion = cotizacion;
        this.months = months;
        this.numberBeca = numberBeca;
        this.priceClient = priceClient;
        this.acronym = acronym;
        this.priority = priority;
        this.personTeam = personTeam;
        this.phases = phases;
        this.stages = stages;
        this.client = client;
        this.statusProject = statusProject;
        this.project = project;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getNumberBeca() {
        return numberBeca;
    }

    public void setNumberBeca(String numberBeca) {
        this.numberBeca = numberBeca;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public PersonTeam getTeam() {
        return personTeam;
    }

    public void setTeam(PersonTeam personTeam) {
        this.personTeam = personTeam;
    }

    public Phases getPhases() {
        return phases;
    }

    public void setPhases(Phases phases) {
        this.phases = phases;
    }

    public Stages getStages() {
        return stages;
    }

    public void setStages(Stages stages) {
        this.stages = stages;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public StatusProject getStatusProject() {
        return statusProject;
    }

    public void setStatusProject(StatusProject statusProject) {
        this.statusProject = statusProject;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getPriceClient() {
        return priceClient;
    }

    public void setPriceClient(String priceClient) {
        this.priceClient = priceClient;
    }

    public PersonTeam getPersonTeam() {
        return personTeam;
    }

    public void setPersonTeam(PersonTeam personTeam) {
        this.personTeam = personTeam;
    }
}
