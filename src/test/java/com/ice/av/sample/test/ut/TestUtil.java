package com.ice.av.sample.test.ut;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ice.av.sample.util.Util;

public class TestUtil {

	private static final Logger log = LoggerFactory.getLogger(TestUtil.class);

	@Test
	public void testIsTransactionHappenedInThis60Seconds(){
		Assert.assertEquals(true, Util.isTransactionHappenedInThis60Seconds(System.currentTimeMillis() / 1000));
		Assert.assertEquals(true, Util.isTransactionHappenedInThis60Seconds(System.currentTimeMillis() / 1000 - 1));
		Assert.assertEquals(true, Util.isTransactionHappenedInThis60Seconds(System.currentTimeMillis() / 1000 - 10));
		Assert.assertEquals(true, Util.isTransactionHappenedInThis60Seconds(System.currentTimeMillis() / 1000 - 50));
		Assert.assertEquals(false, Util.isTransactionHappenedInThis60Seconds(System.currentTimeMillis() / 1000 - 60));
		Assert.assertEquals(false, Util.isTransactionHappenedInThis60Seconds(System.currentTimeMillis() / 1000 - 70));
		log.debug("Testing Util.isTransactionHappenedInThis60Seconds is PASSED.");
	}

	@Test(expected=UnsupportedOperationException.class)
	public void testInstantiateUtilClass(){
		new Util();
	}

}
