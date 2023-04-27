package com.example.azureDemo;

import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.azure.identity.implementation.IdentityClientOptions;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AzureDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("testing");

		ClientSecretCredential _client_secret= new ClientSecretCredential("","","",new IdentityClientOptions());
	}
}
