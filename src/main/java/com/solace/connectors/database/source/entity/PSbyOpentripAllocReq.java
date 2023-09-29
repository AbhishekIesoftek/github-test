package com.solace.connector.db.pull.entity;
// Generated Sep 28, 2023, 3:52:21 PM by Hibernate Tools 5.6.2.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PSbyOpentripAllocReq generated by hbm2java
 */
@Entity
@Table(name="P_SBY_OPENTRIP_ALLOC_REQ"
    
)
public class PSbyOpentripAllocReq  implements java.io.Serializable {


     private PSbyOpentripAllocReqId id;

    public PSbyOpentripAllocReq() {
    }

    public PSbyOpentripAllocReq(PSbyOpentripAllocReqId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="reqId", column=@Column(name="REQ_ID", precision=22, scale=0) ), 
        @AttributeOverride(name="pairRef", column=@Column(name="PAIR_REF", length=25) ), 
        @AttributeOverride(name="pairDate", column=@Column(name="PAIR_DATE", length=7) ), 
        @AttributeOverride(name="crewType", column=@Column(name="CREW_TYPE", length=1) ), 
        @AttributeOverride(name="fleet", column=@Column(name="FLEET", length=50) ), 
        @AttributeOverride(name="rank", column=@Column(name="RANK", length=10) ), 
        @AttributeOverride(name="crewSelected", column=@Column(name="CREW_SELECTED", length=20) ), 
        @AttributeOverride(name="status", column=@Column(name="STATUS", length=1) ), 
        @AttributeOverride(name="createdOn", column=@Column(name="CREATED_ON", length=7) ), 
        @AttributeOverride(name="modOn", column=@Column(name="MOD_ON", length=7) ), 
        @AttributeOverride(name="loggedBy", column=@Column(name="LOGGED_BY", length=25) ), 
        @AttributeOverride(name="adbSubject", column=@Column(name="ADB_SUBJECT") ), 
        @AttributeOverride(name="adbSequence", column=@Column(name="ADB_SEQUENCE", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="adbSetSequence", column=@Column(name="ADB_SET_SEQUENCE", precision=22, scale=0) ), 
        @AttributeOverride(name="adbTimestamp", column=@Column(name="ADB_TIMESTAMP", length=13) ), 
        @AttributeOverride(name="adbOpcode", column=@Column(name="ADB_OPCODE", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="adbUpdateAll", column=@Column(name="ADB_UPDATE_ALL", precision=22, scale=0) ), 
        @AttributeOverride(name="adbRefObject", column=@Column(name="ADB_REF_OBJECT", length=64) ), 
        @AttributeOverride(name="adbLDeliveryStatus", column=@Column(name="ADB_L_DELIVERY_STATUS", length=1) ), 
        @AttributeOverride(name="adbLCmsequence", column=@Column(name="ADB_L_CMSEQUENCE", precision=38, scale=0) ), 
        @AttributeOverride(name="adbTrackingid", column=@Column(name="ADB_TRACKINGID", length=40) ) } )
    public PSbyOpentripAllocReqId getId() {
        return this.id;
    }
    
    public void setId(PSbyOpentripAllocReqId id) {
        this.id = id;
    }




}


