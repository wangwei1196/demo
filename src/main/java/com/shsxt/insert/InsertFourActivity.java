package com.shsxt.insert;

/**
 * Created by tidy on 2018/4/15.
 */
public class InsertFourActivity {
    //商品组，全场”0” 鲜花”1” 绿植”2” 洗护”3” 当选择商品集为第一级时且为单个时，格式为”1” 当选择其他级别时,格式为”id-tableName,id-tableName” 其中id为商品集的id，tableName为商品集存在的表
    private String goodsGroup;
    //城市 格式为"35,36"
    private String city;
    //活动的id;
    private Integer activityId;

    public String getGoodsGroup() {
        return goodsGroup;
    }

    public void setGoodsGroup(String goodsGroup) {
        this.goodsGroup = goodsGroup;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}
