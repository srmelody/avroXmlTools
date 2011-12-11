package org.apache.avro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.avro.compiler.specific.SpecificCompiler;
import org.junit.Test;

public class ConversionTest {

	@Test
	public void testXSD() throws Exception {

		String fileName = "src/main/resources/AcademicWeek.xsd";

		InputStream is = new FileInputStream(fileName);
		XsdConverter c = new XsdConverter();
		c.convert( is );
		}

	@Test
	public void generate() throws IOException {
		
		// Template directory is configurable - record.vm in templates is what is being used.
		
		SpecificCompiler.compileSchema(new File("src/main/resources/avpr/AcademicWeek.avpr"), new File("src/main/resources/avro/generated/"));
	}
}