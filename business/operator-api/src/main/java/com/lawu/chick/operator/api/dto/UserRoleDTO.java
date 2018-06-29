package com.lawu.chick.operator.api.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author zhangyong
 * @date 2017/4/19.
 */
public class UserRoleDTO {

    @ApiModelProperty(value = "角色键值")
    private String roleKey;

    @ApiModelProperty(value = "权限键值")
    private List<String> permissionsKey;

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public List<String> getPermissionsKey() {
        return permissionsKey;
    }

    public void setPermissionsKey(List<String> permissionsKey) {
        this.permissionsKey = permissionsKey;
    }
}
