package com.campusdual.classroom;

public class TVRemote {
    int channel;
    int volume;
    boolean on = false;
    String color;

    // constructor -> alt + insert -> default -> on queda por defecto en false
    public TVRemote(String color) {
        this.channel = 0;
        this.volume = 20;
        this.color = color;
    }

    // métodos: public + tipo de dato + nombre
    public boolean turnOn() {
        this.on = true;
        System.out.println("Welcome!");
        return this.on;
    }


    public boolean turnOff() {
        this.on = false;
        System.out.println("Bye bye!");
        return this.on;
    }

    public void channelUp() {
        this.channel++;
        System.out.println("Channel: " + this.channel);
    }

    public void channelDown() {
        if (!checkMinValue(this.channel)){
            System.out.println("You're already in channel 0");
        }else {
            this.channel--;
            System.out.println("Channel: " + this.channel);
        }
        }

    public void volumeUp() {
        this.volume++;
        System.out.println("Volume: " + this.volume);
    }

    public void volumeDown() {
        if (!checkMinValue(this.volume)){
            System.out.println("You're on mute");
        }else {
            this.volume--;
            System.out.println("Volume: " + this.volume);
        }
    }

    public String getColor() {
        return this.color;
    }

    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;
        }
    }

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
