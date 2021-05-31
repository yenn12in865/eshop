package com.eshop.we.user.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户账户
 * </p>
 *
 * @author anonymity
 * @since 2018-07-04
 */
@TableName("account")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收入
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 收入
     */
    private Integer income;
    /**
     * 支出
     */
    private Integer expenses;
    /**
     * 余额
     */
    private Integer balance;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getExpenses() {
        return expenses;
    }

    public void setExpenses(Integer expenses) {
        this.expenses = expenses;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
        "id=" + id +
        ", userId=" + userId +
        ", income=" + income +
        ", expenses=" + expenses +
        ", balance=" + balance +
        "}";
    }
}
