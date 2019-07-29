package cn.itcast.ssm.dao;

import cn.itcast.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @author ysk
 * @create 2019-07-27-14:55
 */
public interface IMemberDao {

    @Select("select * from member where id = #{id}")
    public Member findById(String id) throws Exception;
}
