package com.example.eclipsemaven22.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;
@Slf4j
class BeforeAndAfterTest {
	@Before
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
