package com.jethwani.adminservice.service;

import com.jethwani.adminservice.model.UserMetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    public UserMetaData getUsers(){
        UserMetaData userMetaData=restTemplate.getForEntity("http://user-service/users",UserMetaData.class).getBody();
        return userMetaData;
    }
}
