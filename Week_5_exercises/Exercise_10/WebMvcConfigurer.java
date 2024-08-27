package com.example.BookstoreAPI;

public class WebMvcConfigurer implements WebMvcConfigurer{

	public void configure(Configure configurer) {
		configurer
		.favorPathExtension(false)
		.favorParameter(true)
		.parameterName("mediaType")
		.ignoreAcceptHeader(false)
		.useRegisteredExtensionsOnly(false)
		.defaultContentType(MediaType.APPLICATION_JSON)
		.mediaType("json",MediaType.APPLICATION_JSON)
		.mediaType("xml",MediaType.APPLICATION_XML);
	}

}
