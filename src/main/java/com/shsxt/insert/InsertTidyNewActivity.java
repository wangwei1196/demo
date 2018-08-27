package com.shsxt.insert;

/**
 * Created by tidy on 2018/4/4.
 */
public class InsertTidyNewActivity {
  /*  //步骤一，活动名称
    private String name;
    //步骤一，活动描述
    private String memo;
    //步骤一,活动类型
    private Integer typeId;
    //步骤一,平台渠道(channel表)
    private String channelName;
    //步骤一,业务类型
    private Integer code;
    //步骤一,策划人
    private Integer userId;
    //步骤一,负责人
    private Integer operatorId;
    //步骤一,有效时间
    private Integer activeTime;
    //步骤一,开始时间
    private Date startTime;
    //步骤一,结束时间
    private Date endTime;
    //步骤一,“添加平台渠道”按钮点击传1，没有点击传0
//    private Integer onClick;
    //步骤一，确定是否添加平台渠道   不添加时传0; 当额外添加一个渠道时传1;额外添加2个渠道时传2;依次类推
    private Integer num;
    //步骤一，当额外添加渠道时，json数据，格式类似于[{"name":"美团";"sameTime":"1";},{},...]   sameTime(相同时间)传1代表:时间相同;传0代表:时间不同

    private String plats;
    //步骤二:模板设置*/

    private String name;
    private String memo;
    private Integer type;
    private String groupType;
    private Integer operatorId;
    private Integer userId;
    private String startTime;
    private String endTime;
    private String channel;
    private Integer templeteId;
    private String discountId;
    private String ruleInfo;
    private Integer isCoupon;
    private Integer isTibean;
    private Integer orderTotal;
    private Integer userTotal;
    private Integer targetUser;
    private Integer targetOrder;
    private float targetAmount;
    private String targetMemo;
    private String shareTitle;
    private String shareContent;
    private String shareImg;

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

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getTempleteId() {
        return templeteId;
    }

    public void setTempleteId(Integer templeteId) {
        this.templeteId = templeteId;
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public String getRuleInfo() {
        return ruleInfo;
    }

    public void setRuleInfo(String ruleInfo) {
        this.ruleInfo = ruleInfo;
    }

    public Integer getIsCoupon() {
        return isCoupon;
    }

    public void setIsCoupon(Integer isCoupon) {
        this.isCoupon = isCoupon;
    }

    public Integer getIsTibean() {
        return isTibean;
    }

    public void setIsTibean(Integer isTibean) {
        this.isTibean = isTibean;
    }

    public Integer getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Integer orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Integer getUserTotal() {
        return userTotal;
    }

    public void setUserTotal(Integer userTotal) {
        this.userTotal = userTotal;
    }

    public Integer getTargetUser() {
        return targetUser;
    }

    public void setTargetUser(Integer targetUser) {
        this.targetUser = targetUser;
    }

    public Integer getTargetOrder() {
        return targetOrder;
    }

    public void setTargetOrder(Integer targetOrder) {
        this.targetOrder = targetOrder;
    }

    public float getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(float targetAmount) {
        this.targetAmount = targetAmount;
    }

    public String getTargetMemo() {
        return targetMemo;
    }

    public void setTargetMemo(String targetMemo) {
        this.targetMemo = targetMemo;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareContent() {
        return shareContent;
    }

    public void setShareContent(String shareContent) {
        this.shareContent = shareContent;
    }

    public String getShareImg() {
        return shareImg;
    }

    public void setShareImg(String shareImg) {
        this.shareImg = shareImg;
    }
}
