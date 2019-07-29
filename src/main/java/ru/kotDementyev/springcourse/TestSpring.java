package ru.kotDementyev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusicBean1", ClassicalMusic.class);
        System.out.println(classicalMusic1.getSong());

        ClassicalMusic classicalMusic2 = context.getBean("classicalMusicBean1", ClassicalMusic.class);
        System.out.println(classicalMusic2.getSong());

        ClassicalMusic classicalMusic3 = context.getBean("classicalMusicBean1", ClassicalMusic.class);
        System.out.println(classicalMusic3.getSong());



        //Music musicObj = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(musicObj);

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//       boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

//        System.out.println("Name: " + musicPlayer.getName());
//        System.out.println("Volume: " + musicPlayer.getVolume());

        context.close();
    }
}
