package com.jajangrohmatulloh.matchinglogic.model;

import java.util.List;

public class ClientRequest {

    private String fullName;
    private List<String> DBFullNames;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getDBFullNames() {
        return DBFullNames;
    }

    public void setDBFullNames(List<String> DBFullNames) {
        this.DBFullNames = DBFullNames;
    }
}
