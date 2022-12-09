package com.neo4j.simple.service;


import com.neo4j.simple.service.impl.SelectNeo4jNodeServiceImpl;
import com.neo4j.simple.util.Neo4jUtil;
import org.junit.Test;

import javax.annotation.Resource;


public class SelectNeo4jNodeService implements SelectNeo4jNodeServiceImpl {
    @Resource
    Neo4jUtil neo4jUtil;

    @Override
    public void selectAllLabels(){
//        String temp = neo4jUtil.getAllLabelName().toString();
//        System.out.println(temp);
        System.out.println(neo4jUtil.getAllLabelName().toString());
    }

}
