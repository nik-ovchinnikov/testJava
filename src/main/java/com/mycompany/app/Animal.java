package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collection;

public class Animal implements Comparable {
    String breed;
    int price;
    int weight;
    int speed;

    Animal(String breed, int price, int weight, int speed) {
        this.breed = breed;
        this.price = price;
        this.weight = weight;
        this.speed = speed;
    }

    public String toString() {
        return this.breed + " " + this.price + " " + this.speed + " " + this.weight;
    }

    @Override
    public int compareTo(Object o) {
        /*int tmp = this.speed - ((Animal)o).speed;

        if (tmp == 0) {
            return  -(this.price - ((Animal)o).price);
        } else {
            return tmp;
        }*/
        return -(this.breed.compareTo(((Animal)o).breed));
    }


}
