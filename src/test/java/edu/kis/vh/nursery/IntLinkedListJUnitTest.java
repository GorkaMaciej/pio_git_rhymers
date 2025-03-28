package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.list.IntLinkedList;

public class IntLinkedListJUnitTest {

	@Test
	 public void testTop() {
		 IntLinkedList list = new IntLinkedList();
		 int testValue = 123;
		 list.push(testValue);
		 Assert.assertEquals(testValue, list.top());
	        
		 list.pop();
		 Assert.assertEquals(list.top(), -1);
	}
	
	 @Test
	 public void testPushAndPop() {
		 IntLinkedList list = new IntLinkedList();
		 int testValue = 123;
		 list.push(testValue);
		 Assert.assertEquals(testValue, list.top());

		 testValue = 321;
		 list.push(testValue);
		 Assert.assertEquals(testValue, list.top());
	        
		 testValue = list.top();
		 int res = list.pop();
		 Assert.assertEquals(testValue, res);

		 testValue = list.top();
		 res = list.pop();
		 Assert.assertEquals(testValue, res);
	}
	 
	 @Test
	 public void testIsEmpty() {
		 IntLinkedList list = new IntLinkedList();
		 int testValue = 123;
		 list.push(testValue);
		 Assert.assertEquals(testValue, list.top());
		 Assert.assertEquals(list.isEmpty(), false);

		 testValue = list.top();
		 int res = list.pop();
		 Assert.assertEquals(testValue, res);
		 Assert.assertEquals(list.isEmpty(), true);
	}

	 @Test
	 public void testIsFull() {
		 IntLinkedList list = new IntLinkedList();
		 int testListCapacityValue = 100;
		 for (int i = 0; i < testListCapacityValue; ++i) {
			 int testValue = i;
			 list.push(testValue);
			 Assert.assertEquals(testValue, list.top());
			 Assert.assertEquals(list.isFull(), false);
		 }
		 
		 for (int i = testListCapacityValue - 1; i >= 0; --i) {
			 int expectedValue = i;
			 int res = list.pop();
			 Assert.assertEquals(expectedValue, res);
			 Assert.assertEquals(list.isFull(), false);
		 }
	}
}
