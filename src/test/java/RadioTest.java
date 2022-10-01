import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void NextStationIncreaseByOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);


        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationNegativeValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);


        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void NextStationReduceByOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void MaxStationBoundaryConditions() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationBoundaryConditions() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);


        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void volumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);


        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void volumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }






    @Test
    public void volumeAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeReduceMinus1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void volumeReduce() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void volumeReduceForOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

}