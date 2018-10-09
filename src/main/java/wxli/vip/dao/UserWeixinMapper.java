package wxli.vip.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wxli.vip.entity.UserWeixin;
import wxli.vip.entity.UserWeixinExample;

public interface UserWeixinMapper {
    long countByExample(UserWeixinExample example);

    int deleteByExample(UserWeixinExample example);

    int deleteByPrimaryKey(Long wxid);

    int insert(UserWeixin record);

    int insertSelective(UserWeixin record);

    List<UserWeixin> selectByExample(UserWeixinExample example);

    UserWeixin selectByPrimaryKey(Long wxid);

    int updateByExampleSelective(@Param("record") UserWeixin record, @Param("example") UserWeixinExample example);

    int updateByExample(@Param("record") UserWeixin record, @Param("example") UserWeixinExample example);

    int updateByPrimaryKeySelective(UserWeixin record);

    int updateByPrimaryKey(UserWeixin record);
}