package com.codecool.car_race.utils;

import java.util.Random;

public class RandomUtils {

  private static final Random random = new Random();

  public static int randomIntFromRange(int upper) {
    return random.nextInt(upper);
  }


}
