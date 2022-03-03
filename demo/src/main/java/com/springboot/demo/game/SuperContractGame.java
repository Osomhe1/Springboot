package com.springboot.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class SuperContractGame implements GamingConsole {
//    private  MarioGame game;

    public  void up(){
        System.out.println("up stop");
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
