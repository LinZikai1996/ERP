package com.ERP.domain;

import java.io.Serializable;

public class Administrators implements Serializable {
    private String administratorName;
    private String password;

    public String getAdministratorName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrators.xml{" +
                "AdministratorName='" + administratorName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
