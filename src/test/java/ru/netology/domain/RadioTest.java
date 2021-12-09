package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.security.Provider;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldEmptyConstructor() {
        Radio radio = new Radio();
        assertEquals(10, radio.getCountStation());
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio(9, 50, 11, 10);
        radio.nextStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio(10, 50, 11, 10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio(1, 50, 11, 10);
        radio.previousStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio(0, 50, 11, 10);
        radio.previousStation();
        assertEquals(10, radio.getCurrentStation());
    }


    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio(5, 99, 10, 12);
        radio.nextVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextVolumeInLimit() {
        Radio radio = new Radio(5, 100, 10, 12);
        radio.nextVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevVolume() {
        Radio radio = new Radio(1, 1, 20, 25);
        radio.previousVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevVolumeInLimit() {
        Radio radio = new Radio(1, 0, 20, 25);
        radio.previousVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldConstructor() {
        Radio radio = new Radio(30, 0, 20, 25);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldConstructorMin() {
        Radio radio = new Radio(-1, 0, 20, 25);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldVolume() {
        Radio radio = new Radio(1, 101, 20, 25);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldMin() {
        Radio radio = new Radio(1, -1, 20, 25);
        assertEquals(0, radio.getCurrentVolume());
    }
}
