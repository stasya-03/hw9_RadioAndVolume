public class Radio {
    private int currentRadioStationNumber;   // от 0 до 9
    private int currentVolume;  //от 0 до 100

    //сетеры и гетеры для станции
    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }
    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber >=0 && newCurrentRadioStationNumber <= 9) {
            currentRadioStationNumber = newCurrentRadioStationNumber;
        }
    }

    public void next() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prev() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public void setRadioStationNumber(int station) {
        if (station >= 0 && station<= 9) {
            currentRadioStationNumber = station;
        }
    }


    // сетеры и гетеры для звука
    public  int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0 && newCurrentVolume <= 100) {
            currentVolume = newCurrentVolume;
        }
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