package com.example.backend_dent_sec.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "staff", schema = "dentist_secretary", catalog = "")
public class StaffMember {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "staff_id")
    private Integer staffId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "staff_role_id")
    private Integer staffRoleId;
    @OneToMany(mappedBy = "staffByStaffId")
    private Collection<ApointmentStaff> apointmentStaffsByStaffId;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getStaffRoleId() {
        return staffRoleId;
    }

    public void setStaffRoleId(Integer staffRoleId) {
        this.staffRoleId = staffRoleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffMember that = (StaffMember) o;
        return Objects.equals(staffId, that.staffId) && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(createTime, that.createTime) && Objects.equals(staffRoleId, that.staffRoleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, name, lastName, email, password, createTime, staffRoleId);
    }

    public Collection<ApointmentStaff> getApointmentStaffsByStaffId() {
        return apointmentStaffsByStaffId;
    }

    public void setApointmentStaffsByStaffId(Collection<ApointmentStaff> apointmentStaffsByStaffId) {
        this.apointmentStaffsByStaffId = apointmentStaffsByStaffId;
    }
}
