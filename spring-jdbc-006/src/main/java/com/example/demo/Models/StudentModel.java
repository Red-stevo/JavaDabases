package com.example.demo.Models;

import org.springframework.stereotype.Component;

@Component
public class StudentModel {
    private  String fName;

    private  String sName;

    private  String regno;

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }

    public String getRegno() {
        return regno;
    }

    public String toString()
    {
        return """
                
                Student First Name :\s"""+ fName+ """
                Student Second Name  \r:\s"""+ sName+ """
                Student Registration No :\s"""+regno;
    }
}
