package com.example.demo.Service;

import com.example.demo.Entity.Interface;
import com.example.demo.Repository.InterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterfaceService {

    @Autowired
    public InterfaceRepository interfaceRepository;

    public List<Interface> getInterface(int monitorid) {
        return interfaceRepository.getInterface(monitorid);
    }

    public List<Interface> getInterfaces(int monitorid) {
        return interfaceRepository.getInterfaces(monitorid);
    }

    public List<Interface> getInterfacesFields(int monitorid, int interfaceind) {
        System.out.println(interfaceind);
        return interfaceRepository.getInterfaceField(monitorid,interfaceind);
    }

}
