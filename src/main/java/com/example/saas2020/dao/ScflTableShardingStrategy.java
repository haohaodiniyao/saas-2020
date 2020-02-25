package com.example.saas2020.dao;

import org.jfaster.mango.sharding.TableShardingStrategy;

public class ScflTableShardingStrategy implements TableShardingStrategy<Boolean> {

    @Override
    public String getTargetTable(String table, Boolean isDriver) {
        return isDriver ? table + "_driver" : table;
    }

}