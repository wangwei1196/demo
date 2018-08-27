package com.shsxt.insert;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by tidy on 2018/4/19.
 */
public class InsertTidyShare {
    //分享标题
    private String title;
    //分享描述
    private String memo;
    //分享图片
    private MultipartFile multipartFile;
    //分享链接
    private String link;
    private Integer activityId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}
