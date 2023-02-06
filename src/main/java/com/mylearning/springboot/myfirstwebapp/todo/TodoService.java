package com.mylearning.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todo = new ArrayList<>();

    static {
        todo.add(new Todo(1,"anil","learning Microservices", LocalDate.now().plusYears(2),true));
        todo.add(new Todo(1,"anil","learning SAAS", LocalDate.now().plusYears(3),true));
        todo.add(new Todo(1,"anil","Creating Website", LocalDate.now().plusYears(1),true));



    }

    public List<Todo> findByUserName ( String userName) {
        return  todo;
    }

}
