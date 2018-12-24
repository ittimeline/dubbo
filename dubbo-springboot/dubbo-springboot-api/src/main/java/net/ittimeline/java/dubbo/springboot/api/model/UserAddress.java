package net.ittimeline.java.dubbo.springboot.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * UserAddress
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-16 15:25
 * @website www.ittimeline.net
 * @since JDK8u192
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress implements Serializable {

    /**
     * 用户编号
     */
    private Long id;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 收货人
     */
    private String consignee;


    /**
     * 是否为默认地址
     */
    private String isDefault;





}
