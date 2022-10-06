package com.mn.util;

import java.awt.Color;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;

public class PdfExport extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model,
			Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		response.addHeader("Content-Disposition", "attachment;filename=uom.pdf");
		
		// create element
		Font font = new Font(Font.TIMES_ROMAN, 22 ,Font.BOLD ,Color.BLUE);
		Paragraph paragraph = new Paragraph("For more detail search itext lowagie tutorial { https://www.tutorialspoint.com/itext/index.htm}",font);
		paragraph.setSpacingAfter(10.0f);
		paragraph.setAlignment(Element.ALIGN_CENTER);
		// add element to document
		document.add(paragraph);
		
		// create table that one row shold contain n columns
		PdfPTable table = new PdfPTable(4);
		table.addCell("Id");
		table.addCell("EmpName");
		table.addCell("EmpSal");
		table.addCell("EmpAdd");
		document.add(table);
	}

}
