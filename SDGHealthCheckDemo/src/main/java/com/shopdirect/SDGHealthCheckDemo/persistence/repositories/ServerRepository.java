package com.shopdirect.SDGHealthCheckDemo.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shopdirect.SDGHealthCheckDemo.persistence.models.Server;

public abstract interface ServerRepository extends JpaRepository<Server, Long> {

}
