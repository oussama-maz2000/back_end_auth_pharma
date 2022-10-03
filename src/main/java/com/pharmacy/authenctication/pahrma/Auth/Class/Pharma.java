package com.pharmacy.authenctication.pahrma.Auth.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "pharmacy")
public class Pharma {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long pharmacyID;

  private String first_name;
  private String last_name;
  private String password;
  private String confirme_password;
  private String pharmacy_name;
  private String employes;
  private String street;
  private String info;
  private String zipcode;
  private String willaya;
  private String phone;
  private double longitude;
  private double latitude;


  public Pharma(
    String first_name,
    String last_name,
    String password,
    String confirme_password,
    String pharmacy_name,
    String employes,
    String street,
    String info,
    String zipcode,
    String willaya,
    String phone,
    double longitude,
    double latitude
  ) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.password = password;
    this.confirme_password = confirme_password;
    this.pharmacy_name = pharmacy_name;
    this.employes = employes;
    this.street = street;
    this.info = info;
    this.zipcode = zipcode;
    this.willaya = willaya;
    this.phone = phone;
    this.longitude=longitude;
    this.latitude=latitude;
  }
}
