package com.shirts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Shirts
{
@RequestMapping(value="/",method=RequestMethod.GET)
public String landingpage()
{
	return "Login";
}
}
