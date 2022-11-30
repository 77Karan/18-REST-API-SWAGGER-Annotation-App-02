package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
@RestController
public class MyRestController 
{
	
	@ApiOperation(value="This operation is used to gnerate Welcome Messge",response=String.class)
	@GetMapping(value="/welcome/{name}")
	public String welcomeRest(@ApiParam("Name to wish")@PathVariable String name)
	{
		String msg =name+ ">> Welcome to My RestController";
		return msg;
	}

}
