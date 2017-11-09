package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joker
{
  List<String> jokes = new ArrayList<String>()
  {{
    add("Why do programmers always mix up Halloween and Christmas?\n" +
      "Because Oct 31 equals Dec 25.");
    add("There are only 10 kinds of people in this world: those who know binary and those who don’t.");
    add("How many programmers does it take to change a light bulb?\n" +
      "None – It’s a hardware problem");
    add("A programmer walks to the butcher shop and buys a kilo of meat.  An hour later he comes back upset that the butcher shortchanged him by 24 grams.");
    add("Programming is 10% science, 20% ingenuity, and 70% getting the ingenuity to work with the science.");
    add("Have you heard about the new Cray super computer?  It’s so fast, it executes an infinite loop in 6 seconds.");
  }};

  public String getJoke()
  {
    int randomInt = new Random().nextInt(5);
    return jokes.get(randomInt);
  }
}
