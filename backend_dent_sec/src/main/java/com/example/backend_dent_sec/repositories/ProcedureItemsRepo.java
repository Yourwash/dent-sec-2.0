package com.example.backend_dent_sec.repositories;

import com.example.backend_dent_sec.models.ProcedureItem;
import com.example.backend_dent_sec.models.ProcedureItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedureItemsRepo extends JpaRepository<ProcedureItem, ProcedureItemPK> {
}
