package com.shopdirect.SDGHealthCheckDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopdirect.SDGHealthCheckDemo.persistence.models.Server;
import com.shopdirect.SDGHealthCheckDemo.persistence.repositories.ServerRepository;
import com.shopdirect.SDGHealthCheckDemo.service.ServerService;

@Service
@Transactional
public class ServerServiceImpl implements ServerService {
	
  @Autowired
  private ServerRepository serverRepository;
  
  public boolean saveUser(Server server) {
    Server savedUser = (Server)serverRepository.save(server);
    if (savedUser != null) {
      return true;
    }    
    return false;
  }  

  public List<Server> getAllServerDetails() {
    return serverRepository.findAll();
  }
}
