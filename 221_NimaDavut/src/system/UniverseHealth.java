/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Davut Atajanov
 */
public abstract class UniverseHealth  {
    
    //protected String type;
    protected int id;
    protected String nameSurname;
    protected java.util.Date dateRegistered = new Date();
    protected String passwordx;
    protected static int numOfServices = 0; // we need this to create data in "company"
    
    UniverseHealth(int id, String nameSurname, String passwordx){
        this.id = id;
        this.nameSurname = nameSurname;
        this.passwordx = passwordx;
    }
    
    public int getId(){
        return id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }
    
    public String getPassword(){
        return this.passwordx;
    }
    
    abstract void serviceType();
    
    public boolean checkPassword(String password){
        return this.passwordx.equalsIgnoreCase(password);
    }
    
    public static void increment(){
        numOfServices++;
    }
}
