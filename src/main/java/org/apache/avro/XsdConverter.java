package org.apache.avro;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.stream.StreamSource;

import org.apache.avro.Schema.Field;
import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaCollection;
import org.apache.ws.commons.schema.XmlSchemaComplexContentExtension;
import org.apache.ws.commons.schema.XmlSchemaComplexType;
import org.apache.ws.commons.schema.XmlSchemaContent;
import org.apache.ws.commons.schema.XmlSchemaContentModel;
import org.apache.ws.commons.schema.XmlSchemaElement;
import org.apache.ws.commons.schema.XmlSchemaObject;
import org.apache.ws.commons.schema.XmlSchemaObjectCollection;
import org.apache.ws.commons.schema.XmlSchemaObjectTable;
import org.apache.ws.commons.schema.XmlSchemaParticle;
import org.apache.ws.commons.schema.XmlSchemaSequence;
import org.apache.ws.commons.schema.XmlSchemaSimpleType;
import org.apache.ws.commons.schema.XmlSchemaType;
import org.apache.ws.commons.schema.utils.NamespacePrefixList;

public class XsdConverter {

	private Map<String, Schema> map = new HashMap<String, Schema>();
	
	
	public void convert(InputStream is) {

		XmlSchemaCollection schemaCol = new XmlSchemaCollection();
		XmlSchema schema = schemaCol.read(new StreamSource(is), null);
		XmlSchemaObjectTable elems = schema.getElements();
		XmlSchemaObjectCollection items = schema.getItems();
		for (int n = 0; n < items.getCount(); n++) {

			XmlSchemaObject i = items.getItem(n);
			if (i instanceof XmlSchemaComplexType) {
				handleComplexType((XmlSchemaComplexType) i);
			}
			System.out.println(i);

		}
		NamespacePrefixList namespace = schema.getNamespaceContext();
		String[] ns = namespace.getDeclaredPrefixes();
		for (String ns1 : ns) {
			String o = namespace.getPrefix(ns1);
		}
		XmlSchemaType schemaType = schema.getTypeByName("student");
		XmlSchemaElement elem = schema.getElementByName("student");

		//System.out.println(schema);
		System.out.println( map );
	}

	private void handleComplexType(XmlSchemaComplexType i) {
		// TODO Auto-generated method stub
		String name = i.getName();
		System.out.println( name );
		XmlSchemaParticle part = i.getParticle();
		XmlSchemaContentModel model = i.getContentModel();
		if ( model != null ) {
		
		XmlSchemaContent ext = model.getContent();

		if (ext instanceof XmlSchemaComplexContentExtension) {
			XmlSchemaComplexContentExtension ext2 = (XmlSchemaComplexContentExtension) ext;
			resolveLater( i, ext );
			XmlSchemaParticle part2 = ext2.getParticle();
			if ( part2 instanceof XmlSchemaSequence ) {
				XmlSchemaSequence seq = (XmlSchemaSequence) part2;
				handleSequence( name, seq );
				
			}
			//System.out.println(part2);
		}
		}
	}

	private void handleSequence(String name, XmlSchemaSequence seq) {
	
		XmlSchemaObjectCollection c = seq.getItems();
		List<Field> fields = new ArrayList();
		Schema schema = Schema.createRecord(name, null, "edfi", false );
		for ( int i = 0; i < c.getCount(); i++ ) {
			
			XmlSchemaObject obj = c.getItem( i );
			XmlSchemaElement elem = (XmlSchemaElement) obj;
			String type = determineType ( elem );
			//schema.addProp(elem.getName(), type );
		
			Schema schemaField = Schema.create(Schema.Type.STRING  );
			
			Field field = new Field(elem.getName(), schemaField, null, null );
			fields.add( field );
			System.out.println( obj );
			
		}
		schema.setFields(fields);
		System.out.println( "Schema: " + schema );
		map.put( schema.getName(), schema );
//Schema schema = Schema.createRecord(fields);
	}

	private String determineType(XmlSchemaElement elem) {
		String type = "string";
		XmlSchemaType sType = elem.getSchemaType();
		if ( sType instanceof XmlSchemaSimpleType ) {
			XmlSchemaSimpleType simple = (XmlSchemaSimpleType) sType;
			String name = simple.getName();
			type = simple.getName();
		}
		else if ( sType instanceof XmlSchemaComplexType ) {
			XmlSchemaComplexType cType = (XmlSchemaComplexType) sType;
			String name = cType.getName();
			if ( name.equals( "ReferenceType" ) ) {
				// Use the element name instead.
				type = elem.getName();
				int n = type.indexOf( "Reference" );
				type = type.substring( 0, n );
			}
			System.out.println( "Complex: " + name );
		}
		if ( elem.getElementType() != null ) {
			type = elem.getElementType().toString();
		}
		return type;
	}

	/**
	 * Resolve extensions later 
	 * @param i
	 * @param ext
	 */
	private void resolveLater(XmlSchemaComplexType i, XmlSchemaContent ext) {
		// TODO Auto-generated method stub
		
	}

}
