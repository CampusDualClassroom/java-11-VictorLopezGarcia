package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        System.out.println(redRemote.turnOn());
        System.out.println(blackRemote.turnOn());
        redRemote.channelUp();
        blackRemote.channelUp();
        redRemote.channel = 0;
        redRemote.channelDown();
        blackRemote.channel = 0;
        blackRemote.channelDown();
        System.out.println(redRemote.channel);
        System.out.println(blackRemote.channel);
        redRemote.volumeUp();
        blackRemote.volumeUp();
        redRemote.volumeDown();
        blackRemote.volumeDown();
        redRemote.volume = 0;
        redRemote.volumeDown();
        blackRemote.volume = 0;
        blackRemote.volumeDown();
        System.out.println(redRemote.volume);
        System.out.println(blackRemote.volume);
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        redRemote.turnOff();
        blackRemote.turnOff();
    }

}