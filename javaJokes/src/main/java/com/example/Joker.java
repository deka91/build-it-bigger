package com.example;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Joker
{
  List<String> alltheJokes = asList("joke1", "joke2", "joke3", "joke4", "joke5");

  public String getJoke()
  {
    int randomInt = new Random().nextInt(4);
    return alltheJokes.get(randomInt);
  }
}
