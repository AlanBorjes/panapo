package mx.edu.utez.panapo.rol.controller;

import mx.edu.utez.panapo.user.model.User;

import java.util.Set;

public class RolDTO {
    private long id;
    private String description;
    private Set<User> users;

    public RolDTO() {
    }

    public RolDTO(long id, String description, Set<User> users) {
        this.id = id;
        this.description = description;
        this.users = users;
    }

    public RolDTO(String description, Set<User> users) {
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

