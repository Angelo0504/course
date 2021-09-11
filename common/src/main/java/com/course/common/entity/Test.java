package com.course.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Angelo
 * @date 2021/9/11 10:06
 **/
@Data
@TableName("test")
public class Test {

    @TableId(type = IdType.AUTO)
    private String id;

    private String name;

}
