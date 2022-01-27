/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.util.ArrayList;

/**
 *
 * @author Davut Atajanov
 */
public class SpecialDeals {
    public double bDayDiscount;
    public double couponDiscount = 1567;
    ArrayList <companies> companyNames = new ArrayList();
    
    SpecialDeals(){
        companies object = new companies("Petronas",10);
        companyNames.add(object);
        object = new companies("Ulker",20);
        companyNames.add(object);
        object = new companies("AcerTurkiye",25);
        companyNames.add(object);
        object = new companies("Bilkent",35);
        companyNames.add(object);
        
        bDayDiscount = 25;
    }
    
    
    
    
    public class companies{
        public String company;
        public int discount;
        companies(String company, int discount){
        this.company = company;
        this.discount = discount;
    }
    }
}


