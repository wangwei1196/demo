package com.shsxt.insert;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by tidy on 2018/6/4.
 */
public class InsertTemplateForTwo {
    //模板名称
    private String name;
    //模板描述
    private String memo;
    //模板的封面图片
    private MultipartFile file;
    //模板代码
    private String html;

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

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }
}
