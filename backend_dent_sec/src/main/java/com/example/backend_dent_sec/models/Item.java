package com.example.backend_dent_sec.models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "items", schema = "dentist_secretary", catalog = "")
public class Item {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "item_id")
    private Integer itemId;
    @Basic
    @Column(name = "item_name")
    private String itemName;
    @Basic
    @Column(name = "quantity")
    private Integer quantity;
    @Basic
    @Column(name = "type")
    private String type;
    @OneToMany(mappedBy = "itemsByItemId")
    private Collection<ProcedureItem> procedureItemsByItemId;
    @OneToMany(mappedBy = "itemsByItemId")
    private Collection<SalesRepItem> salesRepsItemsByItemId;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(itemId, item.itemId) && Objects.equals(itemName, item.itemName) && Objects.equals(quantity, item.quantity) && Objects.equals(type, item.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, itemName, quantity, type);
    }

    public Collection<ProcedureItem> getProcedureItemsByItemId() {
        return procedureItemsByItemId;
    }

    public void setProcedureItemsByItemId(Collection<ProcedureItem> procedureItemsByItemId) {
        this.procedureItemsByItemId = procedureItemsByItemId;
    }

    public Collection<SalesRepItem> getSalesRepsItemsByItemId() {
        return salesRepsItemsByItemId;
    }

    public void setSalesRepsItemsByItemId(Collection<SalesRepItem> salesRepsItemsByItemId) {
        this.salesRepsItemsByItemId = salesRepsItemsByItemId;
    }
}
