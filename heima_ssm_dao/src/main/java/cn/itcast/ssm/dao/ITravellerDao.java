package cn.itcast.ssm.dao;

import cn.itcast.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ysk
 * @create 2019-07-27-15:12
 */
public interface ITravellerDao {

    @Select("select * from traveller where id in(select travellerId from order_traveller where orderId = #{orderId})")
    public List<Traveller> findByOrdersId(String orderId) throws Exception;
}
