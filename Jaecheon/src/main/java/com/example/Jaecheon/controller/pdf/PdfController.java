package com.example.Jaecheon.controller.pdf;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Jaecheon.service.pdf.PdfService;

@Controller
@RequestMapping("pdf/*") //공통적인 url mapping
public class PdfController {

	@Inject
	PdfService pdfService;
	
	@RequestMapping("list.do")//세부적인 url mapping
	public ModelAndView list() throws Exception {
		//pdf파일 생성
		String result = pdfService.createPdf();
		//화면 이동
		return new ModelAndView("pdf/result","message",result);
	}
	
}
