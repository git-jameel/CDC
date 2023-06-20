package edu.disease.asn1;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class ExposureTest {
	Exposure exposure;
	@Before
	public void setData()
	{
		UUID id = UUID.randomUUID();
		exposure = new Exposure(id);
		exposure.setDateTime(LocalDateTime.now());
		exposure.setExposureType("I");
	}
	@Test
	public void testExposureNegative()
	{
		assertNotNull(exposure.getDateTime());
		assertNotNull(exposure.getExposureType());
		assertNotNull(exposure.hashCode());
		assertEquals("I", exposure.getExposureType());
		assertNotNull(exposure.toString());
		Exposure exposureobj = exposure;
		assertTrue(exposure.equals(exposureobj));
		assertTrue(exposure.equals(exposure));
		assertFalse(exposure.equals(null));
		Exposure exposureobjEquals = new Exposure(exposure.getPatientid());
		exposureobjEquals.setExposureType("D");
		exposureobjEquals.setDateTime(exposure.getDateTime());
		assertTrue(exposure.equals(exposureobjEquals));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testException()
	{
		exposure.setExposureType("Invalid");
	}
}
