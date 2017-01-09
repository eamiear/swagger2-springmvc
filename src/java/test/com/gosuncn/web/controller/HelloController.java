package com.gosuncn.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
@Api(value="/helloController", description="Operations about Hello")
public class HelloController {

	@ResponseBody
	@RequestMapping(value = "/index1.html", method = RequestMethod.GET)
	@ApiOperation(value="get Index", notes="Returns a String")
	@ApiResponses({@io.swagger.annotations.ApiResponse(code=400, message="Invalid ID supplied"), @io.swagger.annotations.ApiResponse(code=404, message="Pet not found")})
	public String index2(){
		return "Index";
	}
	
	/**
	 * 首页面板
	 * @return
	 */
	@RequestMapping(value = "/index.html", method = RequestMethod.GET)
	@ApiOperation(value="Index", notes="Returns a Page")
	public ModelAndView index(){
		return new ModelAndView("home/index");
	}
	
	@RequestMapping(value = "/getPage.action", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="page", notes="Returns a Page Message")
	public String getPage(){
		return "page";
	}
}
