package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Тест и проверка работоспособности beans в Application Context.
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());

        // Программирование на уровне интерфейсов. Вызов bean, который в реальном коде
        // implements интерфейс. Можно путем изменения в AC классов, которые implements данный интерфейс,
        // добиться изменения работы логики программы.
//        Music music = context.getBean("musicBean", Music.class);
//        System.out.println(music.getSong());

        //IoC.
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();

//        // Dependency Injection.
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        // Вывод простых значений.
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        // Реализация задания со списком.
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        // Демонстрация работы scope (Singleton и Prototype).
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        // Сравнение двух Beans по указателю (на один ли участок памяти они указывают).
//        System.out.println(firstMusicPlayer == secondMusicPlayer);
//        // Вывод хэш-значений (поскольку в классе MusicPlayer не переопределен метод toString) Bean "firstMusicPlayer".
//        System.out.println(firstMusicPlayer);
//        // Вывод хэш-значений (поскольку в классе MusicPlayer не переопределен метод toString) Bean "secondMusicPlayer".
//        System.out.println(secondMusicPlayer);
//
//        // Изменение значений громкости у первого Bean и проверка прохода этого изменения у второго Bean
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println("firstMusicPlayer: " + firstMusicPlayer.getVolume());
//        System.out.println("secondMusicPlayer: " + secondMusicPlayer.getVolume());

        // Демонстрация вызова init и destroy methods. Для beans со scope = prototype не вызывается init-method.
        // При наличии factory-method и scope = singleton создание объекта будет произведено один раз.
        ClassicalMusic classicalMusicOne = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusicTwo = context.getBean("musicBean", ClassicalMusic.class);


        System.out.println(classicalMusicOne.getSong());
        System.out.println(classicalMusicTwo.getSong());

        context.close();
    }
}
