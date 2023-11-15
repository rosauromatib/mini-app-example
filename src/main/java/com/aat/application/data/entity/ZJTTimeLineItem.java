package com.aat.application.data.entity;

import com.aat.application.annotations.ShowField;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "zjt_timeline_item")
public class ZJTTimeLineItem extends ZJTSuperTimeLineItem {
    @ManyToOne
    @JoinColumn(name = "node_id")
    @ShowField(show = true)
    private ZJTTimeLineNode group;

    public ZJTTimeLineNode getNode() {
        return group;
    }

    public void setNode(ZJTTimeLineNode group) {
        this.group = group;
    }
}