package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {

  private String name;
  private int normalSpeed;
  private int trueSpeed;
 //TODO add fields

  protected Vehicle(String name, int normalSpeed) {
    this.name = name;
    this.normalSpeed = normalSpeed;
  }


  @Override
  public String toString () {
    //String stringToPrint = new String();
    return "Type: " + getClass().getSimpleName() + " | name: " +  name;
  }

}
