package com.naonao.proxypool.entity.database;

import lombok.Data;

/**
 * @program: ProxyPool
 * @description:
 * @author: Wen lyuzhao
 * @create: 2019-05-29 23:41
 **/
@Data
public class APIEntity {
    private Long id;
    private String url;
    private String method;
    private String params;
    private String response;
}
