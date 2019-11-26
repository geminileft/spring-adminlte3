package com.example.springadminlte3;

import com.example.springadminlte3.models.CustomerRepository;
import com.example.springadminlte3.models.Task;
import com.example.springadminlte3.models.TaskRepository;
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

@Controller
public class DashboardController {

    private static final Logger log = LoggerFactory.getLogger(DashboardController.class);

    @RequestMapping(value={"/", "/dashboard-1"})
    public String getDashboard1() {
        return "dashboard-1";
    }

    @RequestMapping("/dashboard-2")
    public String getDashboard2() {
        return "dashboard-2";
    }

    @RequestMapping("/dashboard-3")
    public String getDashboard3() {
        return "dashboard-3";
    }

}
