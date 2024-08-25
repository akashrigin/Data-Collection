package com.example.demo.Service;

import com.example.demo.Entity.Monitor;
import com.example.demo.Repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {

    @Autowired
    public MonitorRepository monitorRepo;

    public List<Monitor> getMonitor() { return monitorRepo.findAll(); }

    public Monitor getMonitorById(int moniterid) {
        return monitorRepo.findById(moniterid).orElse(null);
    }
}
