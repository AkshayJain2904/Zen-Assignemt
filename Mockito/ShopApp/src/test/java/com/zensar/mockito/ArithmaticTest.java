package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class ArithmaticTest {
	
	@Mock
	private Calucator calucator;
	
	@InjectMocks
	private Arithmatic arthimatic;
	
	@Rule
	public MockitoRule mockitoRule=MockitoJUnit.rule();

	@Test
	public void testAddition() {
		Mockito.when(arthimatic.addition(10, 20)).thenReturn(30);
		assertEquals(30,arthimatic.addition(10, 20));
	}
}
