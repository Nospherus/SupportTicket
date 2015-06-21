package no.nospherus.SupportTicket.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserContext implements Serializable {
    private String userName;
    private List roles;

    public UserContext(String userName, List roles) {
        this.userName = userName;
        this.roles = roles;
    }

    public UserContext() {
        this.userName = "Not logged in";
        this.roles = new ArrayList();
    }

    private String[] collectionToArray() {
        return null;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List getRoles() {
        return roles;
    }

    public void setRoles(List roles) {
        this.roles = roles;
    }
}
