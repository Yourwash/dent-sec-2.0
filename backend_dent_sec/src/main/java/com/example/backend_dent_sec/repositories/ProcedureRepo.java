package com.example.backend_dent_sec.repositories;

import com.example.backend_dent_sec.models.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedureRepo extends JpaRepository<Procedure, Integer> {
}
