package com.gosuncn.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gosuncn.web.bean.UamGroup;

@Controller
@RequestMapping(value = "/group", produces = {"application/json;charset=UTF-8"})
@Api(value = "/group", description = "群组的相关操作")
public class GroupController {
	@RequestMapping(value = "/addGroup", method = RequestMethod.PUT)
    @ApiOperation(notes = "addGroup", httpMethod = "POST", value = "添加一个新的群组")
    @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
	
	@ApiParam(required = true, value = "group data")
    public UamGroup addGroup( @RequestBody UamGroup group) {
        return group;
    }

    @RequestMapping(value = "/getAccessibleGroups", method = RequestMethod.GET)
    @ApiOperation(notes = "getAccessibleGroups", httpMethod = "GET", value = "获取我可以访问的群组的列表")
    public @ResponseBody List<UamGroup> getAccessibleGroups() {
        UamGroup group1 = new UamGroup();
        group1.setGroupId("1");
        group1.setName("testGroup1");

        UamGroup group2 = new UamGroup();
        group2.setGroupId("2");
        group2.setName("testGroup2");

        List<UamGroup> groupList = new LinkedList<UamGroup>();
        groupList.add(group1);
        groupList.add(group2);

        return groupList;
    }
    
    @RequestMapping(value = "/getString.action", method = RequestMethod.GET)
    public @ResponseBody String getString(){
    	return "343";
    }
}
