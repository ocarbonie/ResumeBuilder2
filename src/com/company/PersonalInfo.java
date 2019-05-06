package com.company;

public class PersonalInfo {
    private String name;
    private String email;
    private String phone;

    public PersonalInfo() {
    }

    public PersonalInfo(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void addName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void addEmail(String email) {
        this.email = email;
    }

    public String getPhone(){return phone; }

    public void addPhone(String phone) {this.phone = phone;}

    public String toString() {
        return(getName() +"\n"+getEmail() + "\n"+ getPhone());
    }
}

