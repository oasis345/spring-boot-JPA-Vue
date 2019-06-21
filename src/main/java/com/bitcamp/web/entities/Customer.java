package com.bitcamp.web.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
* Customer
*/
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Table(name = "customers")
public class Customer implements Serializable{
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  @Column(name="customer_Id") private String customer_Id;
  @Column(name="customer_Name") private String customer_Name;
  @Column(name="password") private String password;
  @Column(name="ssn") private String ssn;
  @Column(name="phone") private String phone;
  @Column(name="city") private String city;
  @Column(name="address") private String address;
  @Column(name="postalcode") private String postalcode;
  @Column(name="photo") private String photo;


  
  @Override
  public String toString(){
      return String.format("고객정보 NO : %d\n"
      +"ID : %s", id, customer_Id);
  }
  @Builder
  private Customer(String customer_Id, String customer_Name, String password, String ssn, String phone,
                   String city, String address, String postalcode, String photo){
      this.customer_Id = customer_Id;
      this.customer_Name = customer_Name;
      this.password = password;
      this.ssn = ssn;
      this.phone = phone;
      this.city = city;
      this.address = address;
      this.postalcode = postalcode;
      this.photo = photo;
  }

}