package com.example.backend_dent_sec.repositories;

import com.example.backend_dent_sec.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {
}
