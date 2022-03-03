package com.springboot.demo.game.enterprice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private  BusinessService businessService;

    @GetMapping("/sum")
    public long displaySum(){
        return 100;
    }
}
//business logic
@Component
class  BusinessService{
    @Autowired
    private DataService dataService;

    public long calculateSum(){
        List<Integer>  data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}

//data logic
@Component
    class  DataService{
        public List<Integer> retrieveData(){
            return Arrays.asList(12,456,78,90);
        }
        }
