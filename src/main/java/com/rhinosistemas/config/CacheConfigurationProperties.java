package com.rhinosistemas.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "cache")
@Data
public class CacheConfigurationProperties {
	
	private long timeoutSeconds = 60;
    private int redisPort = 6379;
    private String redisHost = "localhost";
    // Mapping of cacheNames to expira-after-write timeout in seconds
    private Map<String, Long> cacheExpirations = new HashMap<>();

}
