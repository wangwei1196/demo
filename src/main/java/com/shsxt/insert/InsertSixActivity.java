package com.shsxt.insert;

/**
 * Created by tidy on 2018/4/18.
 */
public class InsertSixActivity {
    //前台传json数据，用户可以多选，且不能重复，格式为[{"name":"1;2","appStatus":"1","title":"标题","memo":"内容"}]
    private String list;
    private Integer activityId;
    //操作人
    private Integer userId;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
