package com.example.backend_dent_sec.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "sales_reps_items", schema = "dentist_secretary", catalog = "")
@IdClass(SalesRepItemPK.class)
public class SalesRepItem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "item_id")
    private Integer itemId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sales_rep_id")
    private Integer salesRepId;
    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "item_id", nullable = false)
    private Item itemsByItemId;
    @ManyToOne
    @JoinColumn(name = "sales_rep_id", referencedColumnName = "sales_rep_id", nullable = false)
    private SalesRep salesRepsBySalesRepId;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getSalesRepId() {
        return salesRepId;
    }

    public void setSalesRepId(Integer salesRepId) {
        this.salesRepId = salesRepId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesRepItem that = (SalesRepItem) o;
        return Objects.equals(itemId, that.itemId) && Objects.equals(salesRepId, that.salesRepId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, salesRepId);
    }

    public Item getItemsByItemId() {
        return itemsByItemId;
    }

    public void setItemsByItemId(Item itemsByItemId) {
        this.itemsByItemId = itemsByItemId;
    }

    public SalesRep getSalesRepsBySalesRepId() {
        return salesRepsBySalesRepId;
    }

    public void setSalesRepsBySalesRepId(SalesRep salesRepsBySalesRepId) {
        this.salesRepsBySalesRepId = salesRepsBySalesRepId;
    }
}
