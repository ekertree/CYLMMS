package com.cylmms.mapper;

import com.cylmms.pojo.Group;
import com.cylmms.pojo.GroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    long countByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    int deleteByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    int insert(Group row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    int insertSelective(Group row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    List<Group> selectByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    Group selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") Group row, @Param("example") GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") Group row, @Param("example") GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Group row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table group
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Group row);
}