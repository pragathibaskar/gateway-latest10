// package com.cg.gateway;

// import java.io.ByteArrayInputStream;
// import java.io.IOException;
// import java.io.InputStream;
// import java.util.concurrent.TimeoutException;

// import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpHeaders;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.MediaType;
// import org.springframework.http.client.ClientHttpResponse;

// import com.netflix.hystrix.exception.HystrixTimeoutException;



// @Configuration
// public class MyFallbackProvider  {

// 	@Bean
// 	public FallbackProvider fallbackProvider() {
// 		return new FallbackProvider() {


// 			@Override
// 		    public String getRoute() {
// 		        return "*";
// 		    }

// 		    @Override
// 		    public ClientHttpResponse fallbackResponse(String route, final Throwable cause) {
// 		    	 if (cause instanceof HystrixTimeoutException) {
// 		             return response(HttpStatus.GATEWAY_TIMEOUT);
// 		         } else {
// 		             return response(HttpStatus.SERVICE_UNAVAILABLE);
// 		         }
// 		    }


// 		    	 private ClientHttpResponse response(final HttpStatus status) {
// 		    	        return new ClientHttpResponse() {
// 		    	            @Override
// 		    	            public HttpStatus getStatusCode() throws IOException {
// 		    	                return status;
// 		    	            }

// 		    	            @Override
// 		    	            public int getRawStatusCode() throws IOException {
// 		    	                return status.value();
// 		    	            }

// 		    	            @Override
// 		    	            public String getStatusText() throws IOException {
// 		    	                return status.getReasonPhrase();
// 		    	            }

// 		    	            @Override
// 		    	            public void close() {
// 		    	            }

// 		    	            @Override
// 		    	            public InputStream getBody() throws IOException {
// 		    	                return new ByteArrayInputStream("El servicio no está disponible. Por favor, inténtelo más tarde.".getBytes());
// 		    	            }

// 		    	            @Override
// 		    	            public HttpHeaders getHeaders() {
// 		    	                HttpHeaders headers = new HttpHeaders();
// 		    	                headers.setContentType(MediaType.APPLICATION_JSON);
// 		    	                return headers;
// 		    	            }
// 		    	        };
// 		    }
// 		};
// 	}
// }



