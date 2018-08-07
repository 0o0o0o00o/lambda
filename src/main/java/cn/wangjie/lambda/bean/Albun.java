package cn.wangjie.lambda.bean;

import lombok.Data;

/**
 * @program: lambda
 * @description: 专辑
 * @author: WangJie
 * @create: 2018-08-07 17:37
 **/
@Data
public class Albun {
    /** 专辑名 */
    private String name;
    /** 专辑曲目列表*/
    private String tracks;
    /** 专辑艺术家列表 */
    private String musicians;
}
