package core;

public interface iStack {
	boolean isEmpthy();
	int getSize();
	void push(Object elm);
	boolean isFull();
	Object getTop();
	static void setUpBeforeClass() throws Exception {}
	static void tearDownAfterClass() throws Exception {}
    void setUp() throws Exception;
    void tearDown() throws Exception;
    Object pop();
}
