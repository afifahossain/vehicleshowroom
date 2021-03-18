/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vshowroom;

public class HeavyVehicle extends Vehicle {
    int weight;
    HeavyVehicle(int tmodelno, int tengpow, int ttsize, int tweight) {
        super(tmodelno, "HeavyVehicle", "Diesel", tengpow, ttsize);
        weight = tweight;
        AddVehicle(this);
    }
  @Override  
    void AddVehicle(Vehicle newVehicle) {
        Vehicle.Vlist.add(newVehicle);
    } 
}
    

