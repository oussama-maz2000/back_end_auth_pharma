package com.pharmacy.authenctication.pahrma.Auth.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PharmaDTO {


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
}
