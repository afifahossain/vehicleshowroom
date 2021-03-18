
package vshowroom;

import java.util.ArrayList;

/**
 *
 * @author Lami
 */
public abstract class Vehicle {
   protected int modelno;
   protected String vtype;
   protected String engtype;
   protected int engpow;
   protected int tsize;
   protected static  ArrayList<Vehicle> Vlist = new ArrayList<Vehicle>();
    

    Vehicle(int tmodelno,String tvtype,  String tengtype, int tengpow, int ttsize){
       
       modelno = tmodelno;
       vtype = tvtype;
       engtype = tengtype;
       engpow = tengpow;
       tsize = ttsize;
      
    }

    abstract void AddVehicle(Vehicle newVehicle);

    static void RemoveVehicle(int modelno) {
        for(int i=0; i<Vlist.size(); i++) {
            Vehicle v = Vlist.get(i);
            if(v.modelno == modelno) {
                Vlist.remove(i);
                break;
            }
        }
    }

    static void ShowVehicle() {
        
         for(int i=0; i<Vlist.size(); i++) {
            Vehicle v = Vlist.get(i);
           System.out.println("You are viewing Model Number: " + v.modelno + " \nVehicle Type: " + v.vtype + " \nEngine Type: " + v.engtype
                               + " \nEngine Power: " + v.engpow
                               );
           if(v.vtype.equals("SportsVehicle")) {
               SportsVehicle sv = (SportsVehicle) v ;
                System.out.println("Turbo: "+sv.turbo);
            }
            if(v.vtype.equals("HeavyVehicle")) {
                HeavyVehicle hv = (HeavyVehicle) v ;
                System.out.println("Weight: "+hv.weight);
            }
            
           
        }
    }

    static void ShowVisitorCount() {
        int e = 30;
         for(int i=0; i<Vlist.size(); i++) {
            Vehicle v = Vlist.get(i);
            if(v.vtype == "SportsVehicle") {
                e = e+20;
                
            }
            }
          System.out.println("Current Count of Expected Visitors: " + e);
}

    }
