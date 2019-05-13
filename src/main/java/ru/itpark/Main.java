package ru.itpark;


import ru.itpark.domain.TV;

public class Main {
    public static void main(String[] args) {
        TV kitchenTv = new TV(); // создание объекта new
        TV roomTv = new TV();
        TV roomTv1 = new TV();

        kitchenTv.setChannel(100);
        roomTv.setChannel(100);
        int channel = kitchenTv.getChannel();
        System.out.println(channel);

        System.out.println(roomTv.getChannel());
        System.out.println(roomTv1.getChannel());
    }
}
