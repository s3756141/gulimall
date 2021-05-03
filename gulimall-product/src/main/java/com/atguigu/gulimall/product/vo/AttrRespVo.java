package com.atguigu.gulimall.product.vo;

import lombok.Data;

@Data
public class AttrRespVo extends AttrVo{

    private String catelogName;

    private String groupName;

    private Long[] catelogPath;
    /**
     * 值类型[0-为单个值，1-可以选择多个值]
     */
    private Integer valueType;

}
