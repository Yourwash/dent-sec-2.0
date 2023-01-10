package com.example.backend_dent_sec.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class ProcedureItemPK implements Serializable {
    @Column(name = "item_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;
    @Column(name = "procedure_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer procedureId;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(Integer procedureId) {
        this.procedureId = procedureId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcedureItemPK that = (ProcedureItemPK) o;
        return Objects.equals(itemId, that.itemId) && Objects.equals(procedureId, that.procedureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, procedureId);
    }
}
