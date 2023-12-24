package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic firstclassicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic secondclassicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(firstclassicalMusic);
        System.out.println(secondclassicalMusic);

//        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        //сравнение двух бинов по указателю
//        System.out.println(firstmusicPlayer == secondmusicPlayer);
//        //вывод хэш-значений бина "firstmusicPlayer"
//        System.out.println(firstmusicPlayer);
//        //вывод хэш-значений бина "secondmusicPlayer"
//        System.out.println(secondmusicPlayer);
//
//        //изменение значений громкости у первого бина и проверка прохода этого изменения и у второго бина
//        firstmusicPlayer.setVolume(10);
//
//        System.out.println("firstmusicPlayer: " + firstmusicPlayer.getVolume());
//        System.out.println("secondmusicPlayer: " + secondmusicPlayer.getVolume());

        context.close();
    }
}
