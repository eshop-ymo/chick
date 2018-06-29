package com.lawu.chick.repository.mapper;

import com.lawu.chick.repository.domain.SignInRuleDO;
import com.lawu.chick.repository.domain.SignInRuleDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SignInRuleDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    long countByExample(SignInRuleDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    int deleteByExample(SignInRuleDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    int insert(SignInRuleDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    int insertSelective(SignInRuleDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    List<SignInRuleDO> selectByExampleWithRowbounds(SignInRuleDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    List<SignInRuleDO> selectByExample(SignInRuleDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    SignInRuleDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SignInRuleDO record, @Param("example") SignInRuleDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SignInRuleDO record, @Param("example") SignInRuleDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SignInRuleDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign_in_rule
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SignInRuleDO record);
}