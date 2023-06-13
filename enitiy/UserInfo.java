package com.hzlx.ch06.pet.enitiy;


import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 * 用户类
 *
 * @author: Mr、哈喽沃德
 * @Date: 2023/4/12 14:58
 * Created with IntelliJ IDEA.
 * To change this template use File | Settings | File And Code Templates.
 */
public class UserInfo implements Serializable {
    private final static long serialVersionUID = 1681282984312L;
    private String userName;
    private String password;
    private String nickName;
    private String tel;
    private String idCard;
    private String headImg;
    private String desc;
    private Date createTime;
    private Integer status;


    public UserInfo() {
    }

    public UserInfo(String userName, String password, String nickName, String tel, String idCard, String headImg, String desc, Date createTime, Integer status) {
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.tel = tel;
        this.idCard = idCard;
        this.headImg = headImg;
        this.desc = desc;
        this.createTime = createTime;
        this.status = status;
    }

    /**
     * 获取
     *
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     *
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取
     *
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置
     *
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取
     *
     * @return idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置
     *
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取
     *
     * @return headImg
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置
     *
     * @param headImg
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取
     *
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取
     *
     * @return createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     *
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取
     *
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String toString() {
        return "UserInfo{" + userName + ", password = " + password + ", nickName = " + nickName + ", tel = " + tel + ", idCard = " + idCard + ", headImg = " + headImg + ", desc = " + desc + ", createTime = " + createTime + ", status = " + status + "}";
    }
}
