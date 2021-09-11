package com.course.common.service;

import com.course.common.entity.Test;
import com.course.common.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Angelo
 * @date 2021/9/11 10:13
 **/
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

public List<Test> list(){
 return testMapper.queryList();
}



}
