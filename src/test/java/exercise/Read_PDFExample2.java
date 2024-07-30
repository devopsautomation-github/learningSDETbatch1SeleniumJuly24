package exercise;

import java.io.FileInputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_PDFExample2 {
	
	
	@Test
	public void verifyPDFContent() throws Exception {
		
		new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\Desktop\\notebook.pdf");
		
		PDDocument pdfDoc = PDDocument.load(fis);
		
		int pageCount = pdfDoc.getPages().getCount();
		
		System.out.println("Page Count are: " + pageCount);				//pages: 3
		
		//validation 
		
//		Assert.assertEquals(5, pageCount);
		Assert.assertEquals("validation get failed !!", 3, pageCount);
		
		
		System.out.println("==================================================");
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		
		
		
//		pdfText.setStartPage(2);
//		pdfText.setEndPage(3);				//include
		
		
		

		String pdfCompleteContent = pdfText.getText(pdfDoc);
		System.out.println(pdfCompleteContent);
		
		System.out.println("==================================================");
		Assert.assertTrue(pdfCompleteContent.contains("Upholding the Law and Enforcing"));
		
		
		
		
	}

}
