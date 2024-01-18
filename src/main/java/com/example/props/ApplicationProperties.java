package com.example.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "plan-api")
@Configuration
public class ApplicationProperties {
    private Map<String, String> messages = new HashMap<>();
}
