package com.ac.common.fabric.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Configuration
@PropertySource(value = "classpath:application-insurance.properties")
@ConfigurationProperties(prefix = "insurance", ignoreUnknownFields = false)
@Data
public class InsuranceInfoConfig {

	private String name;

	private String domname;

	private String caLocation;

	private String peerLocations;

	private String ordererLocations;

	private String eventhubLocations;

	@Data
	public static class Admin {
		private String name;
		private String password;
	}

	@Data
	public static class user {
		private String name;
		private String password;
	}

}
