package cn.itcast.ssm.service;

import cn.itcast.ssm.domain.Product;

import java.util.List;

/**
 * @author ysk
 * @create 2019-07-26-10:33
 */
public interface IProductService {
    public List<Product> findAll(Integer page,Integer size) throws Exception;

    void save(Product product) throws Exception;

}
