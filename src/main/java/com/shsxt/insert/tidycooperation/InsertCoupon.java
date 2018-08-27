package com.shsxt.insert.tidycooperation;

import java.util.Date;

public class InsertCoupon {
    //优惠券id
    private Integer couponId;
    //优惠券名称
    private String name;
    //优惠券描述
    private String memo;
    //使用平台渠道
    private Integer channelId;
    //活动id
    private Integer actId;
    //1:激活后延期；2：固定时间段
    private Integer type;
    //激活后延期多少天可用
    private Integer day;
    //有效期(开始时间)
    private String startTime;
    //失效期(结束时间)
    private String endTime;
    //有效期(开始时间)DB
    private Date startTime0;
    //失效期(结束时间)DB
    private Date endTime0;
    //创建时间
    private Date createDateTime;
    //限领张数
    private Integer limitNum;
    //发放总张数
    private Integer limitNumAll;
    //限领张数
    private Integer sendNum;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Date getCreateDateTime() {

        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public Integer getLimitNumAll() {
        return limitNumAll;
    }

    public void setLimitNumAll(Integer limitNumAll) {
        this.limitNumAll = limitNumAll;
    }

    public Integer getSendNum() {
        return sendNum;
    }

    public void setSendNum(Integer sendNum) {
        this.sendNum = sendNum;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public Date getStartTime0() {
        return startTime0;
    }

    public void setStartTime0(Date startTime0) {
        this.startTime0 = startTime0;
    }

    public Date getEndTime0() {
        return endTime0;
    }

    public void setEndTime0(Date endTime0) {
        this.endTime0 = endTime0;
    }
}
