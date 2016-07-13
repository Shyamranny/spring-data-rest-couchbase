package com.shyam.test.couchbase;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
@Configuration
@EnableCouchbaseRepositories
public class SpringDataRestCouchbaseApplication extends AbstractCouchbaseConfiguration{
	
	@Value("${bucket.name}")
	String bucketName;
	
	@Value("${bucket.password}")
	String bucketPassword;
	
	@Value("${host.name}")
	String hostName;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestCouchbaseApplication.class, args);
	}
	
	@Override
	protected String getBucketName() {
		return bucketName;
	}

	@Override
	protected String getBucketPassword() {
		return bucketPassword;
	}

	@Override
	protected List<String> bootstrapHosts() {
		return Arrays.asList(hostName);
	}
}
