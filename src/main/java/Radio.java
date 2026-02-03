public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsCount;

    public Radio() {
        this(10);
    }

    public Radio(int stationsCount) {
        if (stationsCount < 1) {
            stationsCount = 1;
        }
        this.stationsCount = stationsCount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getStationsCount() {
            return stationsCount;
        }

    public int getCurrentVolume() {
            return currentVolume;
        }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation >= stationsCount) {
            return;
        }
        this.currentStation = newStation;
    }

    public void next() {
        if (currentStation == stationsCount - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationsCount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }



    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
