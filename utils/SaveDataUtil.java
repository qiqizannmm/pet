package com.hzlx.ch06.pet.utils;


import com.hzlx.ch06.pet.enitiy.UserInfo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/4/12 16:11
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public class SaveDataUtil {
    static final String userInfoFilePath="D:\\Java_EE\\pet\\userInfo.txt";
    static final String businessInfoFilePath="D:\\WorkSpace\\JAVA_Projects\\JavaEE\\OOP\\src\\com\\hzlx\\ch06\\pet\\businessInfo.txt";
    public static boolean saveUserInfo(Map<String,UserInfo> map) {
        //用户数据写入的文件
        File file = new File(userInfoFilePath);
        //准备一个对象输出流
        ObjectOutputStream oos = null;
        try {
            //准备一个普通的字节输出流
            OutputStream os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            //往文件里写数据
            oos.writeObject(map);
        } catch (IOException e) {
            return false;
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                return false;
            }
        }
        return true;
    }

    public static Map<String,UserInfo> getUserInfos(){
        //读取回来的用户对象存放的集合
        HashMap<String,UserInfo> userInfoMap=new HashMap<>();
        //从哪个文件读
        File file =new File(userInfoFilePath);
        //准备一个对象输入流
        ObjectInputStream ois=null;
        try {
            //获取一个普通的字节输入流
            InputStream is=new FileInputStream(file);
            ois=new ObjectInputStream(is);
            userInfoMap= (HashMap) ois.readObject();
        } catch (IOException e) {
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return userInfoMap;
    }
}
