package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        redRemote.turnOn();
        redRemote.channelUp();
        redRemote.channelDown();
        redRemote.channelDown();
        redRemote.volumeUp();
        redRemote.volumeDown();

        for (int i = 0; i < 25; i++) {
            redRemote.volumeDown();
        }

        System.out.println(redRemote.getColor());
        redRemote.turnOff();
    }
}