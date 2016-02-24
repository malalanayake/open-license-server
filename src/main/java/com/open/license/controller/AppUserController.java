package com.open.license.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.open.license.model.AppUser;
import com.open.license.repository.AppUserRepository;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author malalanayake
 * @created Nov 8, 2015 7:34:51 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
@Controller
@RequestMapping("/")
public class AppUserController {

	private AppUserRepository repository;

	@Autowired
	public AppUserController(AppUserRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String list(ModelMap model) {
		List<AppUser> appUserList = repository.findAll();
		model.addAttribute("appUserList", appUserList);
		model.addAttribute("appUserNew", new AppUser());
		return "appUser";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String insertData(ModelMap model, @ModelAttribute("appUserNew") @Valid AppUser record,
			BindingResult result) {
		if (!result.hasErrors()) {
			repository.save(record);
		}
		return list(model);
	}
}
