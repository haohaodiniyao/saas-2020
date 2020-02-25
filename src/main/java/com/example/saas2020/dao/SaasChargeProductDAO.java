package com.example.saas2020.dao;

import com.example.saas2020.pojo.SaasChargeProductPO;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.crud.CrudDao;

@DB(name = "saasCharge",table = "saas_charge_product")
public interface SaasChargeProductDAO extends CrudDao<SaasChargeProductPO,Long> {

    @SQL("update #table set " +
            "update_date = NOW()" +
            "#if(:1.name != null) ,name=:1.name #end " +
            "#if(:1.cityId != null) ,city_id=:1.cityId #end " +
            "#if(:1.serviceProductId != null) ,service_product_id=:1.serviceProductId #end " +
            "#if(:1.serviceTypeId != null) ,service_type_id=:1.serviceTypeId #end " +
            "#if(:1.groupId != null) ,group_id=:1.groupId #end " +
            "#if(:1.startTime != null) ,start_time=:1.startTime #end " +
            "#if(:1.endTime != null) ,end_time=:1.endTime #end " +
            "#if(:1.workdayPriceId != null) ,workday_price_id=:1.workdayPriceId #end " +
            "#if(:1.holidayPriceId != null) ,holiday_price_id=:1.holidayPriceId #end " +
            "#if(:1.waitStrategyId != null) ,wait_strategy_id=:1.waitStrategyId #end " +
            "#if(:1.cancelStrategyId != null) ,cancel_strategy_id=:1.cancelStrategyId #end " +
            "#if(:1.otherFeeRate != null) ,other_fee_rate=:1.otherFeeRate #end " +
            "#if(:1.status != null) ,status=:1.status #end " +
            "#if(:1.updateUser != null) ,update_user=:1.updateUser #end " +
            "where id = :1.id " +
            "")
    int updateSaasChargeProduct(SaasChargeProductPO saasChargeProductPO);

}
