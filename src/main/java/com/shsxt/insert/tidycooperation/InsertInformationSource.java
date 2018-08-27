package com.shsxt.insert.tidycooperation;

public class InsertInformationSource {

    //订单来源类型
    private String orderSource;
    //订单来源类型id
    private Integer orderSourceId;
    //归属部门
    private Integer departmentId;
    //客户名称
    private String customerName;
    //信用id
    private String authId;
    //联系人
    private String contactName;
    //联系电话
    private String contactMoblie;
    //所在城市
    private String cityName;
    //所在城市id
    private Integer cityId;
    //地址
    private String address;
    //用户id
    private Integer userId;
    //业务员
    private Integer saleUser;
    //业务员占比
    private Integer salePercent;
    //辅助业务员
    private Integer otherSale;
    //辅助业务员占比
    private Integer otherPercent;

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

    public Integer getOrderSourceId() {
        return orderSourceId;
    }

    public void setOrderSourceId(Integer orderSourceId) {
        this.orderSourceId = orderSourceId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getContactName() {
        return contactName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getSaleUser() {
        return saleUser;
    }

    public void setSaleUser(Integer saleUser) {
        this.saleUser = saleUser;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMoblie() {
        return contactMoblie;
    }

    public void setContactMoblie(String contactMoblie) {
        this.contactMoblie = contactMoblie;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSalePercent() {
        return salePercent;
    }

    public void setSalePercent(Integer salePercent) {
        this.salePercent = salePercent;
    }

    public Integer getOtherPercent() {
        return otherPercent;
    }

    public void setOtherPercent(Integer otherPercent) {
        this.otherPercent = otherPercent;
    }

    public Integer getOtherSale() {
        return otherSale;
    }

    public void setOtherSale(Integer otherSale) {
        this.otherSale = otherSale;
    }
}
