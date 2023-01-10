package com.example.backend_dent_sec.repositories;

import com.example.backend_dent_sec.models.SalesRep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepRepo extends JpaRepository<SalesRep,Integer> {
}
