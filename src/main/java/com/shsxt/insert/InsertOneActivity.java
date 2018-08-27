package com.shsxt.insert;

/**
 * Created by tidy on 2018/4/14.
 */
public class InsertOneActivity {
    //活动名称
    private String name;
    //活动描述
    private String memo;
    //活动类型
    private Integer type;
    //业务类型(多选)，前台是写死的,格式为"洗涤,鲜花"
    private String code;
    //策划人
    private Integer userId;
    //负责人
    private Integer operatorId;
    //平台渠道(多选) 格式为"1,2"
    private String channel;
    //开始时间 格式为"2018-04-13 14:19:43"
    private String startTime;
    //结束时间 格式为"2018-04-13 14:19:43"
    private String endTime;
    //城市的cid，格式为"35,36"
    private String city;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsertOneActivity that = (InsertOneActivity) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (operatorId != null ? !operatorId.equals(that.operatorId) : that.operatorId != null) return false;
        if (channel != null ? !channel.equals(that.channel) : that.channel != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        return city != null ? city.equals(that.city) : that.city == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (operatorId != null ? operatorId.hashCode() : 0);
        result = 31 * result + (channel != null ? channel.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
