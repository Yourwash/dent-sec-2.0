package com.example.backend_dent_sec.models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Procedure {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "procedure_id")
    private Integer procedureId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "cost")
    private Double cost;
    @Basic
    @Column(name = "duration")
    private Integer duration;
    @Basic
    @Column(name = "dentists")
    private Integer dentists;
    @Basic
    @Column(name = "helpers")
    private Integer helpers;
    @Basic
    @Column(name = "items")
    private Integer items;
    @OneToMany(mappedBy = "procedureByProcedureId")
    private Collection<Appointment> appointmentsByProcedureId;
    @OneToMany(mappedBy = "procedureByProcedureId")
    private Collection<ProcedureItem> procedureItemsByProcedureId;

    public Integer getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(Integer procedureId) {
        this.procedureId = procedureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDentists() {
        return dentists;
    }

    public void setDentists(Integer dentists) {
        this.dentists = dentists;
    }

    public Integer getHelpers() {
        return helpers;
    }

    public void setHelpers(Integer helpers) {
        this.helpers = helpers;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procedure procedure = (Procedure) o;
        return Objects.equals(procedureId, procedure.procedureId) && Objects.equals(name, procedure.name) && Objects.equals(cost, procedure.cost) && Objects.equals(duration, procedure.duration) && Objects.equals(dentists, procedure.dentists) && Objects.equals(helpers, procedure.helpers) && Objects.equals(items, procedure.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procedureId, name, cost, duration, dentists, helpers, items);
    }

    public Collection<Appointment> getAppointmentsByProcedureId() {
        return appointmentsByProcedureId;
    }

    public void setAppointmentsByProcedureId(Collection<Appointment> appointmentsByProcedureId) {
        this.appointmentsByProcedureId = appointmentsByProcedureId;
    }

    public Collection<ProcedureItem> getProcedureItemsByProcedureId() {
        return procedureItemsByProcedureId;
    }

    public void setProcedureItemsByProcedureId(Collection<ProcedureItem> procedureItemsByProcedureId) {
        this.procedureItemsByProcedureId = procedureItemsByProcedureId;
    }
}
