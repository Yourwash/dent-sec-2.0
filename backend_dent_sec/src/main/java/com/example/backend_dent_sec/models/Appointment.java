package com.example.backend_dent_sec.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "appointments", schema = "dentist_secretary", catalog = "")
public class Appointment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "appointment_id")
    private Integer appointmentId;
    @Basic
    @Column(name = "date")
    private Date date;
    @Basic
    @Column(name = "time")
    private Time time;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "procedure_id")
    private Integer procedureId;
    @Basic
    @Column(name = "client_id")
    private Integer clientId;
    @ManyToOne
    @JoinColumn(name = "procedure_id", referencedColumnName = "procedure_id", nullable = false)
    private Procedure procedureByProcedureId;
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false)
    private Client clientsByClientId;

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(Integer procedureId) {
        this.procedureId = procedureId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(appointmentId, that.appointmentId) && Objects.equals(date, that.date) && Objects.equals(time, that.time) && Objects.equals(createTime, that.createTime) && Objects.equals(procedureId, that.procedureId) && Objects.equals(clientId, that.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentId, date, time, createTime, procedureId, clientId);
    }

    public Procedure getProcedureByProcedureId() {
        return procedureByProcedureId;
    }

    public void setProcedureByProcedureId(Procedure procedureByProcedureId) {
        this.procedureByProcedureId = procedureByProcedureId;
    }

    public Client getClientsByClientId() {
        return clientsByClientId;
    }

    public void setClientsByClientId(Client clientsByClientId) {
        this.clientsByClientId = clientsByClientId;
    }
}
