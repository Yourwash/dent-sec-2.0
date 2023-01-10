package com.example.backend_dent_sec.repositories;

import com.example.backend_dent_sec.models.SalesRepItem;
import com.example.backend_dent_sec.models.SalesRepItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepItemRepo extends JpaRepository<SalesRepItem, SalesRepItemPK> {
}
