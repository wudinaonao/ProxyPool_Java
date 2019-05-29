package com.naonao.proxypool.mapper;

import com.naonao.proxypool.entity.database.VerifiedEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @program: ProxyPool
 * @description:
 * @author: Wen lyuzhao
 * @create: 2019-05-29 23:41
 **/

@Mapper
@Component
@Scope("prototype")
public interface VerifiedMapper {
    VerifiedEntity getVerifiedEntityById(Long id);
    VerifiedEntity getVerifiedEntityByHash(String hash);

    void insert(VerifiedEntity verifiedEntity);
    void delete(VerifiedEntity verifiedEntity);
    void update(VerifiedEntity verifiedEntity);
}
