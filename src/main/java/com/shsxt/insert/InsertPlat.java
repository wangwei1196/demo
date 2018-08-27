package com.shsxt.insert;

/**
 * Created by tidy on 2018/4/9.
 */
public class InsertPlat {
    private String channgelName;
    //前台输入，后台原样接收
    private Integer parentId;
    private Integer state;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
