package com.yupi.module;

import lombok.Data;

/**
 * 动态模板配置
 */
@Data
public class MainTemplateConfig {
//    让我们先明确几个动态生成的需求：
    //    1.在代码开头增加作者 @Author 注释（增加代码）
    //    2.修改程序输出的信息提示（替换代码）
    //    3.将循环读取输入改为单次读取（可选代码）

    /**
     * 作者注释
     */
    private String author = "yupi";
    /**
     * 输出信息
     */
    private String outputText = "输出结果";
    /**
     * 是否生成循环
     */
    private boolean loop;


}
