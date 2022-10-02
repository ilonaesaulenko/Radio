public class Radio {


    protected int currentStation;
    protected int currentVolume;
    protected int stationMax;

    public Radio() {
        stationMax = 9;

    }

    public Radio(int numberStation) {
        stationMax = numberStation - 1;

    }



    public int getCurrentVolume() {

        return currentVolume;

    }
    public void  setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
            this.currentVolume = currentVolume;
}
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume +1;
        }
    }


    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume -1;

        }
    }




    public int getCurrentStation() {
        return currentStation;

    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation >  stationMax) {
            return;
        }
    this.currentStation = currentStation;

    }
    public void next() {
        if (currentStation < stationMax) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }
        public void prev() {
            if (currentStation > 0) {
                currentStation--;

            } else {
                currentStation= stationMax;
            }
        }

}
