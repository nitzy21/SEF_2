 package sef.module13.activity;

import junit.framework.TestCase;
import sef.module13.activity.AccountDAOTest1;

public class AccountDAOTest extends TestCase {
	
	AccountDAOTest1 runTest = new AccountDAOTest1();
	
	protected void setUp() throws Exception {
		runTest.setUp();
	}

	public void testFindID(){
		runTest.testFindID();
	}
	
	public void testFindAccountViaName(){
		runTest.testFindAccountViaName();
	}
	
	public void testInsertAccount(){
		runTest.testInsertAccount();
	}
	
	protected void tearDown() throws Exception {
		runTest.tearDown();
	}

}
