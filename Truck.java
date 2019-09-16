//package com.codecool.car_race.vehicles;
//
////import java.util.Random;
//import com.codecool.car_race.Race;
//import com.codecool.car_race.utils.RandomUtils;
//
//public class Truck extends Vehicle {
//
//  private int normalSpeed = 100;
//  private int lap = 0;
//  private int probability = 5;
//
//  public Truck() { super(Integer.toString(RandomUtils.randomIntFromRange(1000)), normalSpeed); }
//
//
//
//}

package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

import com.codecool.car_race.utils.RandomUtils;

public class Truck extends Vehicle {

  public static int normalSpeed = 100;
  public int lap = 0;

  //TODO  above field must be static ELSE it trows the error -->
        //Error:(32, 82) java: cannot reference normalSpeed before supertype constructor has been called
        // WTF ???

  public Truck() { super(Integer.toString(RandomUtils.randomIntFromRange(1000)), normalSpeed); }



}