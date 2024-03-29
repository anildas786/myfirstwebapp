package com.mylearning.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    private  TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todo")
    public String listAllTodo (ModelMap modelMap) {

        List<Todo> todos = todoService.findByUserName("anil");

        modelMap.addAttribute("todos",todos);

        return "list-todo";

    }
}
