/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import service_types.GymAndFitness;
import service_types.Rehabilitation;
import service_types.Services;
import service_types.SpaAndSauna;
import service_types.YogaAndStretching;
//import java.util.Scanner;

/**
 *
 * @author Davut Atajanov
 */
public class UniverseHealthSys{
   public static ArrayList <UniverseHealth> records = new ArrayList();
   static int whoGetsGift = 0;
    
    public static boolean checkId(int id){
        for(int i=0;i<records.size();i++)
            if(records.get(i).getId() == id)
                return true;
        return false;
    }
    
    public static String removePerson(int id){
        for(int i=0;i<records.size();i++)
            if(records.get(i).getId() == id){
                String person = records.get(i).getPassword();
                records.remove(i);
                return person+" has been removed\n";
            }
        return "Person does not exist\n";
    }
    
    public static boolean searchPerson(int id, String password){
        for(int i=0; i<records.size();i++)
            if(records.get(i).getId() == id)
                if(!records.get(i).getPassword().equalsIgnoreCase(password))
                    return false;
       return true;
    }
    
    public static void addPerson(int choiceId, String newNameSurname,
            String newPassword1,double bday, int couponCode,
            String companyName, String charity,
            ArrayList<Services> arr, String doctorName, int healthStatus, double totalp) throws IOException{
//        Scanner sc = new Scanner(System.in);
        UniverseHealth obj;
//        int choiceId;
//        System.out.println("Enter your id please : ");
//        choiceId = sc.nextInt();
//        System.out.println("What is your name and Surname? : (nameSurname)");
//        String newNameSurname = sc.next();
//        
//        System.out.println("What is your password? : ");
//        String newPassword1 = sc.next();


        //System.out.println("Retype your pass");
        //int ID = Integer.parseInt(id);
        
       
        //if(choiceId/10000000==1)
          obj = new Client(choiceId, newNameSurname, newPassword1, bday, couponCode, companyName, charity, arr, doctorName, healthStatus, totalp);
        
        /*else if(choiceId/10000000==2)
            obj = new Coach(choiceId, newNameSurname, newPassword1);*/
        
        records.add(obj);
//        System.out.println(records);
        
//        writeToBin();
       // System.out.println(records);
        
//        assignGift(); // everytime we get a new client/employee somebody in the company gets a gift, in order to get more customers or workers
    writeToFile();
    }
    
    public static void addCoach(int choiceId, String newNameSurname, String newPassword1, String empType, String charity, int workDays, boolean insurance, int extraDays) throws IOException{
        UniverseHealth obj = null;
        obj = new Coach(choiceId, newNameSurname, newPassword1, empType,charity, workDays, insurance, extraDays);
        
        records.add(obj);
//        writeToBin();
    writeToFile();
    }

    /*@Override
    public double calculateGift() {
        
        double random = Math.random() * 100;
        
        return random; // at this point it just gives a random gift to a random person, we are still thinking of this part
    }

    @Override
    public void assignGift() {
        whoGetsGift = (int) Math.floor(Math.random() * records.size());
        //randomly gives the gift to a random person
    }*/
    
    /*public static String display(){
        String back = "";
        for(int i=0;i<records.size();i++){
            back +=  records.get(i).toString()+"\n";
            if(this.whoGetsGift==i)
                System.out.println("Congrats you got the GIFT, we will give it to you as a coupon");
        }
        
        return back;
    }*/
    
    public static String seeCoaches(){
        String back = "";
        for(int i = 0; i<records.size(); i++)
            if(records.get(i) instanceof Coach){
                back += "Name: "+records.get(i).nameSurname+
                        "\nId: "+records.get(i).id+"\n";
                        }
        return back;
    }
    
    private static void writeToBin() throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream("Output.dat");
        ObjectOutputStream objo = new ObjectOutputStream(fos);
        objo.writeObject(records);
        
//        for(int i = 0; i<records.size();i++)
//            objo.writeObject(records.get(i));
        objo.close();
    }
    
    public static void readFromBin() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("Output.dat");
        ObjectInputStream obji = new ObjectInputStream(fis);
        
        int i=0;
        try{
            while(true){
               records.add((UniverseHealth) obji.readObject());
            }
        }catch(EOFException ex){
            ex.printStackTrace();
        }
    }
    public static String display(int id){
        String back = "";
        for(int i=0;i<records.size();i++){
            if((records.get(i) instanceof Client) && records.get(i).getId()==id)
            return  ((Client) records.get(i)).toString();
            else if((records.get(i) instanceof Coach) && records.get(i).getId()==id)
            return ((Coach) records.get(i)).toString();
        }
        
        return back;
    }
    
    public static void readFromFile() throws FileNotFoundException, IOException{
        File file = new File("universeHealth.txt");
        Scanner sc = new Scanner(file);
        
        ArrayList<Services> arrTemp = new ArrayList();
        while(sc.hasNext()){
            int choice = sc.nextInt();
            String docName = "";
            if(choice == 1){
                int id = sc.nextInt();
                String nameSurname = sc.next();
                String password = sc.next();
                double bDay = sc.nextDouble();
                int couponCode = sc.nextInt();
                String companyName = sc.next();
                String charity = sc.next();
                int numOfServices = sc.nextInt();
                for(int i=0; i<numOfServices;i++){
                    Services obj = null;
                    String pref = sc.next();
                    int evOdd = sc.nextInt();
                        String duringDay = sc.next();
                        String level = sc.next();
                        String preference = sc.next();
                    if(pref.equalsIgnoreCase("gym")){
                        obj = new GymAndFitness(evOdd, duringDay, level, preference);
                    }
                    else if(pref.equalsIgnoreCase("rehab"))
                        obj = new Rehabilitation(evOdd, duringDay, level, preference);
                    else if(pref.equalsIgnoreCase("spa"))
                        obj = new SpaAndSauna(evOdd, duringDay, level, preference);
                    else if(pref.equalsIgnoreCase("yoga"))
                        obj = new YogaAndStretching(evOdd, duringDay, level, preference);
                    
                    arrTemp.add(obj);
                    
                }
                docName = sc.next();
                sc.skip("");
                int healthStat = sc.nextInt();
                double payment = sc.nextDouble();
                
                UniverseHealthSys.addPerson(id, nameSurname, password, bDay, couponCode, companyName, charity, arrTemp, docName, healthStat, payment);
                
            }
            
            else if(choice == 2){
                int id = sc.nextInt();
                String nameSurname = sc.next();
                String password = sc.next();
                String empType = sc.next();
                String charity = sc.next();
                int workDays = sc.nextInt();
                boolean insuranceR = sc.nextBoolean();
                int extraDaysR = sc.nextInt();
                
                UniverseHealthSys.addCoach(id, nameSurname, password, empType, charity, workDays, insuranceR, extraDaysR);
                
            }
            
            
        }
        sc.close();
    }
    
    public static void writeToFile() throws IOException, NullPointerException{
        File file = new File("universeHealth.txt");
        FileWriter writer = new FileWriter(file);
        PrintWriter prt = new PrintWriter(writer);
        
        String writeString = "";
        
        for(int i = 0; i<records.size();i++){
            if(i!=0)
            writeString += "\n";
            if(records.get(i) instanceof Client){
                writeString += "1 ";
                writeString += records.get(i).id+" ";
                writeString += ((Client) records.get(i)).nameSurname+" ";
                writeString += ((Client) records.get(i)).passwordx+" ";
                writeString += ((Client) records.get(i)).getbDay()+" ";
                writeString += ((Client) records.get(i)).getCouponCode()+" ";
                writeString += ((Client) records.get(i)).getCompanyName()+" ";
                writeString += ((Client) records.get(i)).getCharity()+" ";
                writeString += ((Client) records.get(i)).getEnrollmentSize();
                //for(int j = 0; j<(((Client) records.get(i)).getEnrollmentSize());
                writeString += ((Client) records.get(i)).getEnrollment()+"\n";
                writeString += ((Client) records.get(i)).approvalObj.getApprovedDoctor()+" ";
                writeString += ((Client) records.get(i)).approvalObj.getHealthCondition()+" ";
                writeString += ((Client) records.get(i)).totalp;
                
            }
            else if(records.get(i) instanceof Coach){
                writeString += "2 ";
                writeString += ((Coach) records.get(i)).id+" ";
                writeString += ((Coach) records.get(i)).nameSurname+" ";
                writeString += ((Coach) records.get(i)).passwordx+" ";
                writeString += ((Coach) records.get(i)).getEmploymentType()+" ";
                writeString += ((Coach) records.get(i)).getCharity()+" ";
                writeString += ((Coach) records.get(i)).getWorkDays()+" ";
                writeString += ((Coach) records.get(i)).bonus.insurance+" ";
                writeString += ((Coach) records.get(i)).bonus.extraShiftBonuses;
            }
        }
        
        prt.print(writeString);
        writer.close();
        prt.close();
        
    }
}
