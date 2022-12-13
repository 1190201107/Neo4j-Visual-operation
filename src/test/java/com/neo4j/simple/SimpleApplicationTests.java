package com.neo4j.simple;

import com.neo4j.simple.util.Neo4jUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@SpringBootTest
class SimpleApplicationTests {
    @Resource
    Neo4jUtil neo4jUtil;

    @Test
    void contextLoads() {
    }

    @Test
    public void neo4jUtilTest(){
        List<String> allLabelName = neo4jUtil.getAllLabelName();
        Iterator<String> label = allLabelName.iterator();
        while(label.hasNext()){
            System.out.println(label.next());
        }

    }

}
