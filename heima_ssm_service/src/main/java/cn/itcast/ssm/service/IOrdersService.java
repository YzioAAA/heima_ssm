package cn.itcast.ssm.service;

import cn.itcast.ssm.domain.Orders;

import java.util.List;

/**
 * @author ysk
 * @create 2019-07-27-9:44
 */
public interface IOrdersService {

    public List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
