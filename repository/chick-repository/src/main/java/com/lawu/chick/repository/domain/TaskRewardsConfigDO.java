package com.lawu.chick.repository.domain;

import java.io.Serializable;
import java.util.Date;

public class TaskRewardsConfigDO implements Serializable {
    /**
     *
     * 主键
     * task_rewards_config.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 生效时间
     * task_rewards_config.effective_time
     *
     * @mbg.generated
     */
    private Date effectiveTime;

    /**
     *
     * 1--关注公众号，2--邀请好友
     * task_rewards_config.type
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     *
     * 0--禁用，1--启用
     * task_rewards_config.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 更新时间
     * task_rewards_config.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * task_rewards_config.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * 奖励配置信息json
     * task_rewards_config.rewards_config
     *
     * @mbg.generated
     */
    private String rewardsConfig;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_rewards_config.id
     *
     * @return the value of task_rewards_config.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_rewards_config.id
     *
     * @param id the value for task_rewards_config.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_rewards_config.effective_time
     *
     * @return the value of task_rewards_config.effective_time
     *
     * @mbg.generated
     */
    public Date getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_rewards_config.effective_time
     *
     * @param effectiveTime the value for task_rewards_config.effective_time
     *
     * @mbg.generated
     */
    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_rewards_config.type
     *
     * @return the value of task_rewards_config.type
     *
     * @mbg.generated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_rewards_config.type
     *
     * @param type the value for task_rewards_config.type
     *
     * @mbg.generated
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_rewards_config.status
     *
     * @return the value of task_rewards_config.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_rewards_config.status
     *
     * @param status the value for task_rewards_config.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_rewards_config.gmt_modified
     *
     * @return the value of task_rewards_config.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_rewards_config.gmt_modified
     *
     * @param gmtModified the value for task_rewards_config.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_rewards_config.gmt_create
     *
     * @return the value of task_rewards_config.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_rewards_config.gmt_create
     *
     * @param gmtCreate the value for task_rewards_config.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_rewards_config.rewards_config
     *
     * @return the value of task_rewards_config.rewards_config
     *
     * @mbg.generated
     */
    public String getRewardsConfig() {
        return rewardsConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_rewards_config.rewards_config
     *
     * @param rewardsConfig the value for task_rewards_config.rewards_config
     *
     * @mbg.generated
     */
    public void setRewardsConfig(String rewardsConfig) {
        this.rewardsConfig = rewardsConfig == null ? null : rewardsConfig.trim();
    }
}