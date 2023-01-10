package com.example.backend_dent_sec.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "sales_reps", schema = "dentist_secretary", catalog = "")
public class SalesRep {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sales_rep_id")
    private Integer salesRepId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "salesRepsBySalesRepId")
    private Collection<SalesRepItem> salesRepsItemsBySalesRepId;

    public Integer getSalesRepId() {
        return salesRepId;
    }

    public void setSalesRepId(Integer salesRepId) {
        this.salesRepId = salesRepId;
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
        SalesRep salesRep = (SalesRep) o;
        return Objects.equals(salesRepId, salesRep.salesRepId) && Objects.equals(name, salesRep.name) && Objects.equals(lastName, salesRep.lastName) && Objects.equals(createTime, salesRep.createTime) && Objects.equals(phoneNumber, salesRep.phoneNumber) && Objects.equals(email, salesRep.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesRepId, name, lastName, createTime, phoneNumber, email);
    }

    public Collection<SalesRepItem> getSalesRepsItemsBySalesRepId() {
        return salesRepsItemsBySalesRepId;
    }

    public void setSalesRepsItemsBySalesRepId(Collection<SalesRepItem> salesRepsItemsBySalesRepId) {
        this.salesRepsItemsBySalesRepId = salesRepsItemsBySalesRepId;
    }
}
