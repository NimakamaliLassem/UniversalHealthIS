/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.util.ArrayList;
import java.util.Scanner;
import service_types.GymAndFitness;
import service_types.Rehabilitation;
import service_types.Services;
import service_types.SpaAndSauna;
import service_types.YogaAndStretching;

/**
 *
 * @author Davut Atajanov
 */
public class Client extends UniverseHealth{
    private double bDay;
    private int couponCode;
    private String companyName;
    private ArrayList<Services> enrollment = new ArrayList();
    private double totalPayment = 0;
    SpecialDeals discounts = new SpecialDeals();
    Approval approvalObj;
    private String charity = "";
    GymAndFitness gf;
    double totalp;

    /*public Client(int id, String nameSurname, String password) {
        super(id, nameSurname, password);
    }*/

    
    public Client(int choiceId, String newNameSurname,
            String newPassword1,double bday, int couponCode,
            String companyName, String charity,
            ArrayList<Services> arr, String doctorName, int healthStatus, double totalp) {
        super(choiceId, newNameSurname, newPassword1);
        this.bDay = bDay;
        this.couponCode = couponCode;
        this.companyName = companyName;
        this.charity = charity;
        this.totalp=totalp;
        getService(arr, doctorName, healthStatus); 
    }
    
    
   
    
    public void getService(ArrayList<Services> arr, String doctorName,
            int healthStatus){
        /*
        System.out.println("Enter your birthday please : ");
        this.bDay = sc.nextDouble();
        System.out.println("Do you have a coupon code? : ");
        couponCode = sc.nextInt();
        System.out.println("Do you work somewhere? : ");
        companyName = sc.next();
        String choice;
        System.out.println("If you are disabled person, please type (yes) : ");
        charity = sc.next();*/
        
        Services tempObj = null;
        //do{
        //System.out.println("Our services = (Gym, Rehab, Spa, Yoga)");
        //System.out.println("Which services do you want to use? : (Stop to stop)");
        //choice = sc.next();
        for(int i = 0; i<arr.size();i++){
        if(arr.get(i) instanceof GymAndFitness){
            //System.out.println("Which days do you want to come? : (1 for odd days, 2 for even days)");
            int newDaysAttending = arr.get(i).getDaysAttending();
            //System.out.println("Which time of the day do you want to attend? : (Morning, Afternoon, Evening)");
            String newTimeDuringDay = arr.get(i).getTimeDuringDay();
            //System.out.println("Which service level do you prefer? : (Econ, Luxury, Grand)");
            String newServiceLevel = arr.get(i).getServiceLevel();
            tempObj = new GymAndFitness(newDaysAttending, newTimeDuringDay, newServiceLevel, ((GymAndFitness) arr.get(i)).getPreference());
            
            enrollment.add(tempObj);
        }
        
        else if(arr.get(i) instanceof Rehabilitation){
                //System.out.println("For SpaAndSauna you need good heart condition : ");
                approvalObj = new Approval(healthStatus, doctorName);
                //if(approvalObj.getHealthCondition()<=3){
            //System.out.println("Which days do you want to come? : (1 for odd days, 2 for even days)");
            int newDaysAttending = arr.get(i).getDaysAttending();
            //System.out.println("Which time of the day do you want to attend? : (Morning, Afternoon, Evening)");
            String newTimeDuringDay = arr.get(i).getTimeDuringDay();
            //System.out.println("Which service level do you prefer? : (Econ, Luxury, Grand)");
            String newServiceLevel = arr.get(i).getServiceLevel();
            tempObj = new Rehabilitation(newDaysAttending, newTimeDuringDay, newServiceLevel, ((Rehabilitation) arr.get(i)).getPreference());
            enrollment.add(tempObj);
//                }
//                else
//                    System.out.println("NO NEED");
        }
        
        else if(arr.get(i) instanceof SpaAndSauna){
            //System.out.println("Which days do you want to come? : (1 for odd days, 2 for even days)");
            int newDaysAttending = arr.get(i).getDaysAttending();
            //System.out.println("Which time of the day do you want to attend? : (Morning, Afternoon, Evening)");
            String newTimeDuringDay = arr.get(i).getTimeDuringDay();
            //System.out.println("Which service level do you prefer? : (Econ, Luxury, Grand)");
            String newServiceLevel = arr.get(i).getServiceLevel();
            tempObj = new YogaAndStretching(newDaysAttending, newTimeDuringDay, newServiceLevel, ((SpaAndSauna) arr.get(i)).getPreference());
            enrollment.add(tempObj);
        }
        
        else if(arr.get(i) instanceof YogaAndStretching){
                //System.out.println("For SpaAndSauna you need good heart condition : ");
                //approvalObj = new Approval(healthStatus, doctorName);
                //if(approvalObj.getHealthCondition()>=4){
            //System.out.println("Which days do you want to come? : (1 for odd days, 2 for even days)");
            int newDaysAttending = arr.get(i).getDaysAttending();
            //System.out.println("Which time of the day do you want to attend? : (Morning, Afternoon, Evening)");
            String newTimeDuringDay = arr.get(i).getTimeDuringDay();
            //System.out.println("Which service level do you prefer? : (Econ, Luxury, Grand)");
            String newServiceLevel = arr.get(i).getServiceLevel();
            tempObj = new SpaAndSauna(newDaysAttending, newTimeDuringDay, newServiceLevel, ((YogaAndStretching) arr.get(i)).getPreference());
            enrollment.add(tempObj);
            //}
                //else
                    //System.out.println("REJECTED");
               
        }
        }
        
        //}while(!choice.equalsIgnoreCase("stop"));
        
        calcDiscount();
        calcPayment();
    }
    
    public void calcPayment(){
        int discount = calcDiscount();
        this.totalPayment*=discount/100;
    }
    
    public int calcDiscount(){
        int totalDiscount = 0;
        
        if(discounts.couponDiscount==couponCode)  // our coupon code is 1567
            totalDiscount = 10;
        
        for(int i=0;i<discounts.companyNames.size();i++){
            if(discounts.companyNames.get(i).company.equalsIgnoreCase(this.companyName)){
                totalDiscount += discounts.companyNames.get(i).discount;
            }
        }
        return totalDiscount;
    }

    public String getEnrollment() {
        String enroll = "";
        for(int i=0;i<enrollment.size();i++){
            if(enrollment.get(i) instanceof GymAndFitness)
            enroll += "\nGym "+enrollment.get(i).getDaysAttending()+" "+enrollment.get(i).getTimeDuringDay() + " "+enrollment.get(i).getServiceLevel()
                    +" "+((GymAndFitness) enrollment.get(i)).getPreference();
            else if(enrollment.get(i) instanceof Rehabilitation)
            enroll += "\nRehab "+enrollment.get(i).getDaysAttending()+" "+enrollment.get(i).getTimeDuringDay() + " "+enrollment.get(i).getServiceLevel()
                    +" "+((Rehabilitation) enrollment.get(i)).getPreference();
            else if(enrollment.get(i) instanceof SpaAndSauna)
            enroll += "\nSpa "+enrollment.get(i).getDaysAttending()+" "+enrollment.get(i).getTimeDuringDay() + " "+enrollment.get(i).getServiceLevel()
                    +" "+((SpaAndSauna) enrollment.get(i)).getPreference();
            else if(enrollment.get(i) instanceof YogaAndStretching)
            enroll += "\nYoga "+enrollment.get(i).getDaysAttending()+" "+enrollment.get(i).getTimeDuringDay() + " "+enrollment.get(i).getServiceLevel()
                    +" "+((YogaAndStretching) enrollment.get(i)).getPreference();
        }
        return enroll;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    @Override
    void serviceType() {
        if(charity.equalsIgnoreCase("yes"))
            this.totalPayment *= 0.25;  // we only take 25% of total payment if person is disabled
    }
    
  @Override
    public String toString(){
        String back = "";
        for(int i = 0; i<enrollment.size();i++){
            back+= i+1+")";
            if(enrollment.get(i) instanceof GymAndFitness)
            back += ((GymAndFitness)enrollment.get(i)).toString();
            else if(enrollment.get(i) instanceof YogaAndStretching)
            back += ((YogaAndStretching)enrollment.get(i)).toString();
            else if(enrollment.get(i) instanceof SpaAndSauna)
            back += ((SpaAndSauna)enrollment.get(i)).toString();
            else if(enrollment.get(i) instanceof Rehabilitation)
            back += ((Rehabilitation)enrollment.get(i)).toString();
        }
        return  "Hello "+super.nameSurname+
                "\nID: "+ super.id+
                "\n"+
                "\nTotal cost : " +totalp+
                "\nYou are enrolled in these: \n"+ back;
    }

    public double getbDay() {
        return bDay;
    }

    public int getCouponCode() {
        return couponCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCharity() {
        return charity;
    }
    
    public int getEnrollmentSize(){
        return enrollment.size();
    }
    
    
   }
    
    



