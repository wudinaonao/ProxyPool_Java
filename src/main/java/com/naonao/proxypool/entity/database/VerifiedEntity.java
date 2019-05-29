package com.naonao.proxypool.entity.database;

import lombok.Data;

/**
 * @program: ProxyPool
 * @description:
 * @author: Wen lyuzhao
 * @create: 2019-05-29 23:39
 **/
@Data
public class VerifiedEntity {
    private Long id;
    private String ip;
    private String port;
    private String type;
    private String location;
    private String speed;
    private String lastUpdateTime;
    private String md5;
    private Long weight;
}
