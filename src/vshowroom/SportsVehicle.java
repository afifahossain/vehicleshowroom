/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vshowroom;

public class SportsVehicle extends Vehicle {
    String turbo;

    SportsVehicle(int tmodelno, int tengpow, int ttsize, String tturbo) {
        super(tmodelno,"SportsVehicle", "Oil", tengpow, ttsize);
        turbo = tturbo;
        AddVehicle(this);
    }
     @Override 
    void AddVehicle(Vehicle newVehicle) {
        Vehicle.Vlist.add(newVehicle);
    }


    
}


    

