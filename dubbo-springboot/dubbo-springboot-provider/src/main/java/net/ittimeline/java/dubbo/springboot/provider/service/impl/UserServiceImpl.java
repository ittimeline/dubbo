package net.ittimeline.java.dubbo.springboot.provider.service.impl;


import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.annotation.Service;

import net.ittimeline.java.dubbo.springboot.api.model.UserAddress;
import net.ittimeline.java.dubbo.springboot.api.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * UserServiceImpl
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-15 13:55
 * @website www.ittimeline.net
 * @since JDK8u192
 */
@Service(timeout = 5000,version = "1.0.0") //基于注解暴露服务 服务提供方设置超时
@Component
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER= LogManager.getLogger();



    @Autowired
    private ProtocolConfig protocolConfig;

    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        LOGGER.info("execute get user address list method  dubbo port is {}",protocolConfig.getPort());
        //ignore userId

        List<UserAddress> userAddressList =new ArrayList<>();

        UserAddress xiaoshitou=new UserAddress();

        xiaoshitou.setId(1L);
        xiaoshitou.setUserAddress("上海市浦东新区");
        xiaoshitou.setConsignee("小石头");
        xiaoshitou.setIsDefault("0");


        UserAddress tony =new UserAddress();
        tony.setUserAddress("上海市宝山区");
        tony.setConsignee("tony");
        tony.setIsDefault("1");

        userAddressList.add(xiaoshitou);
        userAddressList.add(tony);

        //测试超时，这里sleep 8秒钟
        try {
            TimeUnit.SECONDS.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return userAddressList;
    }
}
