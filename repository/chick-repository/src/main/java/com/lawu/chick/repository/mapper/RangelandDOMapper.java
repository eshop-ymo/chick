package com.lawu.chick.repository.mapper;

import com.lawu.chick.repository.domain.RangelandDO;
import com.lawu.chick.repository.domain.RangelandDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RangelandDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    long countByExample(RangelandDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    int deleteByExample(RangelandDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    int insert(RangelandDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    int insertSelective(RangelandDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    List<RangelandDO> selectByExampleWithRowbounds(RangelandDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    List<RangelandDO> selectByExample(RangelandDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    RangelandDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") RangelandDO record, @Param("example") RangelandDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") RangelandDO record, @Param("example") RangelandDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RangelandDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rangeland
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RangelandDO record);
}