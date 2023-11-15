package com.aat.application.data.entity;

import com.aat.application.annotations.DisplayName;
import com.aat.application.annotations.ShowField;
import com.aat.application.core.data.entity.ZJTEntity;
import com.vaadin.flow.router.PageTitle;
import jakarta.persistence.*;


/**
 * Entity implementation class for Entity: ZJTPricingType
 */
@Entity
@Table(name = "zjt_pricingtype")
@PageTitle("Pricing Type")
public class ZJTPricingType implements ZJTEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "zjt_pricingtype_id")
    @ShowField(show = false)
    private int zjt_pricingtype_id;

    @Column
    @DisplayName(value = "Name")
    private String name = "";

    @Column
    @DisplayName(value = "Description")
    private String description = "";

    public int getZjt_pricingtype_id() {
        return zjt_pricingtype_id;
    }

    @Override
    public int getId() {
        return zjt_pricingtype_id;
    }

    public void setZjt_pricingtype_id(int zjt_pricingtype_id) {
        this.zjt_pricingtype_id = zjt_pricingtype_id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
