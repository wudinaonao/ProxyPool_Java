package com.naonao.proxypool.mapper;

import com.naonao.proxypool.entity.database.APIEntity;
import com.naonao.proxypool.entity.database.UnVerifiedEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: ProxyPool
 * @description:
 * @author: Wen lyuzhao
 * @create: 2019-05-29 23:41
 **/

@Mapper
@Component
@Scope("prototype")
public interface APIMapper {

    APIEntity getApiEntityyById(Long id);
    List<APIEntity> getApiEntityAll();

    void insert(APIEntity apiEntity);
    void delete(APIEntity apiEntity);
    void update(APIEntity apiEntity);

}
