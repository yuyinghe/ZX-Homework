package cn.lgw.learn.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDO {
    /**
     * 自增ID，无实际意义
     */
    private Long id;

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户性别。0->男；1->女；
     */
    private Byte sex;

    /**
     * 用户学院
     */
    private Integer school;

    /**
     * 用户年级
     */
    private Integer grade;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户状态。0：正常。1：无法借阅。2：已注销
     */
    private Byte status;

    /**
     * 用户当前借阅数量
     */
    private Integer borrowAmount;

    /**
     * 用户可借书籍的最大数量
     */
    private Integer canBorrowAmount;
}