package exercise;

import java.io.FileInputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.junit.Test;

public class Read_PDFExample {
	
	
	@Test
	public void verifyPDFContent() throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\Desktop\\notebook.pdf");
		
		PDDocument pdfDoc = PDDocument.load(fis);
		
		int pageCount = pdfDoc.getPages().getCount();
		
		System.out.println("Page Count are: " + pageCount);				//pages: 3
		
		//validation 
		
//		Assert.assertEquals(5, pageCount);
		Assert.assertEquals("validation get failed !!", 3, pageCount);
		
		
		System.out.println("==================================================");
		
		
		PDFTextStripper pdfText = new PDFTextStripper();

		String pdfCompleteContent = pdfText.getText(pdfDoc);
		System.out.println(pdfCompleteContent);
		
		System.out.println("==================================================");
//		String messgae = "welcome Lavanya";
		
		System.out.println("vakidation of Message: " + pdfCompleteContent.contains("The introduction of Public Interest Litigation (PIL)"));
		
		
		Assert.assertTrue(pdfCompleteContent.contains("The introduction of Public Interest Litigation (PIL)"));
		
		
		
		
	}

}
