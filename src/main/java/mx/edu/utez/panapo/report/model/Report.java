package mx.edu.utez.panapo.report.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.panapo.phases.Phases;
import mx.edu.utez.panapo.project.model.Project;
import mx.edu.utez.panapo.team.Team;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String phasePlanned;
    private String phaseReal;
    private String stagePlanned;
    private String stageReal;
    private String percentage;
    private String cost;
    private String daysDeviation;
    private String date;
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;


    public Report(String cost, String date, String daysDeviation, String percentage, String phasePlanned, String planned, String reportDTOPhasePlanned, String stageReal, Project project) {
    }

    public Report(long id, String phasePlanned, String phaseReal, String stagePlanned, String stageReal, String percentage, String cost, String daysDeviation, String date, Project project, Team team) {
        this.id = id;
        this.phasePlanned = phasePlanned;
        this.phaseReal = phaseReal;
        this.stagePlanned = stagePlanned;
        this.stageReal = stageReal;
        this.percentage = percentage;
        this.cost = cost;
        this.daysDeviation = daysDeviation;
        this.date = date;
        this.project = project;
    }

    public Report(String phasePlanned, String phaseReal, String stagePlanned, String stageReal, String percentage, String cost, String daysDeviation, String date, Project project, Team team) {
        this.phasePlanned = phasePlanned;
        this.phaseReal = phaseReal;
        this.stagePlanned = stagePlanned;
        this.stageReal = stageReal;
        this.percentage = percentage;
        this.cost = cost;
        this.daysDeviation = daysDeviation;
        this.date = date;
        this.project = project;
    }

    public Report(long id, String cost, String date, String daysDeviation, String percentage, String phasePlanned, String phasePlanned1, String phasePlanned2, String stageReal, Project project) {
    }

    public Report() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhasePlanned() {
        return phasePlanned;
    }

    public void setPhasePlanned(String phasePlanned) {
        this.phasePlanned = phasePlanned;
    }

    public String getPhaseReal() {
        return phaseReal;
    }

    public void setPhaseReal(String phaseReal) {
        this.phaseReal = phaseReal;
    }

    public String getStagePlanned() {
        return stagePlanned;
    }

    public void setStagePlanned(String stagePlanned) {
        this.stagePlanned = stagePlanned;
    }

    public String getStageReal() {
        return stageReal;
    }

    public void setStageReal(String stageReal) {
        this.stageReal = stageReal;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDaysDeviation() {
        return daysDeviation;
    }

    public void setDaysDeviation(String daysDeviation) {
        this.daysDeviation = daysDeviation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
