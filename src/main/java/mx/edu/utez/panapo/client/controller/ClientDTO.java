package mx.edu.utez.panapo.client.controller;

import mx.edu.utez.panapo.type_client.TypeClient;

public class ClientDTO {
    private  long id;
    private String nameClient;
    private String company;
    private String emailRepre;
    private String nameRepre;
    private String phoneRepre;
    private TypeClient typeClient;

    public ClientDTO() {
    }

    public ClientDTO(long id, String nameClient, String company, String emailRepre, String nameRepre, String clientDTOEmail, String phoneRepre, TypeClient typeClient) {
    }

    public ClientDTO(String nameClient, String company, String emailRepre, String nameRepre, String phoneRepre, TypeClient typeClient) {
        this.nameClient = nameClient;
        this.company = company;
        this.emailRepre = emailRepre;
        this.nameRepre = nameRepre;
        this.phoneRepre = phoneRepre;
        this.typeClient = typeClient;
    }

    public ClientDTO(long id, String nameClient, String company, String emailRepre, String nameRepre, String phoneRepre, TypeClient typeClient) {
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

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmailRepre() {
        return emailRepre;
    }

    public void setEmailRepre(String emailRepre) {
        this.emailRepre = emailRepre;
    }

    public String getNameRepre() {
        return nameRepre;
    }

    public void setNameRepre(String nameRepre) {
        this.nameRepre = nameRepre;
    }

    public String getPhoneRepre() {
        return phoneRepre;
    }

    public void setPhoneRepre(String phoneRepre) {
        this.phoneRepre = phoneRepre;
    }

    public TypeClient getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient;
    }
}
