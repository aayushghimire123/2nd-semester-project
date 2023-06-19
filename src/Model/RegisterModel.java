/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author asism
 */
public class RegisterModel {
    String uname,pass,email,sec_ans;
    
    public RegisterModel(String uname, String pass, String email, String sec_ans)
    {
        this.uname=uname;
        this.pass=pass;
        
        this.email=email;
        this.sec_ans=sec_ans;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSec_ans() {
        return sec_ans;
    }
    
     public void setSec_ans(String sec_ans) {
        this.sec_ans = sec_ans;
    }

    
}
