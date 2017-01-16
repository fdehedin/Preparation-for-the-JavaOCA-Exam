package ch.fdehedin.patterns.decorator.inputstream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Logger;

import org.junit.Test;

public class LowerCaseInputStreamTester {

	private static final Logger LOGGER = Logger.getLogger(LowerCaseInputStreamTester.class.getSimpleName());

	@Test
	public void stream() {
		int c;
		InputStream in = null;
		InputStream in2 = null;
		try {
			in = new FileInputStream("test.txt");

			in = new BufferedInputStream(in);
			// decorate it!
			in = new LowerCaseInputStream(in);

			while ((c = in.read()) > 0) {
				System.out.print((char) c);
			}

			in2 = new URL("http://www.fdehedin.ch").openStream();
			in2 = new BufferedInputStream(in2);

			// decorate it!
			//in2 = new LowerCaseInputStream(in2);

			while ((c = in2.read()) > 0) {
				System.out.print((char) c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				in2.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
