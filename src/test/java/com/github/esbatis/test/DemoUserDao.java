package com.github.esbatis.test;

import com.github.esbatis.annotations.Param;
import com.github.esbatis.annotations.Result;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoUserDao {

    Long index(@Param("demoUser") DemoUser demoUser);

    List<Demo> findDemoUser(@Param("id") Long id);

    void update();

    boolean bulk();

    List<Demo> mget();

    int updateByQuery();

    Long insertPolygon();

    void insertDemoUser(@Param("demoUser") DemoUser demoUser);
}
