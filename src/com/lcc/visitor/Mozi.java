package com.lcc.visitor;

public class Mozi {

    public void ride(Horse horse){
        System.out.print("骑马");
    }

    public void ride(BlackHorse blackHorse){
        System.out.print("骑 黑色 马");
    }

    public void ride(RedHorse redHorse){
        System.out.print("骑 红色 马");
    }


    public static void main(String[] args){
        Horse horse = new BlackHorse();
        Horse horse1 = new RedHorse();
        Mozi mozi = new Mozi();
        mozi.ride(horse);
        mozi.ride(horse1);
    }
}
