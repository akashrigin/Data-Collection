package com.example.demo.Controller;

import com.example.demo.Entity.Monitor;
import com.example.demo.Service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
public class MonitorController {

    @Autowired
    public MonitorService monitorservice;

    @GetMapping("/monitor")
    public List<Monitor> getMonitor(){
        return monitorservice.getMonitor();
    }

    @GetMapping("/monitor/{monitorid}")
    public Monitor getMonitorById(@PathVariable int monitorid){
        return monitorservice.getMonitorById(monitorid);
    }

}
