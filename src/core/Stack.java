package core;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

public class Stack implements iStack {
	private ArrayList<Object> elements;
	private Stack aStack ;
	public Stack() {
		elements = new ArrayList<Object>();
	}

	@Override
	public boolean isEmpthy() {
		if (elements != null) {
			if(elements.size()==0)
				return true;
			else return false;
		}else return true;
	}

	@Override
	public int getSize() {
		if(elements != null)
			return elements.size();
		else return 0;
	}

	@Override
	public void push(Object elm){
		elements.add(elm);

	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getTop() {
		return elements.get(getSize()-1 );
	}

	@Override
	public void setUp() throws Exception {
		aStack = new Stack() ;

	}

	@Override
	public void tearDown() throws Exception {
		aStack = null ;
	}

	@Override
	public Object pop() {
		if(!isEmpthy()) {
			return elements.remove(getSize()-1);
		}else return null;
	}
	

	 

           

}
