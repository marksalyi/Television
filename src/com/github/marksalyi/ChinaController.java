package com.github.marksalyi;

public class ChinaController implements Controller{
    public TV2 tv;

    public ChinaController(TV2 tv) {
        this.tv = tv;
    }
    @Override
    public int volumeUp() {
        int newVolume = this.tv.currentVolume + 2;
        this.tv.currentVolume = newVolume;
        System.out.println("China volume is: " + newVolume);
        return newVolume;
    }

    @Override
    public int volumeDown() {
        int newVolume = this.tv.currentVolume - 2;
        this.tv.currentVolume = newVolume;
        System.out.println("China volume is: " + newVolume);
        return newVolume;
    }

    @Override
    public int channelUp() {
        int newChannel = this.tv.currentChannel + 2;
        this.tv.currentChannel = newChannel;
        System.out.println("China channel is: " + newChannel);
        return newChannel;
    }

    @Override
    public int channelDown() {
        int newChannel = this.tv.currentChannel - 2;
        this.tv.currentChannel = newChannel;
        System.out.println("China channel is: " + newChannel);
        return newChannel;
    }
}
