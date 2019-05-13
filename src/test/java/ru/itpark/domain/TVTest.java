package ru.itpark.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {
    @Test
    // Positive testing - если пользователь делает всё правильно, то всё должно работать
    public void testSetValidChannel() {
        TV tv = new TV();
        int channel = 50;
        tv.setChannel(channel); // Ctrl + Alt + V

        int actual = tv.getChannel();
        assertEquals(channel, actual);
    }

    @Test
    public void testSetChannelOverMax() {
        TV tv = new TV();
        int before = tv.getChannel(); // значение до попытки изменения
        int channel = 101;

        tv.setChannel(channel);

        int actual = tv.getChannel();
        assertEquals(before, actual);
    }

    @Test
    public void testSetChannelOverMin() {
        TV tv = new TV();
        int before = tv.getChannel(); // значение до попытки изменения
        int channel = -1;

        tv.setChannel(channel);

        int actual = tv.getChannel();
        assertEquals(before, actual);
    }

    @Test
    public void testIncChannelBetweenBounds() {
        TV tv = new TV();
        int before = tv.getChannel();

        tv.incChannel();

        int actual = tv.getChannel();
        assertEquals(before + 1, actual);
    }

    @Test
    public void testIncChannelOverMax() {
        TV tv = new TV();
        // установка нужного состояния
        int maxChannel = 100;
        int minChannel = 0;
        tv.setChannel(maxChannel);

        tv.incChannel();

        int actual = tv.getChannel();
        assertEquals(minChannel, actual);
    }

    @Test
    public void testDecChannelBetweenBounds() {
        TV tv = new TV();
        tv.setChannel(50); // установка начального состояния
        int before = tv.getChannel();

        tv.decChannel();

        int actual = tv.getChannel();
        assertEquals(before - 1, actual);
    }

    @Test
    public void testDecChannelOverMin() {
        TV tv = new TV();
        // установка нужного состояния
        int maxChannel = 100;
        int minChannel = 0;
        tv.setChannel(minChannel);

        tv.decChannel();

        int actual = tv.getChannel();
        assertEquals(maxChannel, actual);
    }
}