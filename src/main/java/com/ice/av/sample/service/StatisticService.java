package com.ice.av.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ice.av.sample.entity.Info;


/**
 * Created by RooGoo on 30/04/2017.
 */
@RestController
public class StatisticService {

    @SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(StatisticService.class);
    

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Info getInfo(){
        return new Info();
    }
}
