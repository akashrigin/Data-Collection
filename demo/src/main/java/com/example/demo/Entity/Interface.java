package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="interface")

public class Interface {
    @Id
    private String id;
    @Temporal(TemporalType.TIME)
    private Date time;
    private int ind;
    private int monitor_id;
    private int admin;
    private String name;
    private String type;
    private long in_traffic;
    private float rx_utilized;
    private long out_traffic;
    private float tx_utilized;
    private float error;
    private float discards;
    private int status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

//    public Interface(String id, Date time,int ind, int monitorId, int admin,String name, String type, long inTraffic, float rxUtilized, long outTraffic, float txUtilized, float errorpercent, float discardpercent, int status,Date date) {
//        this.id=id;
//        this.time=date;
//        this.ind=ind;
//        this.monitor_id=monitorId;
//        this.admin=admin;
//        this.name=name;
//        this.type=type;
//        this.in_traffic=inTraffic;
//        this.rx_utilized=rxUtilized;
//        this.out_traffic=outTraffic;
//        this.tx_utilized=txUtilized;
//        this.error=errorpercent;
//        this.discards=discardpercent;
//        this.status=status;
//        this.date=date;
//    }

}
