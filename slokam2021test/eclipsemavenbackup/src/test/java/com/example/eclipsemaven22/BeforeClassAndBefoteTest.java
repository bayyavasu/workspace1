package com.example.eclipsemaven22;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class BeforeClassAndBefoteTest {

	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 * 
	 */	@BeforeClass
	public static void beforeClass() {
		log.info("inside begoreClass");
	}

	@BeforeEach
	public void setUp() {
		log.info("inside setUp");
	}

	@Test
	public void testOne() {
		log.info("inside testOne");
	}

	@Test
	public void testTwo() {
		log.info("inside testTwo");
	}

	@After
	public void destroySetup() {
		log.info("inside destroy");
	}

}
