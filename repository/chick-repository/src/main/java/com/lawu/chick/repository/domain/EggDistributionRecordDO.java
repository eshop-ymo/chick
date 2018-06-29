package com.lawu.chick.repository.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EggDistributionRecordDO implements Serializable {
    /**
     *
     * 主键
     * egg_distribution_record.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * 分配的小鸡数量
     * egg_distribution_record.chicks
     *
     * @mbg.generated
     */
    private Long chicks;

    /**
     *
     * 已分配的小鸡数量
     * egg_distribution_record.allocated_chicks
     *
     * @mbg.generated
     */
    private Long allocatedChicks;

    /**
     *
     * 预期分配鸡蛋数量
     * egg_distribution_record.expected_allocations
     *
     * @mbg.generated
     */
    private BigDecimal expectedAllocations;

    /**
     *
     * 实际分配鸡蛋数量
     * egg_distribution_record.real_allocations
     *
     * @mbg.generated
     */
    private BigDecimal realAllocations;

    /**
     *
     * 发放的小鸡数量
     * egg_distribution_record.grant_chicks
     *
     * @mbg.generated
     */
    private Long grantChicks;

    /**
     *
     * 发放鸡蛋数量
     * egg_distribution_record.grants
     *
     * @mbg.generated
     */
    private BigDecimal grants;

    /**
     *
     * 状态(1-分配中|2-已分配|3-已发放)
     * egg_distribution_record.status
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     *
     * 分配完成时间
     * egg_distribution_record.gmt_allocations_complete
     *
     * @mbg.generated
     */
    private Date gmtAllocationsComplete;

    /**
     *
     * 发放完成时间
     * egg_distribution_record.gmt_grant_complete
     *
     * @mbg.generated
     */
    private Date gmtGrantComplete;

    /**
     *
     * 更新时间
     * egg_distribution_record.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * 创建时间
     * egg_distribution_record.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.id
     *
     * @return the value of egg_distribution_record.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.id
     *
     * @param id the value for egg_distribution_record.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.chicks
     *
     * @return the value of egg_distribution_record.chicks
     *
     * @mbg.generated
     */
    public Long getChicks() {
        return chicks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.chicks
     *
     * @param chicks the value for egg_distribution_record.chicks
     *
     * @mbg.generated
     */
    public void setChicks(Long chicks) {
        this.chicks = chicks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.allocated_chicks
     *
     * @return the value of egg_distribution_record.allocated_chicks
     *
     * @mbg.generated
     */
    public Long getAllocatedChicks() {
        return allocatedChicks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.allocated_chicks
     *
     * @param allocatedChicks the value for egg_distribution_record.allocated_chicks
     *
     * @mbg.generated
     */
    public void setAllocatedChicks(Long allocatedChicks) {
        this.allocatedChicks = allocatedChicks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.expected_allocations
     *
     * @return the value of egg_distribution_record.expected_allocations
     *
     * @mbg.generated
     */
    public BigDecimal getExpectedAllocations() {
        return expectedAllocations;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.expected_allocations
     *
     * @param expectedAllocations the value for egg_distribution_record.expected_allocations
     *
     * @mbg.generated
     */
    public void setExpectedAllocations(BigDecimal expectedAllocations) {
        this.expectedAllocations = expectedAllocations;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.real_allocations
     *
     * @return the value of egg_distribution_record.real_allocations
     *
     * @mbg.generated
     */
    public BigDecimal getRealAllocations() {
        return realAllocations;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.real_allocations
     *
     * @param realAllocations the value for egg_distribution_record.real_allocations
     *
     * @mbg.generated
     */
    public void setRealAllocations(BigDecimal realAllocations) {
        this.realAllocations = realAllocations;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.grant_chicks
     *
     * @return the value of egg_distribution_record.grant_chicks
     *
     * @mbg.generated
     */
    public Long getGrantChicks() {
        return grantChicks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.grant_chicks
     *
     * @param grantChicks the value for egg_distribution_record.grant_chicks
     *
     * @mbg.generated
     */
    public void setGrantChicks(Long grantChicks) {
        this.grantChicks = grantChicks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.grants
     *
     * @return the value of egg_distribution_record.grants
     *
     * @mbg.generated
     */
    public BigDecimal getGrants() {
        return grants;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.grants
     *
     * @param grants the value for egg_distribution_record.grants
     *
     * @mbg.generated
     */
    public void setGrants(BigDecimal grants) {
        this.grants = grants;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.status
     *
     * @return the value of egg_distribution_record.status
     *
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.status
     *
     * @param status the value for egg_distribution_record.status
     *
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.gmt_allocations_complete
     *
     * @return the value of egg_distribution_record.gmt_allocations_complete
     *
     * @mbg.generated
     */
    public Date getGmtAllocationsComplete() {
        return gmtAllocationsComplete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.gmt_allocations_complete
     *
     * @param gmtAllocationsComplete the value for egg_distribution_record.gmt_allocations_complete
     *
     * @mbg.generated
     */
    public void setGmtAllocationsComplete(Date gmtAllocationsComplete) {
        this.gmtAllocationsComplete = gmtAllocationsComplete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.gmt_grant_complete
     *
     * @return the value of egg_distribution_record.gmt_grant_complete
     *
     * @mbg.generated
     */
    public Date getGmtGrantComplete() {
        return gmtGrantComplete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.gmt_grant_complete
     *
     * @param gmtGrantComplete the value for egg_distribution_record.gmt_grant_complete
     *
     * @mbg.generated
     */
    public void setGmtGrantComplete(Date gmtGrantComplete) {
        this.gmtGrantComplete = gmtGrantComplete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.gmt_modified
     *
     * @return the value of egg_distribution_record.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.gmt_modified
     *
     * @param gmtModified the value for egg_distribution_record.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column egg_distribution_record.gmt_create
     *
     * @return the value of egg_distribution_record.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column egg_distribution_record.gmt_create
     *
     * @param gmtCreate the value for egg_distribution_record.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}