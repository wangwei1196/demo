package com.shsxt.insert.tidycooperation;

public class InsertTidyOrderSource {

    //订单来源类型
    private String orderSource;
    //归属部门
    private Integer departmentId;
    //业务类型(1为洗涤2为绿植3为租赁)
    private Integer group;
    //用户id
    private Integer userId;

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
