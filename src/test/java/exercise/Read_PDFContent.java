package exercise;

import java.io.FileInputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Read_PDFContent {

	public static void main(String[] args) throws Exception {
		
		//C:\Users\91995\Desktop\notebook.pdf
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\Desktop\\notebook.pdf");
		
		
		PDDocument pdfDoc = PDDocument.load(fis);
		
		
		int pageCount = pdfDoc.getPages().getCount();
		

		
		System.out.println("No of pages are: " + pageCount);
		
		
		
		
		PDFTextStripper pdfTest = new PDFTextStripper();
		
		String PDFContent = pdfTest.getText(pdfDoc);
		
		
		System.out.println(PDFContent);
		
	}

}
