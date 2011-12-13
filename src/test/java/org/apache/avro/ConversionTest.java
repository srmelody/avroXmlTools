package org.apache.avro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import org.apache.avro.compiler.specific.SpecificCompiler;
import org.apache.avro.reflect.ReflectData;
import org.ed_fi._0100rfc.School;
import org.ed_fi._0100rfc.Student;
import org.ed_fi._0100rfc.StudentSchoolAssociation;
import org.junit.Test;

public class ConversionTest {

	@Test
	public void testXSD() throws Exception {

		String fileName = "src/main/resources/AcademicWeek.xsd";

		InputStream is = new FileInputStream(fileName);
		XsdConverter c = new XsdConverter();
		c.convert(is);
	}

	@Test
	public void generate() throws IOException {

		// Template directory is configurable - record.vm in templates is what
		// is being used.

		SpecificCompiler.compileSchema(new File(
				"src/main/resources/avpr/AcademicWeek.avpr"), new File(
				"src/main/resources/avro/generated/"));
	}

	@Test
	public void generateFromJaxb() throws Exception {

		Class klass = Student.class;
		writeToFile(ReflectData.get().getSchema(klass), "student_body.avpr");
		writeToFile(ReflectData.get().getSchema(School.class), "school_body.avpr");
		writeToFile(ReflectData.get().getSchema(StudentSchoolAssociation.class), "studentSchoolAssociation_body.avpr");

	}

	private void writeToFile(Schema schema, String filename ) throws Exception {
		PrintWriter writer = new PrintWriter( "src/main/resources/avro/generated/" + filename );
		String s = schema.toString();
		writer.println( s );
		writer.close();
		
	}

}