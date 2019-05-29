package com.naonao.proxypool.test;

import com.naonao.proxypool.entity.database.UnVerifiedEntity;
import com.naonao.proxypool.entity.database.VerifiedEntity;
import com.naonao.proxypool.mapper.UnVerifiedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: ProxyPool
 * @description:
 * @author: Wen lyuzhao
 * @create: 2019-05-30 00:08
 **/
@RestController
public class Demo {

    @Autowired
    private UnVerifiedMapper unVerifiedMapper;

    @GetMapping("/demo1")
    public List<UnVerifiedEntity> test(){
        // return unVerifiedMapper.getUnVerifiedEntityByHash("3F94266556E774184166C0A0B6AB6F6D");
        return unVerifiedMapper.getUnVerifiedEntityAll();
    }


}
