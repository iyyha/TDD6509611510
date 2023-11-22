package core;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Assertions;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {

	public void testCreateNewEmpthyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpthy());
	}
	
	public void testPushElmToTop() {
			
		Stack s1 = new Stack();
		assertFalse(s1.isFull());
		s1.push(new Integer(1));
		int top = (Integer)s1.getTop();
		assertEquals(1,top);
		}
	
	public void testLastInFirstOut() {
		Stack s2 = new Stack();
		assertTrue(s2.isEmpthy());
			s2.push(1);
			s2.push(2);
			s2.push(3);
		assertEquals(3, s2.getTop());
		assertEquals(3, s2.pop());
		assertEquals(2, s2.getTop());
		assertEquals(2, s2.pop());
		assertEquals(1, s2.getTop());
		assertEquals(1, s2.pop());
		
		assertTrue(s2.isEmpthy());
		
	}
		
	

	public void testPushElmtoLimitedSizeStack() {
		
	}
}
