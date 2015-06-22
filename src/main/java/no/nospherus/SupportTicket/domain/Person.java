package no.nospherus.SupportTicket.domain;

import javax.persistence.Entity;

/**
 * Created by terjewallem on 6/21/15.
 */
@Entity
public class Person extends Base {
    private String name;
    private String email;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
