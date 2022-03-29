package mx.edu.utez.panapo.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.panapo.project.model.Project;
import mx.edu.utez.panapo.type_client.TypeClient;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nameClient;
    @Column(nullable = false)
    private String company;
    @Column(nullable = false)
    private String emailRepre;
    private String nameRepre;
    private String phoneRepre;
    @ManyToOne
    @JoinColumn(name = "typeclient_id", nullable = false)
    @NonNull
    private TypeClient typeClient;
    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<Project> projectList;

    public Client() {
    }



    public Client(String nameClient, String company, String emailRepre, String nameRepre, String phoneRepre, @NonNull TypeClient typeClient) {
        this.nameClient = nameClient;
        this.company = company;
        this.emailRepre = emailRepre;
        this.nameRepre = nameRepre;
        this.phoneRepre = phoneRepre;
        this.typeClient = typeClient;
    }

    public Client(long id, String nameClient, String company, String emailRepre, String nameRepre, String phoneRepre, @NonNull TypeClient typeClient) {
        this.id = id;
        this.nameClient = nameClient;
        this.company = company;
        this.emailRepre = emailRepre;
        this.nameRepre = nameRepre;
        this.phoneRepre = phoneRepre;
        this.typeClient = typeClient;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String name) {
        this.nameClient = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String lastName) {
        this.company = lastName;
    }

    public String getEmailRepre() {
        return emailRepre;
    }

    public void setEmailRepre(String email) {
        this.emailRepre = email;
    }

    public String getNameRepre() {
        return nameRepre;
    }

    public void setNameRepre(String dateBirth) {
        this.nameRepre = dateBirth;
    }

    public String getPhoneRepre() {
        return phoneRepre;
    }

    public void setPhoneRepre(String phone) {
        this.phoneRepre = phone;
    }

    @NonNull
    public TypeClient getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(@NonNull TypeClient typeClient) {
        this.typeClient = typeClient;
    }
}
