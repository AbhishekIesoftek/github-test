package com.solace.connector.db.pull.entity;
// Generated Sep 28, 2023, 3:52:21 PM by Hibernate Tools 5.6.2.Final


import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SourcePassengerId generated by hbm2java
 */
@Embeddable
public class SourcePassengerId  implements java.io.Serializable {


     private BigDecimal passengerId;
     private String dbtrackid;
     private Date readtime;
     private String address;
     private Date birthday;
     private Blob blobc;
     private String clobc;
     private String contactNo;
     private Date createdAt;
     private String flag;
     private String name;
     private String nationality;

    public SourcePassengerId() {
    }

	
    public SourcePassengerId(BigDecimal passengerId) {
        this.passengerId = passengerId;
    }
    public SourcePassengerId(BigDecimal passengerId, String dbtrackid, Date readtime, String address, Date birthday, Blob blobc, String clobc, String contactNo, Date createdAt, String flag, String name, String nationality) {
       this.passengerId = passengerId;
       this.dbtrackid = dbtrackid;
       this.readtime = readtime;
       this.address = address;
       this.birthday = birthday;
       this.blobc = blobc;
       this.clobc = clobc;
       this.contactNo = contactNo;
       this.createdAt = createdAt;
       this.flag = flag;
       this.name = name;
       this.nationality = nationality;
    }
   


    @Column(name="PASSENGER_ID", nullable=false, precision=10, scale=0)
    public BigDecimal getPassengerId() {
        return this.passengerId;
    }
    
    public void setPassengerId(BigDecimal passengerId) {
        this.passengerId = passengerId;
    }


    @Column(name="DBTRACKID")
    public String getDbtrackid() {
        return this.dbtrackid;
    }
    
    public void setDbtrackid(String dbtrackid) {
        this.dbtrackid = dbtrackid;
    }


    @Column(name="READTIME", length=11)
    public Date getReadtime() {
        return this.readtime;
    }
    
    public void setReadtime(Date readtime) {
        this.readtime = readtime;
    }


    @Column(name="ADDRESS")
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }


    @Column(name="BIRTHDAY", length=11)
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Column(name="BLOBC")
    public Blob getBlobc() {
        return this.blobc;
    }
    
    public void setBlobc(Blob blobc) {
        this.blobc = blobc;
    }


    @Column(name="CLOBC")
    public String getClobc() {
        return this.clobc;
    }
    
    public void setClobc(String clobc) {
        this.clobc = clobc;
    }


    @Column(name="CONTACT_NO")
    public String getContactNo() {
        return this.contactNo;
    }
    
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }


    @Column(name="CREATED_AT", length=11)
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    @Column(name="FLAG")
    public String getFlag() {
        return this.flag;
    }
    
    public void setFlag(String flag) {
        this.flag = flag;
    }


    @Column(name="NAME")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }


    @Column(name="NATIONALITY")
    public String getNationality() {
        return this.nationality;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SourcePassengerId) ) return false;
		 SourcePassengerId castOther = ( SourcePassengerId ) other; 
         
		 return ( (this.getPassengerId()==castOther.getPassengerId()) || ( this.getPassengerId()!=null && castOther.getPassengerId()!=null && this.getPassengerId().equals(castOther.getPassengerId()) ) )
 && ( (this.getDbtrackid()==castOther.getDbtrackid()) || ( this.getDbtrackid()!=null && castOther.getDbtrackid()!=null && this.getDbtrackid().equals(castOther.getDbtrackid()) ) )
 && ( (this.getReadtime()==castOther.getReadtime()) || ( this.getReadtime()!=null && castOther.getReadtime()!=null && this.getReadtime().equals(castOther.getReadtime()) ) )
 && ( (this.getAddress()==castOther.getAddress()) || ( this.getAddress()!=null && castOther.getAddress()!=null && this.getAddress().equals(castOther.getAddress()) ) )
 && ( (this.getBirthday()==castOther.getBirthday()) || ( this.getBirthday()!=null && castOther.getBirthday()!=null && this.getBirthday().equals(castOther.getBirthday()) ) )
 && ( (this.getBlobc()==castOther.getBlobc()) || ( this.getBlobc()!=null && castOther.getBlobc()!=null && this.getBlobc().equals(castOther.getBlobc()) ) )
 && ( (this.getClobc()==castOther.getClobc()) || ( this.getClobc()!=null && castOther.getClobc()!=null && this.getClobc().equals(castOther.getClobc()) ) )
 && ( (this.getContactNo()==castOther.getContactNo()) || ( this.getContactNo()!=null && castOther.getContactNo()!=null && this.getContactNo().equals(castOther.getContactNo()) ) )
 && ( (this.getCreatedAt()==castOther.getCreatedAt()) || ( this.getCreatedAt()!=null && castOther.getCreatedAt()!=null && this.getCreatedAt().equals(castOther.getCreatedAt()) ) )
 && ( (this.getFlag()==castOther.getFlag()) || ( this.getFlag()!=null && castOther.getFlag()!=null && this.getFlag().equals(castOther.getFlag()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) )
 && ( (this.getNationality()==castOther.getNationality()) || ( this.getNationality()!=null && castOther.getNationality()!=null && this.getNationality().equals(castOther.getNationality()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPassengerId() == null ? 0 : this.getPassengerId().hashCode() );
         result = 37 * result + ( getDbtrackid() == null ? 0 : this.getDbtrackid().hashCode() );
         result = 37 * result + ( getReadtime() == null ? 0 : this.getReadtime().hashCode() );
         result = 37 * result + ( getAddress() == null ? 0 : this.getAddress().hashCode() );
         result = 37 * result + ( getBirthday() == null ? 0 : this.getBirthday().hashCode() );
         result = 37 * result + ( getBlobc() == null ? 0 : this.getBlobc().hashCode() );
         result = 37 * result + ( getClobc() == null ? 0 : this.getClobc().hashCode() );
         result = 37 * result + ( getContactNo() == null ? 0 : this.getContactNo().hashCode() );
         result = 37 * result + ( getCreatedAt() == null ? 0 : this.getCreatedAt().hashCode() );
         result = 37 * result + ( getFlag() == null ? 0 : this.getFlag().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         result = 37 * result + ( getNationality() == null ? 0 : this.getNationality().hashCode() );
         return result;
   }   


}


