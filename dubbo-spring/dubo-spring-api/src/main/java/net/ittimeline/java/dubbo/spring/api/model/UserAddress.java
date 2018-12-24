package net.ittimeline.java.dubbo.spring.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户地址
 *
 * @author liuguanglei 18601767221@163.com
 * @create 2018-12-15 13:48
 * @website www.ittimeline.net
 * @since JDK8u192
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
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
