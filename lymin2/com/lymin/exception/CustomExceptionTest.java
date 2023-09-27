package com.lymin.exception;

public class CustomExceptionTest {
	public static void main(String[] args) throws CustomException {
		CustomCalcul customCalcul = new CustomCalcul();
		customCalcul.comapareXY(10, 20);
//		customCalcul.comapareXY(1, 2);
	}

}
