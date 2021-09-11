package com.course.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.course.common.entity.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Angelo
 * @date 2021/9/11 10:11
 **/
@Mapper
public interface TestMapper extends BaseMapper<Test> {


}
