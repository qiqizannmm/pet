package com.hzlx.ch06.pet.service.impl;

import com.hzlx.ch06.pet.enitiy.UserInfo;
import com.hzlx.ch06.pet.service.UserInfoService;
import com.hzlx.ch06.pet.utils.SaveDataUtil;

import java.util.*;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/4/12 15:47
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public class UserInfoServiceImpl implements UserInfoService {
    private Scanner input=new Scanner(System.in);
    static Map<String,UserInfo> userInfos=new HashMap<>();
    static {
        //把所有用户加载到一个集合中
        userInfos= SaveDataUtil.getUserInfos();
    }
    @Override
    public void homeMenu() {
        boolean flag=true;
        while (flag){
            System.out.println("==>龙窝儿->用户版===========================");
            System.out.println("\t\t1.用户注册");
            System.out.println("\t\t2.用户登录");
            System.out.println("\t\t0|其他.用户返回上一级");
            System.out.print("请输入菜单编号：");
            String menuId=input.next();
            flag=checkMenu(menuId);
        }
    }

    private boolean checkMenu(String menuId) {
        boolean flag=true;
        switch (menuId){
            case "1":
                //用户注册的逻辑
                registerUserInfo();
                break;
            case "2":
                //用户登录的逻辑
                userInfoLogin();
                break;
            default:
                flag=false;
                break;
        }
        return flag;
    }

    private void userInfoLogin() {
        System.out.println("-->龙窝儿->用户版->用户登录--------------");
        System.out.print("\n请输入账号：");
        String userName=input.next();
        System.out.print("请输入密码：");
        String onePwd=input.next();
        UserInfo userInfo = userInfos.get(userName);
        if (userInfo==null){
            System.out.println("账号或密码错误，登录失败！");
            return;
        }
        //取匹配账号密码
        if (onePwd.equals(userInfo.getPassword())) {
            //显示登录成功的菜单
            System.out.println("登录成功！欢迎您 "+userInfo.getNickName());
        }else {
            System.out.println("账号或密码错误，登录失败！");
        }
    }

    /**
     * 用户注册方法
     */
    private void registerUserInfo() {
        System.out.println("-->龙窝儿->用户版->用户注册--------------");
        //TODO 账号规则校验
        System.out.print("\n请输入账号：");
        String userName=input.next();
        //TODO 重名校验
        System.out.print("请输入密码：");
        String onePwd=input.next();
        System.out.print("请确认密码：");
        String towPwd=input.next();
        //TODO 两次密码是否相同校验
        System.out.print("请输入昵称：");
        String nickName=input.next();
        System.out.print("请输入联系方式：");
        String tel=input.next();
        System.out.print("请输入身份证号：");
        String idCard=input.next();
        System.out.print("请输入头像：");
        String headImg=input.next();
        System.out.print("请输入签名：");
        String desc=input.next();

        UserInfo userInfo=new UserInfo();
        userInfo.setUserName(userName);
        userInfo.setPassword(onePwd);
        userInfo.setNickName(nickName);
        userInfo.setTel(tel);
        userInfo.setIdCard(idCard);
        userInfo.setHeadImg(headImg);
        userInfo.setDesc(desc);
        userInfo.setCreateTime(new Date());
        userInfo.setStatus(1);
        userInfos.put(userName,userInfo);
        //把用户录入的信息存到 一个文件中
       boolean saveStatus= SaveDataUtil.saveUserInfo(userInfos);
       if (!saveStatus){
           System.out.println("系统错误，注册失败！");
       }else {
           System.out.println("恭喜你注册成功！");
       }
    }
}
