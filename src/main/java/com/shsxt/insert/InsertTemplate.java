package com.shsxt.insert;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by tidy on 2018/4/19.
 */
public class InsertTemplate {
    //模板名称
    private String name;
    //模板描述
    private String memo;
    //模板的封面图片
    private MultipartFile file;
    //模板是否从列表获取  传0代表从列表中选的   传1，反之
    private Integer isChange;
    //模板的id
    private Integer templateId;
    //模板代码
    private String html;
    //活动链接
//    private String link;
//    //活动id
    private  Integer activityId;
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

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public Integer getIsChange() {
        return isChange;
    }

    public void setIsChange(Integer isChange) {
        this.isChange = isChange;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

//    public String getLink() {
//        return link;
//    }
//
//    public void setLink(String link) {
//        this.link = link;
//    }
//
    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}
