package com.cbc_order_processing_app.model.entity;

import jakarta.persistence.*;
import java.util.Map;

@Entity
public class Staff {
    @Id
    private String staffId;
    private String name;
    private String department;

    @ElementCollection
    private Map<String, String> contacts;

    public Staff() {}

    public Staff(String staffId, String name, String department, Map<String, String> contacts) {
        this.staffId = staffId;
        this.name = name;
        this.department = department;
        this.contacts = contacts;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, String> contacts) {
        this.contacts = contacts;
    }
}
