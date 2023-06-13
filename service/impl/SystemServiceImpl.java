package com.hzlx.ch06.pet.service.impl;

import com.hzlx.ch06.pet.service.SystemService;
import com.hzlx.ch06.pet.service.UserInfoService;

import java.util.Scanner;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/4/12 15:13
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public class SystemServiceImpl implements SystemService {
    private Scanner input=new Scanner(System.in);
    private UserInfoService userInfoService=new UserInfoServiceImpl();
    @Override
    public boolean homeMenu() {
        System.out.println("====================龙窝儿======================");
        System.out.println("\t\t1.商家版");
        System.out.println("\t\t2.用户版");
        System.out.println("\t\t3.系统管理");
        System.out.println("\t\t0|其他.退出系统");
        System.out.print("请选择菜单：");
        String next = input.next();
        return checkMenu(next);
    }

    @Override
    public boolean checkMenu(String menuId) {
        boolean flag=true;
        switch (menuId){
            case "1":
                //商家版的主菜单
                break;
            case "2":
                //用户版的主菜单
                userInfoService.homeMenu();
                break;
            case "3":
                //系统管理的主菜单
                break;
            default:
                flag=false;
                break;
        }
        return flag;
    }
}
