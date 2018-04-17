package com.shopdirect.SDGHealthCheckDemo.persistence.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public  class Server {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	@NotBlank
	@Size(min = 1, max = 10)
    private String name;
    private int totalSpace;
    private int usedSpace;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalSpace() {
		return totalSpace;
	}
	public void setTotalSpace(int totalSpace) {
		this.totalSpace = totalSpace;
	}
	public int getUsedSpace() {
		return usedSpace;
	}
	public void setUsedSpace(int usedSpace) {
		this.usedSpace = usedSpace;
	}

    

}
