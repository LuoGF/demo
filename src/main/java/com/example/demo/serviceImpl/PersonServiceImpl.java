package com.example.demo.serviceImpl;

import com.example.demo.entity.Person;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value="personService")
public class PersonServiceImpl implements PersonService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<Person> getAllPerson() {
        return userMapper.getAllPerson();
    }
}
