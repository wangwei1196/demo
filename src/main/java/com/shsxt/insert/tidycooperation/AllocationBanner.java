package com.shsxt.insert.tidycooperation;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class AllocationBanner {

    // banner id
    private Integer bannerId;
    //banner名称
    private String name;
    //开始时间
    private String startTime;
    //结束时间
    private String endTime;

    // db转换
    private Date startTimeDb;

    private Date endTimeDb;
    // 新增banner时OSS返回的地址或者编辑banner时图片未做改动保留的链接地址
    private String img;
    //banner图片
    private MultipartFile file;
    //用户输入的banner链接地址
    private String url;
    // 活动id
    private Integer actId;
    // 创建时间
    private Date createDatetime;
    // 修改时间
    private Date modifyDatetime;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getModifyDatetime() {
        return modifyDatetime;
    }

    public void setModifyDatetime(Date modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    public Date getStartTimeDb() {
        return startTimeDb;
    }

    public void setStartTimeDb(Date startTimeDb) {
        this.startTimeDb = startTimeDb;
    }

    public Date getEndTimeDb() {
        return endTimeDb;
    }

    public void setEndTimeDb(Date endTimeDb) {
        this.endTimeDb = endTimeDb;
    }
}
