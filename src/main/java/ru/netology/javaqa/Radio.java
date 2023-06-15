package ru.netology.javaqa;

public class Radio {
    private int stationRadio;
    private int volumeRadio;
    private int stationMax = 9;

    public Radio(int stationCount) {
        this.stationMax = stationCount - 1;
    }

    public Radio() {
        ;
    }

    public int getStationCount() {
        return stationMax + 1;
    }

    public void nextStations() {
        if (stationRadio < stationMax) {
            stationRadio++;
            return;
        }
        stationRadio = 0;
    }

    public void prevStations() {
        if (stationRadio != 0) {
            stationRadio--;
        } else stationRadio = stationMax;
    }

    public void nextVolume() {
        if (volumeRadio != 100) {
            volumeRadio++;
            return;
        }
        volumeRadio = 100;
    }

    public void prevVolume() {
        if (volumeRadio != 0) {
            volumeRadio--;
        } else volumeRadio = 0;
    }

    public int getStationRadio() {
        return stationRadio;
    }

    public void setVolumeRadio(int volumeRadio) {
        if (volumeRadio < 0) {
            return;
        }
        if (volumeRadio > 100) {
            return;
        }
        this.volumeRadio = volumeRadio;
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setStationRadio(int stationRadio) {
        if (stationRadio < 0) {
            return;
        }
        if (stationRadio > stationMax) {
            return;
        }
        this.stationRadio = stationRadio;
    }
}
