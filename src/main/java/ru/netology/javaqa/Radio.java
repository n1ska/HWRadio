package ru.netology.javaqa;

public class Radio {
    private int stationRadio;
    private int volumeRadio;

    public Radio(int station)
    {
        stationRadio = station;
    }

    public Radio()
    {
        stationRadio = 0;
    }
    public void nextStations () {
        if (stationRadio != 9) {
            stationRadio++;
            return;
            }
        stationRadio = 0;
    }
    public void prevStations() {
        if (stationRadio != 0) {
            stationRadio--;
            }
        else stationRadio = 9;
    }

    public void nextVolume () {
        if (volumeRadio != 100) {
            volumeRadio++;
            return;
        }
        volumeRadio = 100;
    }
    public void prevVolume() {
        if (volumeRadio != 0) {
            volumeRadio--;
        }
        else volumeRadio = 0;
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
        if (stationRadio > 9) {
            return;
        }
        this.stationRadio = stationRadio;
    }
}
