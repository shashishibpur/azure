package com.example.azureDemo;

import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.azure.identity.implementation.IdentityClientOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

}
