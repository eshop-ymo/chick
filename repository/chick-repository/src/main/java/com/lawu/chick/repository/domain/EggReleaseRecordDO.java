package com.lawu.chick.repository.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EggReleaseRecordDO implements Serializable {
    /**
     *
     * 主键
     * egg_release_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 用户编号
     * egg_release_record.member_num
     *
     * @mbg.generated
     */
    private String memberNum;

    /**
     *
     * 小鸡编号
     * egg_release_record.chick_num
     *
     * @mbg.generated
     */
    private String chickNum;

    /**
     *
     * 发放的金蛋数
     * egg_release_record.eggs
     *
     * @mbg.generated
     */
    private BigDecimal eggs;

    /**
     *
     * 创建时间
     * egg_release_record.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table egg_release_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_release_record.id
     *
     * @return the value of egg_release_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_release_record.id
     *
     * @param id the value for egg_release_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_release_record.member_num
     *
     * @return the value of egg_release_record.member_num
     *
     * @mbg.generated
     */
    public String getMemberNum() {
        return memberNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_release_record.member_num
     *
     * @param memberNum the value for egg_release_record.member_num
     *
     * @mbg.generated
     */
    public void setMemberNum(String memberNum) {
        this.memberNum = memberNum == null ? null : memberNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_release_record.chick_num
     *
     * @return the value of egg_release_record.chick_num
     *
     * @mbg.generated
     */
    public String getChickNum() {
        return chickNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_release_record.chick_num
     *
     * @param chickNum the value for egg_release_record.chick_num
     *
     * @mbg.generated
     */
    public void setChickNum(String chickNum) {
        this.chickNum = chickNum == null ? null : chickNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_release_record.eggs
     *
     * @return the value of egg_release_record.eggs
     *
     * @mbg.generated
     */
    public BigDecimal getEggs() {
        return eggs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_release_record.eggs
     *
     * @param eggs the value for egg_release_record.eggs
     *
     * @mbg.generated
     */
    public void setEggs(BigDecimal eggs) {
        this.eggs = eggs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_release_record.gmt_create
     *
     * @return the value of egg_release_record.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_release_record.gmt_create
     *
     * @param gmtCreate the value for egg_release_record.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}