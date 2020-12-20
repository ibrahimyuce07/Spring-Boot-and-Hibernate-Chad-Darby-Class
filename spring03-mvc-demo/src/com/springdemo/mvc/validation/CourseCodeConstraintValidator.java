package com.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {

		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) { // String theCode
																										// : html form
																										// data ;;;

		boolean result;

		if (theCode != null) {
			result = theCode.startsWith(coursePrefix); // LUV ile baslıyorsa true
		}

		else {
			result = true;
		}

		return result;
	}

}
