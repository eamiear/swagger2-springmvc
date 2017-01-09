package com.gosuncn.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@Api(value="/testController", description="Operations about test")
public class TestController {

	@RequestMapping("/getString")
	@ApiOperation(value="get String", notes="Returns a pet when ID < 10. ID > 10 or nonintegers will simulate API error conditions", authorizations={@io.swagger.annotations.Authorization("api_key"), @io.swagger.annotations.Authorization(value="petstore_auth", scopes={@io.swagger.annotations.AuthorizationScope(scope="write:pets", description=""), @io.swagger.annotations.AuthorizationScope(scope="read:pets", description="")})})
	@ApiResponses({@io.swagger.annotations.ApiResponse(code=400, message="Invalid ID supplied"), @io.swagger.annotations.ApiResponse(code=404, message="Pet not found")})
	public @ResponseBody String getString(){
		return "3545";
	}
}
