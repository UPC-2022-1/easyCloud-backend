package com.easycloud.easycloudpricingsystem.controller;

import com.easycloud.easycloudpricingsystem.service.abs.CloudServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serverless")
public class ServerLessController {
	@Autowired
	private CloudServiceService cloudService;
}
