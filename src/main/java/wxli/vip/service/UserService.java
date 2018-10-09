package wxli.vip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import wxli.vip.automapping.UserMapping;
import wxli.vip.common.JsonHelper;
import wxli.vip.dao.UserMapper;
import wxli.vip.dao.UserMobileMapper;
import wxli.vip.dao.UserWeixinMapper;
import wxli.vip.entity.*;
import wxli.vip.model.UserDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    private UserMapping userMapping;
    @Autowired
    private UserMobileMapper userMobileMapper;
    @Autowired
    private UserWeixinMapper userWeixinMapper;

    @Autowired
    JedisPool jedisPool;
    private UserExample example;

    public UserDTO queryById(int userid) {
        UserDTO vm = null;

        String key = "user:"+userid;
        String value = jedisPool.getResource().get(key);
        if(value==null) {
            User user = userMapper.selectByPrimaryKey(userid);

            UserMobileExample userMobileExample = new UserMobileExample();
            userMobileExample.or().andUseridEqualTo(userid);
            List<UserMobile> userMobiles = userMobileMapper.selectByExample(userMobileExample);

            UserWeixinExample userWeixinExample = new UserWeixinExample();
            userWeixinExample.or().andUseridEqualTo(Long.valueOf(userid));

            List<UserWeixin> userWeixins = userWeixinMapper.selectByExample(userWeixinExample);

            vm = userMapping.targetToSource(user);
            if(userMobiles!=null && userMobiles.size()>0) {
                vm.setMobile(userMobiles.get(0).getMobile());
            }

            if(userWeixins!=null && userWeixins.size()>0) {
                vm.setUnionId(userWeixins.get(0).getUnionid());
                vm.setWsOpenId(userWeixins.get(0).getWsopenid());
            }
            jedisPool.getResource().set(key,JsonHelper.toJson(vm));
        } else {
            vm = JsonHelper.toInstance(value,UserDTO.class);
        }
        return vm;
    }

    public List<UserDTO> queryList(int page, int size) {
        example = new UserExample();
        UserExample.Criteria  criteria = example.createCriteria();
        criteria.andUseridGreaterThan(0);
        example.setOffset((page-1) * size);
        example.setLimit(size);
        List<User> users = userMapper.selectByExample(example);
        List<UserDTO> userModels = new ArrayList<>();
        //AutoMapper.mappingList(users, userModels, UserDTO.class);
        users.forEach(user -> userModels.add(queryById(user.getUserid())));
        return userModels;
    }
}
