package mx.edu.utez.panapo.person.controller;

import mx.edu.utez.panapo.profession.Profession;

public class PersonDTO {
    private long id;
    private String name;
    private String lastName;
    private String email;
    private String dateBirth;
    private String phone;
    private Profession profession;

    public PersonDTO() {
    }

    public PersonDTO(String name, String lastName, String email, String dateBirth, String phone, Profession profession) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dateBirth = dateBirth;
        this.phone = phone;
        this.profession = profession;
    }

    public PersonDTO(long id, String name, String lastName, String email, String dateBirth, String phone, Profession profession) {
        this.id = id;
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

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}
