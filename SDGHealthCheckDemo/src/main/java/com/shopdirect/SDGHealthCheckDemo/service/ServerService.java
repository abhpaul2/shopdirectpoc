package com.shopdirect.SDGHealthCheckDemo.service;

import java.util.List;
import com.shopdirect.SDGHealthCheckDemo.persistence.models.Server;

public abstract interface ServerService {
	
  public abstract boolean saveUser(Server paramServer);  
  public abstract List<Server> getAllServerDetails();
}
