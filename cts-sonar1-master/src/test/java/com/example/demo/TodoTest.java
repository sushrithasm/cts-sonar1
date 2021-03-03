package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TodoTest {

	
	private Todo todo=Todo.builder()
			.isDone(true).build();
	@Test
	public void testIsDone()
	{
		assertEquals(true, todo.isDone());
	}
}
