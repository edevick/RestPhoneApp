package com.RestPhoneApp.RestPhoneApp.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table (name = "contacts")
@ToString ( of = {"id","nameContact","lastNameContact","phoneContact","mailContact"})
@EqualsAndHashCode (of = {"id"})
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameContact;
    private String lastNameContact;
    private String phoneContact;
    private String mailContact;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getLastNameContact() {
        return lastNameContact;
    }

    public void setLastNameContact(String lastNameContact) {
        this.lastNameContact = lastNameContact;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
    }

    public String getMailContact() {
        return mailContact;
    }

    public void setMailContact(String mailContact) {
        this.mailContact = mailContact;
    }
}
