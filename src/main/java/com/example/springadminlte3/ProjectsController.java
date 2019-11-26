package com.example.springadminlte3;

import com.example.springadminlte3.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

@Controller
@RequestMapping("/projects")
public class ProjectsController {

    private static final Logger log = LoggerFactory.getLogger(ProjectsController.class);
    private CustomerRepository customerRepository;
    private TaskRepository taskRepository;

    @Autowired
    public ProjectsController(CustomerRepository customerRepository, TaskRepository taskRepository) {

        this.customerRepository = customerRepository;
        this.taskRepository = taskRepository;
    }

    @RequestMapping("/add")
    public String getTablesSimple(Model model) {
        return "project-add";
    }

    @PostMapping(value = "/new", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Task newTask(@RequestBody Task newTask) {
        Task t = taskRepository.save(newTask);
        return t;
    }
}
