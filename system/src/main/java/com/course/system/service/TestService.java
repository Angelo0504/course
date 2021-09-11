package com.course.system.service;

import com.course.system.domain.Test;
import com.course.system.mapper.TestMapper;
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
