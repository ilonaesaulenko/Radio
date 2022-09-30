import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void NextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStationBoundaryConditions() {
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
}