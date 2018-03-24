package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usertable")
public class User {
  @Id
  @Column(name = "id")
  private String id;

  @Column(name = "fname")
  private String fname;

  @Column(name = "lname")
  private String lname;
  @Column(name = "dob")
  private String dob;

  @Column(name = "gender")
  private String gender;

  @Column(name = "email")
  private String email;

  public User() { }

  public User(String id, String fname,String lname, String dob, String gender, String email){
    super();
    this.id = id;
    this.fname = fname;
    this.lname = lname;
    this.dob = dob;
    this.gender = gender;
    this.email = email;
  }

  public String getId() { return id; }

  public void setId(String id) { this.id = id; }

  public String getFname() { return fname; }

  public void setFname(String fname) { this.fname = fname; }

  public String getLname() { return lname; }

  public void setLname(String lname) { this.lname = lname; }

  public String getDob() { return dob; }

  public void setDob(String dob) { this.dob = dob; }

  public String getGender() { return gender; }

  public void setGender(String gender) { this.gender = gender; }

  public String getEmail() { return email; }

  public void setEmail(String email) { this.email = email; }
}
