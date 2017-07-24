package com.ice.av.sample.util;

public final class Util {
	
	
	public Util() {
		throw new UnsupportedOperationException("This class is not instantiable.");
	}

	public static boolean isTransactionHappenedInThis60Seconds(long timeInSecond) {
		return (System.currentTimeMillis() / 1000) < (timeInSecond) + 60;
	}
}
