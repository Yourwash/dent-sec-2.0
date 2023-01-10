package com.example.backend_dent_sec.repositories;

import com.example.backend_dent_sec.models.ApointmentStaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentStaffRepo extends JpaRepository<ApointmentStaff, Integer> {
}
