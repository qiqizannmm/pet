package com.hzlx.ch06.pet;

import com.hzlx.ch06.pet.service.SystemService;
import com.hzlx.ch06.pet.service.impl.SystemServiceImpl;


/**
 * Description:
 * 宠物馆的登录注册  --->通过IO方式存储数据
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/4/12 14:56
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public class LoginAndRegisterByIO {
    //这是一个main方法，这是程序的入口
    public static void main(String[] args) {
        //系统业务层
        SystemService systemService=new SystemServiceImpl();
        boolean flag = true;


        while (flag) {
            flag =  systemService.homeMenu();
        }
    }
}
