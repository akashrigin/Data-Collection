package com.example.demo.Repository;

import com.example.demo.Entity.Interface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterfaceRepository extends JpaRepository<Interface, String> {

    @Query( value="Select * From interface  Where monitor_id = ?1",nativeQuery=true)
    List<Interface> getInterface(int monitorid);

    @Query( value="select a.name,a.ind,a.type,a.status,a.id,a.admin,b.discards,b.error,b.in_traffic,b.out_traffic,b.rx_utilized,b.tx_utilized,b.monitor_id,c.date,c.time from " +
            "(select distinct name,ind,type,status,ind as id,admin from interface where monitor_id=?1) as a join " +
            "(select avg(discards) as discards,avg(error) as error,avg(in_traffic) as in_traffic,avg(out_traffic) " +
            "as out_traffic,avg(rx_utilized) as rx_utilized,avg(tx_utilized) as tx_utilized,monitor_id,ind from " +
            "interface where monitor_id=?1 group by ind) as b on a.ind=b.ind join" +
            "(select date ,time,monitor_id from interface where monitor_id=?1 limit 1 ) as c on c.monitor_id=b.monitor_id order by ind;",nativeQuery=true)
    List<Interface> getInterfaces(int monitorid);

    @Query( value="select date as * from interface where monitor_id=?1 and ind=?2 limit 15;",nativeQuery=true)
    List<Interface> getInterfaceField(int monitorid, int ind);
}
