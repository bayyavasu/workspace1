package com.slokam.test;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

//import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Test12 {

	@Before
	public void setUp() {
		log.info("inside setUp");
	}

	@Test
	public void testOne() {
		log.info("inside testOne");
		//System.out.println("ff");
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
