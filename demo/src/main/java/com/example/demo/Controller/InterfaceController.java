package com.example.demo.Controller;

import com.example.demo.Entity.Interface;
import com.example.demo.Service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/monitor/{monitorid}")
public class InterfaceController {

    @Autowired
    public InterfaceService interfaceService;

    //Not Used Method
    @GetMapping("/interface")
    public List<Interface> getInterface(@PathVariable int monitorid){
        return interfaceService.getInterface(monitorid);
    }

    @GetMapping("/interfaces")
    public List<Interface> getInterfaces(@PathVariable int monitorid){
        return interfaceService.getInterfaces(monitorid);
    }

    @GetMapping("/interface/{interfaceind}/{field}")
    public List<Interface> getInterfaceField(@PathVariable int monitorid,@PathVariable int interfaceind,@PathVariable String field){

        return interfaceService.getInterfacesFields(monitorid,interfaceind);
    }


}
