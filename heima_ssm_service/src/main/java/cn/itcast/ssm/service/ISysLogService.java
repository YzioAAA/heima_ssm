package cn.itcast.ssm.service;

import cn.itcast.ssm.domain.SysLog;

import java.util.List;

/**
 * @author ysk
 * @create 2019-07-29-16:10
 */
public interface ISysLogService {

    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll(Integer page,Integer size) throws Exception;
}
