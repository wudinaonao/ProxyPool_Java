package com.naonao.proxypool.mapper;

import com.naonao.proxypool.entity.database.UnVerifiedEntity;
import com.naonao.proxypool.entity.database.VerifiedEntity;
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
public interface UnVerifiedMapper {

    UnVerifiedEntity getUnVerifiedEntityById(Long id);
    UnVerifiedEntity getUnVerifiedEntityByHash(String hash);
    List<UnVerifiedEntity> getUnVerifiedEntityAll();

    void insert(UnVerifiedEntity unVerifiedEntity);
    void delete(UnVerifiedEntity unVerifiedEntity);
    void update(UnVerifiedEntity unVerifiedEntity);
}
