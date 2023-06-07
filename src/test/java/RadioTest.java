import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {

    @Test
    public void numberStationRadio () {
        Radio radio = new Radio();
        radio.setStationRadio(1);

         int expected = 1;
         int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberNegativeRadio () {
        Radio radio = new Radio();
        radio.setStationRadio(-1);

        int expected = 0;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberZeroRadio () {
        Radio radio = new Radio();
        radio.setStationRadio(5);
        radio.setStationRadio(0);

        int expected = 0;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberEightRadio () {
        Radio radio = new Radio();
        radio.setStationRadio(8);

        int expected = 8;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberNineRadio () {
        Radio radio = new Radio();

        radio.setStationRadio(9);

        int expected = 9;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberMoreMaxRadio () {
        Radio radio = new Radio();

        radio.setStationRadio(10);

        int expected = 0;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberStationRadio () {
        Radio radio = new Radio();

        radio.setStationRadio(1);
        radio.nextStations();

        int expected = 2;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextZeroStationRadio () {
        Radio radio = new Radio();

        radio.setStationRadio(0);
        radio.nextStations();

        int expected = 1;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextEightStationRadio () {
        Radio radio = new Radio();

        radio.setStationRadio(8);
        radio.nextStations();

        int expected = 9;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextMoreNineStationRadio () {
        Radio radio = new Radio();

        radio.setStationRadio(9);
        radio.nextStations();

        int expected = 0;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationRadio () {
        Radio radio = new Radio();

        radio.setStationRadio(9);
        radio.prevStations();

        int expected = 8;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevZeroStationRadio () {
        Radio radio = new Radio();

        radio.setStationRadio(0);
        radio.prevStations();

        int expected = 9;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevOneStationRadio () {
        Radio radio = new Radio();

        radio.setStationRadio(1);
        radio.prevStations();

        int expected = 0;
        int actual = radio.getStationRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeRadio () {
        Radio radio = new Radio();

        radio.setVolumeRadio(1);
        radio.nextVolume();

        int expected = 2;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextZeroVolumeRadio () {
        Radio radio = new Radio();

        radio.setVolumeRadio(0);
        radio.nextVolume();

        int expected = 1;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextNinetyNineVolumeRadio () {
        Radio radio = new Radio();

        radio.setVolumeRadio(99);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextOneHundredVolumeRadio () {
        Radio radio = new Radio();

        radio.setVolumeRadio(100);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void prevVolumeRadio () {
        Radio radio = new Radio();

        radio.setVolumeRadio(1);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevZeroVolumeRadio () {
        Radio radio = new Radio();

        radio.setVolumeRadio(0);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }
        @Test
    public void prevOneHundredVolumeRadio () {
        Radio radio = new Radio();

        radio.setVolumeRadio(100);
        radio.prevVolume();

        int expected = 99;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

}
