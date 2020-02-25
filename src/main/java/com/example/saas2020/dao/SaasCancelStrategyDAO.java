package com.example.saas2020.dao;

import com.example.saas2020.pojo.SaasCancelStrategyPO;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.crud.CrudDao;

@DB(name = "saasCharge",table = "saas_cancel_strategy")
public interface SaasCancelStrategyDAO extends CrudDao<SaasCancelStrategyPO,Long> {
    @SQL("update #table set " +
            "update_date = NOW() " +
            "#if(:1.name != null) and name = :1.name #end " +
            "#if(:1.ruleVal != null) and rule_val = :1.ruleVal #end " +
            "#if(:1.updateUser != null) and update_user = :1.updateUser #end " +
            "where id = :1.id " +
            "")
    int updateSaasCancelStrategy(SaasCancelStrategyPO saasCancelStrategyPO);
}
