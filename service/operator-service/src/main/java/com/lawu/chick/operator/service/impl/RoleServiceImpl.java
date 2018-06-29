package com.lawu.chick.operator.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lawu.chick.operator.repository.domain.RoleDO;
import com.lawu.chick.operator.repository.domain.RoleDOExample;
import com.lawu.chick.operator.repository.mapper.RoleDOMapper;
import com.lawu.chick.operator.service.RoleService;
import com.lawu.chick.operator.service.bo.RoleBO;
import com.lawu.chick.operator.service.converter.RoleConverter;
import com.lawu.chick.operator.service.param.RoleInfoParam;
import com.lawu.chick.operator.service.param.RoleParam;
import com.lawu.framework.core.page.Page;

/**
 * @author zhangyong
 * @date 2017/4/21.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDOMapper roleDOMapper;

    @Override
    public Page<RoleBO> findroleList(RoleParam param) {

        RoleDOExample example = new RoleDOExample();
        example.setOrderByClause("id desc");
        RowBounds bounds = new RowBounds(param.getOffset(), param.getPageSize());

        int total = (int) roleDOMapper.countByExample(example);

        List<RoleDO> roleDOList = roleDOMapper.selectByExampleWithRowbounds(example, bounds);
        if (roleDOList.isEmpty()) {
            return null;
        }
        List<RoleBO> list = new ArrayList<>();
        for (RoleDO roleDO : roleDOList) {
            RoleBO roleBO = RoleConverter.cover(roleDO);
            list.add(roleBO);
        }
        Page<RoleBO> page = new Page<>();
        page.setCurrentPage(param.getCurrentPage());
        page.setTotalCount(total);
        page.setRecords(list);
        return page;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer addRole(RoleInfoParam param) {
        RoleDO roleDO = new RoleDO();
        roleDO.setRoleKey(param.getRoleKey());
        roleDO.setRoleName(param.getRoleName());
        roleDO.setGmtCreate(new Date());
        roleDO.setGmtModified(new Date());
        roleDOMapper.insert(roleDO);
        return roleDO.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer updateRole(Integer id, RoleInfoParam param) {
        RoleDO roleDO = new RoleDO();
        roleDO.setRoleName(param.getRoleName());
        roleDO.setRoleKey(param.getRoleKey());
        roleDO.setId(id);
        roleDO.setGmtModified(new Date());
        Integer row = roleDOMapper.updateByPrimaryKeySelective(roleDO);
        return row;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delRole(Integer id) {
        roleDOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<RoleBO> findroleListAll() {
        RoleDOExample example = new RoleDOExample();
        example.setOrderByClause("id desc");
        List<RoleDO> roleDOList = roleDOMapper.selectByExample(example);
        if (roleDOList.isEmpty()) {
            return null;
        }
        List<RoleBO> list = new ArrayList<>();
        for (RoleDO roleDO : roleDOList) {
            RoleBO roleBO = RoleConverter.cover(roleDO);
            list.add(roleBO);
        }
        return list;
    }

    @Override
    public RoleBO findRoleById(Integer id) {
        RoleDO roleDO = roleDOMapper.selectByPrimaryKey(id);
        RoleBO roleBO = RoleConverter.cover(roleDO);
        return roleBO;
    }


}
