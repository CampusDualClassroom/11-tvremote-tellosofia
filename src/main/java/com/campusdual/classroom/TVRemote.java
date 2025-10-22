package com.campusdual.classroom;

public class TVRemote {

    int channel;
    int volume;
    boolean on;
    String color;

    public TVRemote(String color) {
        this.channel = 0;
        this.volume = 20;
        this.color = color;
    }

    public boolean turnOn() {

    }

    public boolean turnOff() {

    }

    public void channelUp() {

    }

    public void channelDown() {

    }

    public void volumeUp() {
      
    }

    public void volumeDown() {

    }

    public String getColor() {

    }

    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;
        }
    }

}
