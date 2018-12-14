package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;
    //@RequestMapping("/getAllPerson/{id}/{name}/{age}")
    //@ResponseBody
    @RequestMapping("/getAllPerson")
   // private String getAllPerson(@PathVariable Integer id, @PathVariable String name, @PathVariable Integer age){
    private ModelAndView getAllPerson(){
        System.out.println("222");
      //List<Person> persons=personService.getAllPerson();
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("key",12345);
        return modelAndView;
    }
    @RequestMapping("/getPath")
    // private String getAllPerson(@PathVariable Integer id, @PathVariable String name, @PathVariable Integer age){
    private String getPath(){
        System.out.println("222");
        //List<Person> persons=personService.getAllPerson();
        return "index2";
    }
}
