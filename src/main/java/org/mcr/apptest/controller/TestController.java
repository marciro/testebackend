package org.mcr.apptest.controller;

import org.springframework.stereotype.Controller;

@Controller
@Path("/test")
public class TestController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ModuleDTO> listModules() {
		return service.listModules();
	}
}
