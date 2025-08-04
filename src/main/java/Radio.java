public class Radio {
    private int currentRadioStationNumber;   // от 0 до 9
    private int currentVolume;  //от 0 до 100
    private int stationCount;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.stationCount = 10;
    }

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }


    //сетеры и гетеры для станции
    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }
    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber >= 0 && newCurrentRadioStationNumber < stationCount) {
            currentRadioStationNumber = newCurrentRadioStationNumber;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void next() {
        if (currentRadioStationNumber >= 0 && currentRadioStationNumber < stationCount - 1) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = stationCount - 1;
        }
    }

    public void setRadioStationNumber(int station) {
        if (station >= 0 && station < stationCount) {
            currentRadioStationNumber = station;
        } else {
            currentRadioStationNumber = 0; // сброс на 0
        }
    }


    // сетеры и гетеры для звука
    public  int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= minVolume && newCurrentVolume <= maxVolume) {
            currentVolume = newCurrentVolume;
        } else {
            currentVolume = 0;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}