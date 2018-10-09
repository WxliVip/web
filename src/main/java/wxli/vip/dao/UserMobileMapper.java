package wxli.vip.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wxli.vip.entity.UserMobile;
import wxli.vip.entity.UserMobileExample;

public interface UserMobileMapper {
    long countByExample(UserMobileExample example);

    int deleteByExample(UserMobileExample example);

    int deleteByPrimaryKey(Integer umid);

    int insert(UserMobile record);

    int insertSelective(UserMobile record);

    List<UserMobile> selectByExample(UserMobileExample example);

    UserMobile selectByPrimaryKey(Integer umid);

    int updateByExampleSelective(@Param("record") UserMobile record, @Param("example") UserMobileExample example);

    int updateByExample(@Param("record") UserMobile record, @Param("example") UserMobileExample example);

    int updateByPrimaryKeySelective(UserMobile record);

    int updateByPrimaryKey(UserMobile record);
}