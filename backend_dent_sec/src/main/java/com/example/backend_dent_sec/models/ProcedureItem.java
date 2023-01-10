package com.example.backend_dent_sec.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "procedure_items", schema = "dentist_secretary", catalog = "")
@IdClass(ProcedureItemPK.class)
public class ProcedureItem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "item_id")
    private Integer itemId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "procedure_id")
    private Integer procedureId;
    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "item_id", nullable = false)
    private Item itemsByItemId;
    @ManyToOne
    @JoinColumn(name = "procedure_id", referencedColumnName = "procedure_id", nullable = false)
    private Procedure procedureByProcedureId;

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
        ProcedureItem that = (ProcedureItem) o;
        return Objects.equals(itemId, that.itemId) && Objects.equals(procedureId, that.procedureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, procedureId);
    }

    public Item getItemsByItemId() {
        return itemsByItemId;
    }

    public void setItemsByItemId(Item itemsByItemId) {
        this.itemsByItemId = itemsByItemId;
    }

    public Procedure getProcedureByProcedureId() {
        return procedureByProcedureId;
    }

    public void setProcedureByProcedureId(Procedure procedureByProcedureId) {
        this.procedureByProcedureId = procedureByProcedureId;
    }
}
