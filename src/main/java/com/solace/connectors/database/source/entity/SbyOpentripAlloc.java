package com.solace.connector.db.pull.entity;
// Generated Sep 28, 2023, 3:52:21 PM by Hibernate Tools 5.6.2.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SbyOpentripAlloc generated by hbm2java
 */
@Entity
@Table(name="SBY_OPENTRIP_ALLOC"
    
)
public class SbyOpentripAlloc  implements java.io.Serializable {


     private SbyOpentripAllocId id;

    public SbyOpentripAlloc() {
    }

    public SbyOpentripAlloc(SbyOpentripAllocId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="staffId", column=@Column(name="STAFF_ID", precision=22, scale=0) ), 
        @AttributeOverride(name="status", column=@Column(name="STATUS", length=1) ), 
        @AttributeOverride(name="createdOn", column=@Column(name="CREATED_ON", length=7) ), 
        @AttributeOverride(name="modOn", column=@Column(name="MOD_ON", length=7) ), 
        @AttributeOverride(name="loggedBy", column=@Column(name="LOGGED_BY", length=25) ), 
        @AttributeOverride(name="reason", column=@Column(name="REASON", length=4000) ), 
        @AttributeOverride(name="reqId", column=@Column(name="REQ_ID", precision=22, scale=0) ) } )
    public SbyOpentripAllocId getId() {
        return this.id;
    }
    
    public void setId(SbyOpentripAllocId id) {
        this.id = id;
    }




}


