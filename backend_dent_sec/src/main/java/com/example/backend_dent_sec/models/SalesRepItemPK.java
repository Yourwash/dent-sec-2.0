package com.example.backend_dent_sec.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class SalesRepItemPK implements Serializable {
    @Column(name = "item_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;
    @Column(name = "sales_rep_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer salesRepId;

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
        SalesRepItemPK that = (SalesRepItemPK) o;
        return Objects.equals(itemId, that.itemId) && Objects.equals(salesRepId, that.salesRepId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, salesRepId);
    }
}
