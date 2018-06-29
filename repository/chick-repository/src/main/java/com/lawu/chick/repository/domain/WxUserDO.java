package com.lawu.chick.repository.domain;

import java.io.Serializable;
import java.util.Date;

public class WxUserDO implements Serializable {
    /**
     *
     * 主键
     * wx_user.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 用户编号
     * wx_user.member_num
     *
     * @mbg.generated
     */
    private String memberNum;

    /**
     *
     * openid
     * wx_user.openid
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * 昵称
     * wx_user.nickname
     *
     * @mbg.generated
     */
    private String nickname;

    /**
     *
     * 值为1时是男性，值为2时是女性，值为0时是未知
     * wx_user.gender
     *
     * @mbg.generated
     */
    private Integer gender;

    /**
     *
     * 用户所在城市
     * wx_user.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * 用户所在省份
     * wx_user.province
     *
     * @mbg.generated
     */
    private String province;

    /**
     *
     * 用户所在国家
     * wx_user.country
     *
     * @mbg.generated
     */
    private String country;

    /**
     *
     * 用户的语言，简体中文为zh_CN
     * wx_user.language
     *
     * @mbg.generated
     */
    private String language;

    /**
     *
     * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     * wx_user.avatarUrl
     *
     * @mbg.generated
     */
    private String avatarurl;

    /**
     *
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段
     * wx_user.unionid
     *
     * @mbg.generated
     */
    private String unionid;

    /**
     *
     * 是否订阅公众号
     * wx_user.subscribe
     *
     * @mbg.generated
     */
    private Boolean subscribe;

    /**
     *
     * 订阅时间
     * wx_user.subscribe_time
     *
     * @mbg.generated
     */
    private Date subscribeTime;

    /**
     *
     * 更新时间
     * wx_user.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * wx_user.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wx_user
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.id
     *
     * @return the value of wx_user.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.id
     *
     * @param id the value for wx_user.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.member_num
     *
     * @return the value of wx_user.member_num
     *
     * @mbg.generated
     */
    public String getMemberNum() {
        return memberNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.member_num
     *
     * @param memberNum the value for wx_user.member_num
     *
     * @mbg.generated
     */
    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum == null ? null : memberNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.openid
     *
     * @return the value of wx_user.openid
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.openid
     *
     * @param openid the value for wx_user.openid
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.nickname
     *
     * @return the value of wx_user.nickname
     *
     * @mbg.generated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.nickname
     *
     * @param nickname the value for wx_user.nickname
     *
     * @mbg.generated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.gender
     *
     * @return the value of wx_user.gender
     *
     * @mbg.generated
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.gender
     *
     * @param gender the value for wx_user.gender
     *
     * @mbg.generated
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.city
     *
     * @return the value of wx_user.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.city
     *
     * @param city the value for wx_user.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.province
     *
     * @return the value of wx_user.province
     *
     * @mbg.generated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.province
     *
     * @param province the value for wx_user.province
     *
     * @mbg.generated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.country
     *
     * @return the value of wx_user.country
     *
     * @mbg.generated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.country
     *
     * @param country the value for wx_user.country
     *
     * @mbg.generated
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.language
     *
     * @return the value of wx_user.language
     *
     * @mbg.generated
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.language
     *
     * @param language the value for wx_user.language
     *
     * @mbg.generated
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.avatarUrl
     *
     * @return the value of wx_user.avatarUrl
     *
     * @mbg.generated
     */
    public String getAvatarurl() {
        return avatarurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.avatarUrl
     *
     * @param avatarurl the value for wx_user.avatarUrl
     *
     * @mbg.generated
     */
    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl == null ? null : avatarurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.unionid
     *
     * @return the value of wx_user.unionid
     *
     * @mbg.generated
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.unionid
     *
     * @param unionid the value for wx_user.unionid
     *
     * @mbg.generated
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.subscribe
     *
     * @return the value of wx_user.subscribe
     *
     * @mbg.generated
     */
    public Boolean getSubscribe() {
        return subscribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.subscribe
     *
     * @param subscribe the value for wx_user.subscribe
     *
     * @mbg.generated
     */
    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.subscribe_time
     *
     * @return the value of wx_user.subscribe_time
     *
     * @mbg.generated
     */
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.subscribe_time
     *
     * @param subscribeTime the value for wx_user.subscribe_time
     *
     * @mbg.generated
     */
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.gmt_modified
     *
     * @return the value of wx_user.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.gmt_modified
     *
     * @param gmtModified the value for wx_user.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wx_user.gmt_create
     *
     * @return the value of wx_user.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wx_user.gmt_create
     *
     * @param gmtCreate the value for wx_user.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}