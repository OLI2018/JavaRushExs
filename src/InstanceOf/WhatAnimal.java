package InstanceOf;

public class WhatAnimal {

  public static void main(String[] args) {

    Object object = new Tiger000();

    boolean isCat =  object instanceof Cat000;
    boolean isTiger  = object instanceof Tiger000;
    boolean isAnimal  = object instanceof Animal000;

    System.out.println(isCat);
    System.out.println(isTiger);
    System.out.println(isAnimal);

    Object o = new Animal000();
    boolean Cat = o instanceof Cat000;
    boolean Tiger = o instanceof Tiger000;
    boolean Animal = o instanceof Animal000;

    System.out.println(Cat);
    System.out.println(Tiger);
    System.out.println(Animal);
  }
}
