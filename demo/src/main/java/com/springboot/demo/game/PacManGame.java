package com.springboot.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole {
//    private  MarioGame game;

    public  void up(){
        System.out.println("PacMan up stop");
    }

    public  void down(){
        System.out.println("Down down");

    }

    public  void right(){
        System.out.println("Right fast");

    }

    public  void left(){
        System.out.println("Left slow");

    }

}
