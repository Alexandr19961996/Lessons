package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    // Эти 2 поля необходимы для демонстрации внедрения простых значений в bean в AC.
    private Music music;
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    // Пустой конструктор необходим, если происходит Dependency Injection через setter.
    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    // Реализация задания: создание списка музыкальных песен разных жанров, внедрение зависимостей через
    // AC, запуск их в музыкальном плеере
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        // Вывод одиночной песни.
        System.out.println("Playing: " + music.getSong());

//        // Вывод списка песен.
//        for (int i = 0; i < musicList.size(); i++) {
//            System.out.println(musicList.get(i).getSong());
//        }
    }
}