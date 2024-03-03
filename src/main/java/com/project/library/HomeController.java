package com.project.library;

import java.sql.Connection;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import javax.sql.DataSource;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Inject
	DataSource ds;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() throws	Exception{
		Connection conn = ds.getConnection();
		System.out.println("DB 연결 성공 : "+conn);
		
		return "index";
	}
	
}
