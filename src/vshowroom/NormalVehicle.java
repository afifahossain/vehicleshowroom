/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vshowroom;

/**
 *
 * @author Hp
 */
public class NormalVehicle extends Vehicle {
     NormalVehicle(int tmodelno, String tengtype, int tengpow, int ttsize) {
        super(tmodelno, "Normal",  tengtype, tengpow, ttsize);
        AddVehicle(this);
    }
     @Override 
    void AddVehicle(Vehicle newVehicle) {
        Vehicle.Vlist.add(newVehicle);
    
}
}
