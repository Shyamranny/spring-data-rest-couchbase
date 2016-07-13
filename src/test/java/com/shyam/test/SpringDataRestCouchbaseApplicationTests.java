package com.shyam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shyam.test.couchbase.SpringDataRestCouchbaseApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringDataRestCouchbaseApplication.class)
public class SpringDataRestCouchbaseApplicationTests {

	@Test
	public void contextLoads() {
	}

}
