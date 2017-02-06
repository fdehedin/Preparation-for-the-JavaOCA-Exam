package ch.fdehedin.mockito;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class MockitoTest {

	@Test
	public void testGetter(){
		PseudoDatabase db = new PseudoDatabase();
		Mockito.when(databaseMock.toString()).thenReturn("123");
		assertThat(databaseMock.toString(), equalTo("123"));
	}
	
	@Mock
	PseudoDatabase databaseMock;

	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();

	@Test
	public void testQuery() {
		PseudoDatabaseTest t = new PseudoDatabaseTest(databaseMock);
		List<String> allData = t.getAll();
		System.out.println("all:" + allData);
		assertThat(allData.isEmpty(), is(false));
		verify(databaseMock).getData();
	}
}

class PseudoDatabaseTest {

	private PseudoDatabase db;

	public PseudoDatabaseTest(PseudoDatabase db) {
		this.db = db;
	}

	public List<String> getAll() {
		return db.getData();
	}
}

class PseudoDatabase {
	private List<String> data = new ArrayList<>();

	public List<String> getData() {
		this.data.add("Tina");
		this.data.add("Petra");
		this.data.add("Laura");
		return data;
	}

}
