package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    // Демонстрация "уточнения" зависимости через аннотацию @Qualifier. Вариант реализации через поле.
    @Autowired
    @Qualifier("classicalMusicBean")
    private Music music;

    // Здесь производится тестирование работы аннотации @Autowiring (для этого создаем дополнительное поле, чтобы
    // исключить ситуации, когда под внедрение попадают сразу несколько Beans) Два поля используются, если происходит
    // внедрение зависимостей сразу у двух Beans, имплементирующих интерфейс.

//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;

    // Эти 2 поля необходимы для демонстрации внедрения простых значений в Bean в AC.
    private String name;
    private int volume;

    private List<Music> musicList = new ArrayList<>();

    // Пустой конструктор необходим, если происходит Dependency Injection через setter.
//    public MusicPlayer() {
//    }

    // Демонстрация "уточнения" зависимости через аннотацию @Qualifier. Вариант реализации через конструктор.
//    @Autowired
//    public MusicPlayer(@Qualifier("classicalMusicBean") Music music) {
//        this.music = music;
//    }

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

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
    // AC, запуск их в музыкальном плеере.
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
//        // Вывод одиночной песни.
        System.out.println("Playing: " + music.getSong());
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + classicalMusic.getSong() + " + " + rockMusic.getSong());

//        // Вывод списка песен.
//        for (int i = 0; i < musicList.size(); i++) {
//            System.out.println(musicList.get(i).getSong());
//        }
    }
}