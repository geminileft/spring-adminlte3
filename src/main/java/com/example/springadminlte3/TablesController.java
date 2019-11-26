package com.example.springadminlte3;

import com.example.springadminlte3.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

@Controller
@RequestMapping("/tables")
public class TablesController {

    private static final Logger log = LoggerFactory.getLogger(TablesController.class);
    private CustomerRepository customerRepository;
    private TaskRepository taskRepository;

    @Autowired
    public TablesController(CustomerRepository customerRepository, TaskRepository taskRepository) {

        this.customerRepository = customerRepository;
        this.taskRepository = taskRepository;
    }

    @RequestMapping("/simple")
    public String getTablesSimple(Model model) {
        for (Customer customer : customerRepository.findAll()) {
            log.info(customer.toString());
        }

        List tasks = new Vector<TaskEntry>();
        for (Task task : taskRepository.findAll()) {
            tasks.add(new TaskEntry(task.getId(), task.getTaskName(), task.getPercentComplete()));
            log.info(task.toString());
        }

        log.info("Finally after");
        model.addAttribute("tasks", tasks);

        return "tables-simple";
    }
}
