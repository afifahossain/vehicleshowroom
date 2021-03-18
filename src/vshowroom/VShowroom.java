
package vshowroom;


public class VShowroom {

   
    public static void main(String[] args) {
        
     NormalVehicle nv = new NormalVehicle (100,"Gas", 3,10);
     nv = new NormalVehicle(200,"Oil", 4,8);
     nv = new NormalVehicle(200,"Diesel", 6,9);

      
     
       

       
        SportsVehicle sv = new SportsVehicle(200, 2, 4, "Turbo");
        sv = new SportsVehicle(201, 3, 6, "Turbo");
       
        
        
        HeavyVehicle hv = new HeavyVehicle(300, 2, 5, 1000);
        hv = new HeavyVehicle(301, 2, 5, 1000);
     
        
        
        Vehicle.ShowVehicle();
        
        Vehicle.ShowVisitorCount();
        
        Vehicle.RemoveVehicle(10);
        
        Vehicle.ShowVisitorCount();
}
}
