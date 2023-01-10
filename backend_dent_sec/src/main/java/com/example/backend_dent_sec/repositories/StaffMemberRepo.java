package com.example.backend_dent_sec.repositories;

import com.example.backend_dent_sec.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffMemberRepo extends JpaRepository<StaffMember,Integer> {
}
