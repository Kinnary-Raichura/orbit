package com.nexient.nbcu.orbit.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import javax.persistence.*;

/**
 * Created by kraichura on 11/20/2015.
 */
@Entity
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dealId;

    private String customerName;

    private String dealMaker;
    private String description;
    private String project;

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime dealDate;

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonIgnore
    private DateTime creationTime;

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonIgnore
    private DateTime modificationTime;

    public Deal(){

    }

    public Deal(String customerName, String dealMaker, String description, String project){
        this.customerName = customerName;
        this.dealMaker = dealMaker;
        this.description = description;
        this.project = project;
    }

    @PrePersist
    public void prePersist() {
        DateTime now = DateTime.now();
        creationTime = now;
        modificationTime = now;
        dealDate = now;
    }

    @PreUpdate
    public void preUpdate() {
        modificationTime = DateTime.now();
    }

    public long getDealId() {
        return dealId;
    }

    public void setDealId(long dealId) {
        this.dealId = dealId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDealMaker() {
        return dealMaker;
    }

    public void setDealMaker(String dealMaker) {
        this.dealMaker = dealMaker;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDealDate() {
        DateTimeFormatter dtf = DateTimeFormat.forPattern("MM/dd/yyyy");
        return dtf.print(dealDate);
    }

    public void setDealDate(DateTime dealDate) {
        this.dealDate = dealDate;
    }

    public DateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
    }

    public DateTime getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(DateTime modificationTime) {
        this.modificationTime = modificationTime;
    }
}
