package com.ncu.validations;

import java.util.regex.Pattern;
import com.ncu.validations.*;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValid implements ConstraintValidator<Password, String> 
{

	private String passPrefix;

		@Override
		public boolean isValid(String value, ConstraintValidatorContext context) 
		{
			Pattern regex = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");
	        return value != null  && (value.length()>8) && Character.isUpperCase(value.charAt(0)) && regex.matcher(value).find();
		}

		@Override
		public void initialize(Password constraintAnnotation) {
			// TODO Auto-generated method stub
			
		}

}