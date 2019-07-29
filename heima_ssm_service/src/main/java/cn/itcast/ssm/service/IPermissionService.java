package cn.itcast.ssm.service;

import cn.itcast.ssm.domain.Permission;

import java.util.List;

/**
 * @author ysk
 * @create 2019-07-28-20:44
 */
public interface IPermissionService {

    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
