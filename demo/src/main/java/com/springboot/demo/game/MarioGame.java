package com.springboot.demo.game;


import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
//    private  MarioGame game;

    @Override
    public  void up(){
        System.out.println("uP");
    }

    @Override
    public  void down(){
        System.out.println("Down");

    }

    @Override
    public  void right(){
        System.out.println("Right");

    }

    @Override
    public  void left(){
        System.out.println("Left");

    }

}
