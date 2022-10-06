package com.mn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mn.util.PdfExport;

@Controller
public class MyController {
	
	@GetMapping("/pdf")
	public PdfExport getPdf() {
		return new PdfExport();
		
	}
}
