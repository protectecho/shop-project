package com.cai.test.service.impl;

import com.cai.test.dao.Actor;
import com.cai.test.mapper.ActorMapper;
import com.cai.test.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorMapper actorMapper;

    @Override
    public Actor ActorInfoGet(Integer id){
        return actorMapper.selectActorById(id);
    }

}
