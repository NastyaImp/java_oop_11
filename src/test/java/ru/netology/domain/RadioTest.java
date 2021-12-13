package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.security.Provider;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldEmptyConstructor() {
        Radio radio = new Radio();
        assertEquals(10, radio.getCountStation());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio(12);
        radio.setCurrentStation(11);
        radio.nextStation();
        assertEquals(12, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio(12);
        radio.setCurrentStation(12);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationNotLimitMax() {
        Radio radio = new Radio(12);
        radio.setCurrentStation(13);
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio(12);
        radio.setCurrentStation(1);
        radio.previousStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio(12);
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(11, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationNotLimitMin() {
        Radio radio = new Radio(12);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.nextVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextVolumeInLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.previousVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevVolumeInLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.previousVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextVolumeNotLimitMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextVolumeNotLimitMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

}
