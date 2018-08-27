package com.shsxt.crm.dto;

import com.shsxt.crm.po.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lp on 2018/1/11.
 */
public class UserDto extends User implements Serializable{


    private static final long serialVersionUID = -3915154918781883146L;
    private String roleName;
    private List<Integer> roleIds=new ArrayList<Integer>();

    private String roleIdStr;

    public String getRoleIdStr() {
        return roleIdStr;
    }

    public void setRoleIdStr(String roleIdStr) {
        this.roleIdStr = roleIdStr;
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
