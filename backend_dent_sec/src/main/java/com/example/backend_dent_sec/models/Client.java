package com.example.backend_dent_sec.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "clients", schema = "dentist_secretary", catalog = "")
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "client_id")
    private Integer clientId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "dob")
    private Date dob;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "clientsByClientId")
    private Collection<Appointment> appointmentsByClientId;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(clientId, client.clientId) && Objects.equals(name, client.name) && Objects.equals(lastName, client.lastName) && Objects.equals(dob, client.dob) && Objects.equals(createTime, client.createTime) && Objects.equals(phoneNumber, client.phoneNumber) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, name, lastName, dob, createTime, phoneNumber, email);
    }

    public Collection<Appointment> getAppointmentsByClientId() {
        return appointmentsByClientId;
    }

    public void setAppointmentsByClientId(Collection<Appointment> appointmentsByClientId) {
        this.appointmentsByClientId = appointmentsByClientId;
    }
}
