package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CalculatorTest {

	@Mock
	private Calucator calucator;
	
	@Rule
	public MockitoRule mockitoRule=MockitoJUnit.rule();
	
	@Test
	public void additionTest() {
		Mockito.when(calucator.add(5, 5)).thenReturn(20);
		Mockito.when(calucator.add(15, 5)).thenCallRealMethod();
		assertEquals(20, calucator.add(5, 5));
	}
}
