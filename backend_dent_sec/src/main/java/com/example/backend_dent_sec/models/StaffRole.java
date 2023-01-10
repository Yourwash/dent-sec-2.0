package com.example.backend_dent_sec.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "staff_roles", schema = "dentist_secretary", catalog = "")
public class StaffRole {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "role_id")
    private Integer roleId;
    @Basic
    @Column(name = "role")
    private String role;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffRole staffRole = (StaffRole) o;
        return Objects.equals(roleId, staffRole.roleId) && Objects.equals(role, staffRole.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, role);
    }
}
