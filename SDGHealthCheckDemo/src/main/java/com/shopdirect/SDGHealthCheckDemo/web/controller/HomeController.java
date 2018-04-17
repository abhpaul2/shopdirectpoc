package com.shopdirect.SDGHealthCheckDemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopdirect.SDGHealthCheckDemo.service.ServerService;

@Controller
public class HomeController
{
  @org.springframework.beans.factory.annotation.Autowired
  private ServerService serverService;
  
  public HomeController() {}
  
  @RequestMapping(value={"/"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public String home(Model model)
  {
    model.addAttribute("servers", serverService.getAllServerDetails());
    System.out.println("LIST SIZE:" + serverService.getAllServerDetails().size());
    return "home";
  }
  
  @RequestMapping(value={"/freespace"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public String freespace() {
    return "home";
  }
  @RequestMapping({"/about"})
  public String about(Model model)
  {
    model.addAttribute("servers", serverService.getAllServerDetails());
    return "about";
  }
}
