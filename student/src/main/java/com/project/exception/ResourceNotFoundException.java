package com.project.exception;

public class ResourceNotFoundException extends RuntimeException    {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 
		public ResourceNotFoundException(String message, String string, Long id)   
		{  
		super(message);  
		}  
}
