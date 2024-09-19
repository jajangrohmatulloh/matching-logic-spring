package com.jajangrohmatulloh.matchinglogic.model;

import java.util.List;

public class ClientRequest {

    private String fullName;
    private List<String> users;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
