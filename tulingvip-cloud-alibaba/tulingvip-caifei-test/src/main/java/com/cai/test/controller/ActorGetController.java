package com.cai.test.controller;

import com.cai.test.dao.Actor;
import com.cai.test.service.impl.ActorServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/actor")
public class ActorGetController {
    @Autowired
    private ActorServiceImpl actorService;

    @RequestMapping("/data")
    @ResponseBody
    public Actor actorData(@RequestParam Integer id){
        return actorService.ActorInfoGet(id);
    }
}
