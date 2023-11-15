package com.aat.application.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vaadin.flow.router.PageTitle;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "zjt_driver")
@PageTitle("TimeLine")
public class ZJTDriver extends ZJTSuperTimeLineNode implements Serializable {
    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ZJTVehicleBooking> items;

    public List<ZJTVehicleBooking> getItems() {
        return items;
    }

    public void setItems(List<ZJTVehicleBooking> items) {
        this.items = items;
    }
}