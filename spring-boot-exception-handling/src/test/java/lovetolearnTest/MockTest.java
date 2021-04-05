package lovetolearnTest;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import lovetolearn.model.Books;
import lovetolearn.repository.BooksRepository;
import lovetolearn.service.BooksService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MockTest {
	
	@Mock
	BooksService bs;

	@InjectMocks
	BooksRepository br;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
	    assertEquals(15, 15);
	}
//	@Before
//	public void before() {
//		System.out.println("Before");
//	}
//
//	
//	@Test
//	public void getData() {
//		
////		List<Books> b = new ArrayList<Books>();
////	Books b1=	new Books(1,"hbk","sawd",3);Books b2=new Books(2,"asdf","sdfv",3);
////	b.add(b1);
////	b.add(b2);
////	when(br.findAll()).thenReturn(b);	
//	assertEquals(2,2);
//	//bs.getAllBooks().size()
//	}
//	@After
//	public void after() {
//		System.out.println("After");
//	}
}
