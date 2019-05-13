package ru.itpark.domain;

public class TV {
    private int channel; // доступно только внутри {}
    private int volume;

    // get/set -> методы
    // Alt + Insert
    public int getChannel() { // public - доступен всем
        return channel;
    }

//    public void setChannel(int newChannel) {
//        channel = newChannel;
//    }
    public void setChannel(int channel) {
        // channel - всегда будет параметр
        // this.channel - поле в моём объекте
        int maxChannel = 100;
        if (channel > maxChannel) {
            // early exit
            return; // просто return, потому что void
        }

        int minChannel = 0;
        if (channel < minChannel) {
            return;
        }

        this.channel = channel;
    }

    public void incChannel() { // inc -> increase
        // this.channel++; но this. в данном случае избыточен
        int maxChannel = 100;
        int minChannel = 0;

        if (channel == maxChannel) {
            channel = minChannel; // сбрасываем на "первый"
            return;
        }

        channel++;
    }

    // TODO: decChannel
    public void decChannel() {
        int maxChannel = 100;
        int minChannel = 0;

        if (channel == minChannel) {
            channel = maxChannel; // сбрасываем на "максимальный"
            return;
        }

        channel--;
    }

    public int getVolume() {
        return volume;
    }

    // в реальной жизни нет
    // она мне нужна, чтобы удобно "тестировать"
    public void setVolume(int volume) {
        // TODO: check bounds (проверка границ)
        this.volume = volume;
    }

    public void incVolume() {
        int maxVolume = 100;

        if (volume == maxVolume) {
            return;
        }

        volume++;
    }

    public void decVolume() {
        int minVolume = 0;

        if (volume == minVolume) {
            return;
        }

        volume--;
    }
}

// 1. Определять какие сущности есть в нашей программе
// 2. Определять свойства и методы сущностей
// 3. Взаимодействие между сущностями
