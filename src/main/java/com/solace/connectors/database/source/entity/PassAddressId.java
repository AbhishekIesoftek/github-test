package com.solace.connector.db.pull.entity;
// Generated Sep 28, 2023, 3:52:21 PM by Hibernate Tools 5.6.2.Final


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PassAddressId generated by hbm2java
 */
@Embeddable
public class PassAddressId  implements java.io.Serializable {


     private BigDecimal id;
     private String city;
     private String zip;
     private BigDecimal passId;

    public PassAddressId() {
    }

	
    public PassAddressId(BigDecimal id) {
        this.id = id;
    }
    public PassAddressId(BigDecimal id, String city, String zip, BigDecimal passId) {
       this.id = id;
       this.city = city;
       this.zip = zip;
       this.passId = passId;
    }
   


    @Column(name="ID", nullable=false, precision=10, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }


    @Column(name="CITY")
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }


    @Column(name="ZIP")
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }


    @Column(name="PASS_ID", precision=10, scale=0)
    public BigDecimal getPassId() {
        return this.passId;
    }
    
    public void setPassId(BigDecimal passId) {
        this.passId = passId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PassAddressId) ) return false;
		 PassAddressId castOther = ( PassAddressId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getCity()==castOther.getCity()) || ( this.getCity()!=null && castOther.getCity()!=null && this.getCity().equals(castOther.getCity()) ) )
 && ( (this.getZip()==castOther.getZip()) || ( this.getZip()!=null && castOther.getZip()!=null && this.getZip().equals(castOther.getZip()) ) )
 && ( (this.getPassId()==castOther.getPassId()) || ( this.getPassId()!=null && castOther.getPassId()!=null && this.getPassId().equals(castOther.getPassId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getCity() == null ? 0 : this.getCity().hashCode() );
         result = 37 * result + ( getZip() == null ? 0 : this.getZip().hashCode() );
         result = 37 * result + ( getPassId() == null ? 0 : this.getPassId().hashCode() );
         return result;
   }   


}


