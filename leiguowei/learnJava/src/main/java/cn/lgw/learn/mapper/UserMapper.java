package cn.lgw.learn.mapper;

import cn.lgw.learn.domain.UserDO;
import cn.lgw.learn.domain.condition.UserCondition;
import java.util.List;

import cn.lgw.learn.to.resp.GeneralUserTO;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    int countByExample(UserCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    int deleteByExample(UserCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    int insertSelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    List<UserDO> selectByExample(UserCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    UserDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    int updateByExample(@Param("record") UserDO record, @Param("example") UserCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Mar 22 17:52:09 CST 2018
     */
    int updateByPrimaryKey(UserDO record);
}