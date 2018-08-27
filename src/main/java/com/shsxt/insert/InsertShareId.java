package com.shsxt.insert;

import java.util.Date;

/**
 * Created by tidy on 2018/4/19.
 */
public class InsertShareId {
    private Integer id;
    private Integer shareId;
    private Date modifyDatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShareId() {
        return shareId;
    }

    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    public Date getModifyDatetime() {
        return modifyDatetime;
    }

    public void setModifyDatetime(Date modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }
}
