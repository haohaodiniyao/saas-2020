package com.example.saas2020.dao;

import com.example.saas2020.pojo.SaasPricePlanPO;
import org.jfaster.mango.annotation.*;
import org.jfaster.mango.crud.CrudDao;

@DB(name = "saasCharge",table = "saas_price_plan")
@Sharding(tableShardingStrategy = ScflTableShardingStrategy.class)
public interface SaasPricePlanDAO {
    @ReturnGeneratedId
    @SQL("INSERT INTO #table(" +
            "base_price," +
            "include_minute," +
            "include_mileage," +
            "duration_price," +
            "mileage_price," +
            "duration_val," +
            "mileage_val," +
            "distance_val," +
            "duration_strategy," +
            "mile_strategy," +
            "create_date," +
            "#if(:1.createUser != null)create_user, #end " +
            "update_date," +
            "#if(:1.updateUser != null)update_user, #end " +
            "#if(:1.driverId != null)driver_id #end " +
            "VALUES( " +
            ":1.basePrice," +
            ":1.includeMinute," +
            ":1.includeMileage," +
            ":1.durationPrice," +
            ":1.mileagePrice," +
            ":1.durationVal," +
            ":1.mileageVal," +
            ":1.distanceVal," +
            ":1.durationStrategy," +
            ":1.mileStrategy," +
            "NOW()," +
            "#if(:1.createUser != null):1.createUser, #end " +
            "NOW()," +
            "#if(:1.updateUser != null),:1.updateUser #end " +
            "#if(:1.driverId != null), :1.driverId #end " +
            ")")
    int addSaasPricePlan(SaasPricePlanPO saasPricePlanPO, @TableShardingBy boolean isDriver);

    @SQL("update #table set " +
            "update_date = NOW() " +
            " #if(:1 != null and :1.basePrice != null) ,base_price = :1.basePrice #end " +
            " #if(:1 != null and :1.includeMinute != null) ,include_minute = :1.includeMinute #end " +
            " #if(:1 != null and :1.includeMileage != null) ,include_mileage = :1.includeMileage #end " +
            " #if(:1 != null and :1.durationPrice != null) ,duration_price = :1.durationPrice #end " +
            " #if(:1 != null and :1.mileagePrice != null) ,mileage_price = :1.mileagePrice #end " +
            " #if(:1 != null and :1.durationVal != null) ,duration_val = :1.durationVal #end " +
            " #if(:1 != null and :1.mileageVal != null) ,mileage_val = :1.mileageVal #end " +
            " #if(:1 != null and :1.distanceVal != null) ,distance_val = :1.distanceVal #end " +
            " #if(:1 != null and :1.updateUser != null) ,update_user = :1.updateUser #end " +
            " where " +
            " id = :1.id " +
            "")
    int updateSaasPricePlan(SaasPricePlanPO saasPricePlanPO, @TableShardingBy boolean isDriver);

    @SQL("select * from #table where id = :1")
    SaasPricePlanPO findById(Long id,@TableShardingBy boolean isDriver);
}
