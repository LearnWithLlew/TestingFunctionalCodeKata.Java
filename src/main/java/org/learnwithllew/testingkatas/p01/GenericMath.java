package org.learnwithllew.testingkatas.p01;

public class GenericMath {

	public static int floor(double a) {
		int y = (int) a;
		if (a < y) {
			return y - 1;
		}
		return y;
	}

}
