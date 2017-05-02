package ch.fdehedin.patterns.factorymethod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XMLLogger implements Logger {

	public void log(String message) {

		PrintStream outputStream = null;
		XMLStreamWriter out = null;
		try {
			outputStream = new PrintStream(System.out);
			System.setOut(outputStream);

			out = XMLOutputFactory.newInstance().createXMLStreamWriter(new OutputStreamWriter(outputStream, "utf-8"));

			out.writeStartDocument();
			out.writeStartElement("logFile");

			out.writeStartElement("logMessage");
			out.writeCharacters(message);
			out.writeEndElement();

			out.writeEndElement();
			out.writeEndDocument();

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				out.close();
				outputStream.close();
			} catch (XMLStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}