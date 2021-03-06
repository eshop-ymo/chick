package com.lawu.chick.repository.domain;

import java.io.Serializable;
import java.util.Date;

public class PraySignRecordDO implements Serializable {
    /**
     *
     * 主键
     * pray_sign_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 关联配置id
     * pray_sign_record.rule_id
     *
     * @mbg.generated
     */
    private Long ruleId;

    /**
     *
     * 用户编号
     * pray_sign_record.member_num
     *
     * @mbg.generated
     */
    private String memberNum;

    /**
     *
     * 签到时间
     * pray_sign_record.sign_time
     *
     * @mbg.generated
     */
    private Date signTime;

    /**
     *
     * 领取时间
     * pray_sign_record.take_time
     *
     * @mbg.generated
     */
    private Date takeTime;

    /**
     *
     * 创建时间
     * pray_sign_record.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pray_sign_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pray_sign_record.id
     *
     * @return the value of pray_sign_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pray_sign_record.id
     *
     * @param id the value for pray_sign_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pray_sign_record.rule_id
     *
     * @return the value of pray_sign_record.rule_id
     *
     * @mbg.generated
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pray_sign_record.rule_id
     *
     * @param ruleId the value for pray_sign_record.rule_id
     *
     * @mbg.generated
     */
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pray_sign_record.member_num
     *
     * @return the value of pray_sign_record.member_num
     *
     * @mbg.generated
     */
    public String getMemberNum() {
        return memberNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pray_sign_record.member_num
     *
     * @param memberNum the value for pray_sign_record.member_num
     *
     * @mbg.generated
     */
    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum == null ? null : memberNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pray_sign_record.sign_time
     *
     * @return the value of pray_sign_record.sign_time
     *
     * @mbg.generated
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pray_sign_record.sign_time
     *
     * @param signTime the value for pray_sign_record.sign_time
     *
     * @mbg.generated
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pray_sign_record.take_time
     *
     * @return the value of pray_sign_record.take_time
     *
     * @mbg.generated
     */
    public Date getTakeTime() {
        return takeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pray_sign_record.take_time
     *
     * @param takeTime the value for pray_sign_record.take_time
     *
     * @mbg.generated
     */
    public void setTakeTime(Date takeTime) {
        this.takeTime = takeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pray_sign_record.gmt_create
     *
     * @return the value of pray_sign_record.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pray_sign_record.gmt_create
     *
     * @param gmtCreate the value for pray_sign_record.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}