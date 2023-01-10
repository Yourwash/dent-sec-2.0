package com.example.backend_dent_sec.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "apointment_staff", schema = "dentist_secretary", catalog = "")
@IdClass(ApointmentStaffPK.class)
public class ApointmentStaff {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "staff_id")
    private Integer staffId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "appointment_id")
    private Integer appointmentId;
    @ManyToOne
    @JoinColumn(name = "staff_id", referencedColumnName = "staff_id", nullable = false)
    private StaffMember staffByStaffId;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApointmentStaff that = (ApointmentStaff) o;
        return Objects.equals(staffId, that.staffId) && Objects.equals(appointmentId, that.appointmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, appointmentId);
    }

    public StaffMember getStaffByStaffId() {
        return staffByStaffId;
    }

    public void setStaffByStaffId(StaffMember staffByStaffId) {
        this.staffByStaffId = staffByStaffId;
    }
}
