package com.lawu.chick.repository.mapper;

import com.lawu.chick.repository.domain.TaskRewardsConfigDO;
import com.lawu.chick.repository.domain.TaskRewardsConfigDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaskRewardsConfigDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    long countByExample(TaskRewardsConfigDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    int deleteByExample(TaskRewardsConfigDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    int insert(TaskRewardsConfigDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    int insertSelective(TaskRewardsConfigDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    List<TaskRewardsConfigDO> selectByExampleWithBLOBsWithRowbounds(TaskRewardsConfigDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    List<TaskRewardsConfigDO> selectByExampleWithBLOBs(TaskRewardsConfigDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    List<TaskRewardsConfigDO> selectByExampleWithRowbounds(TaskRewardsConfigDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    List<TaskRewardsConfigDO> selectByExample(TaskRewardsConfigDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    TaskRewardsConfigDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TaskRewardsConfigDO record, @Param("example") TaskRewardsConfigDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") TaskRewardsConfigDO record, @Param("example") TaskRewardsConfigDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TaskRewardsConfigDO record, @Param("example") TaskRewardsConfigDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TaskRewardsConfigDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(TaskRewardsConfigDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_rewards_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TaskRewardsConfigDO record);
}