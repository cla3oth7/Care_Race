//package com.codecool.car_race;
//
//import java.util.*;
//
//import com.codecool.car_race.vehicles.Vehicle;
//import com.codecool.car_race.vehicles.Truck;
//
//public class Race {
//    private final List<Vehicle> vehicles = new LinkedList<>();
//
//    public Race () { createVehicles(); }
//
//
//    private void createVehicles() {
//        for (int i = 0; i < 10; i++) {
//            vehicles.add(new Truck());
//        }
//    }
//
//    private void printResults() {
////        vehicles.forEach(System.out::println);
//        for (Vehicle vehicle : vehicles) {
//            System.out.println(vehicle.getClass().getSimpleName());
//
//        }
//    }
//
//    public static void main(String[] args) {
//        Race race = new Race();
//
//        race.createVehicles();
//        race.printResults();
//
//    }
//}

package com.codecool.car_race;

import java.util.List;
import java.util.LinkedList;


import com.codecool.car_race.vehicles.Vehicle;

import com.codecool.car_race.vehicles.Truck;

public class Race {

  private final List<Vehicle> vehicles = new LinkedList<>();

  public Race () { }

  public static void main(String[] args) {
    Race race = new Race();

    race.createVehicles();
    race.printRaceResults();
  }

  private void createVehicles() {
    for (int i = 0; i < 10; i++) { ;
      vehicles.add(new Truck());
    }
  }

  private void printRaceResults() {
    for (Vehicle vehicle : vehicles) {
      System.out.println(vehicle);
    }
  }
}