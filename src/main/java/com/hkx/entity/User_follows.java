package com.hkx.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户关注表
 */
public class User_follows implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer followId;

    private Date createTime;

    private String followName;

    private static final long serialVersionUID = 1L;

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

    public Integer getFollowId() {
        return followId;
    }

    public void setFollowId(Integer followId) {
        this.followId = followId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFollowName() {
        return followName;
    }

    public void setFollowName(String followName) {
        this.followName = followName == null ? null : followName.trim();
    }
}