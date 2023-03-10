package com.obsqura.main;

import java.util.Arrays;

public class ExecuteMain {

	public static void main(String[] args) {

		System.out.println("Running the main method " + args.length);

		if (args.length > 0) {
			System.out.println("List of arguments: " + Arrays.toString(args));
		}
		
		AnimalMain.main(args);
	}

}
