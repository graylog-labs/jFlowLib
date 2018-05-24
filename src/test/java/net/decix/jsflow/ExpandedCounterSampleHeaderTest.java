/*
 * This file is part of jsFlow.
 *
 * Copyright (c) 2009 DE-CIX Management GmbH <http://www.de-cix.net> - All rights
 * reserved.
 * 
 * Author: Thomas King <thomas.king@de-cix.net>
 *
 * This software is licensed under the Apache License, version 2.0. A copy of 
 * the license agreement is included in this distribution.
 */
package net.decix.jsflow;

import com.google.common.io.Resources;
import junit.framework.TestCase;
import net.decix.jsflow.header.ExpandedCounterSampleHeader;

import java.io.IOException;

public class ExpandedCounterSampleHeaderTest extends TestCase {
	
	/* 10 complete frames from wire with Ethernet/IPv4/UDP and sFlow Headers. Contains only Expanded Counter Samples */
	private final byte[] pkt1;
	private final byte[] pkt2;
	private final byte[] pkt3;
	private final byte[] pkt4;
	private final byte[] pkt5;
	private final byte[] pkt6;
	private final byte[] pkt7;
	private final byte[] pkt8;
	private final byte[] pkt9;
	private final byte[] pkt10;

	private ExpandedCounterSampleHeader ecsh;

	public ExpandedCounterSampleHeaderTest() throws IOException {
		pkt1 = Resources.toByteArray(Resources.getResource("header_pkt1.bin"));
		pkt2 = Resources.toByteArray(Resources.getResource("header_pkt2.bin"));
		pkt3 = Resources.toByteArray(Resources.getResource("header_pkt3.bin"));
		pkt4 = Resources.toByteArray(Resources.getResource("header_pkt4.bin"));
		pkt5 = Resources.toByteArray(Resources.getResource("header_pkt5.bin"));
		pkt6 = Resources.toByteArray(Resources.getResource("header_pkt6.bin"));
		pkt7 = Resources.toByteArray(Resources.getResource("header_pkt7.bin"));
		pkt8 = Resources.toByteArray(Resources.getResource("header_pkt8.bin"));
		pkt9 = Resources.toByteArray(Resources.getResource("header_pkt9.bin"));
		pkt10 = Resources.toByteArray(Resources.getResource("header_pkt10.bin"));
	}

	public void setUp() throws Exception {
	}
	
	/**
	 * Testet Parse Funktion des Konstruktors von {@link ExpandedCounterSampleHeader}.
	 * Die ersten 78 Bytes werden uebersprungen um direkt an diesen Header zu gelangen
	 * (Ethernet, IP, UDP, Sflow).
	 * @throws Exception
	 */
	public void testParse() throws Exception {
		byte[] subData1 = new byte[pkt1.length - 78];
		System.arraycopy(pkt1, 78, subData1, 0, pkt1.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData1);
				
		byte[] subData2 = new byte[pkt2.length - 78];
		System.arraycopy(pkt2, 78, subData2, 0, pkt2.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData2);
		
		byte[] subData3 = new byte[pkt3.length - 78];
		System.arraycopy(pkt2, 78, subData3, 0, pkt3.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData3);
		
		byte[] subData4 = new byte[pkt3.length - 78];
		System.arraycopy(pkt4, 78, subData4, 0, pkt4.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData4);
		
		byte[] subData5 = new byte[pkt5.length - 78];
		System.arraycopy(pkt5, 78, subData5, 0, pkt5.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData5);
		
		byte[] subData6 = new byte[pkt6.length - 78];
		System.arraycopy(pkt6, 78, subData6, 0, pkt6.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData6);
		
		byte[] subData7 = new byte[pkt7.length - 78];
		System.arraycopy(pkt7, 78, subData7, 0, pkt7.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData7);
		
		byte[] subData8 = new byte[pkt8.length - 78];
		System.arraycopy(pkt8, 78, subData8, 0, pkt8.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData8);
		
		byte[] subData9 = new byte[pkt9.length - 78];
		System.arraycopy(pkt9, 78, subData9, 0, pkt9.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData9);
		
		byte[] subData10 = new byte[pkt10.length - 78];
		System.arraycopy(pkt10, 78, subData10, 0, pkt10.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData10);
	}
	
	public void testGetBytes() throws Exception {
		byte[] subData1 = new byte[pkt1.length - 78];
		System.arraycopy(pkt1, 78, subData1, 0, pkt1.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData1);
		byte[] result1 = ecsh.getBytes();
		for (int i = 0; i < Math.min(result1.length, subData1.length); i++) {
			assertEquals(subData1[i], result1[i]);
		}
		
		byte[] subData2 = new byte[pkt2.length - 78];
		System.arraycopy(pkt2, 78, subData2, 0, pkt2.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData2);
		byte[] result2 = ecsh.getBytes();
		for (int i = 0; i < Math.min(result2.length, subData2.length); i++) {
			assertEquals(subData2[i], result2[i]);
		}
		
		byte[] subData3 = new byte[pkt3.length - 78];
		System.arraycopy(pkt2, 78, subData3, 0, pkt3.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData3);
		byte[] result3 = ecsh.getBytes();
		for (int i = 0; i < Math.min(result3.length, subData3.length); i++) {
			assertEquals(subData3[i], result3[i]);
		}
		
		byte[] subData4 = new byte[pkt4.length - 78];
		System.arraycopy(pkt4, 78, subData4, 0, pkt4.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData4);
		byte[] result4 = ecsh.getBytes();
		for (int i = 0; i < Math.min(result4.length, subData4.length); i++) {
			assertEquals(subData4[i], result4[i]);
		}
		
		byte[] subData5 = new byte[pkt5.length - 78];
		System.arraycopy(pkt5, 78, subData5, 0, pkt5.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData5);
		byte[] result5 = ecsh.getBytes();
		for (int i = 0; i < Math.min(result5.length, subData5.length); i++) {
			assertEquals(subData5[i], result5[i]);
		}
		
		byte[] subData6 = new byte[pkt6.length - 78];
		System.arraycopy(pkt6, 78, subData6, 0, pkt6.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData6);
		byte[] result6 = ecsh.getBytes();
		for (int i = 0; i < Math.min(result6.length, subData6.length); i++) {
			assertEquals(subData6[i], result6[i]);
		}
		
		byte[] subData7 = new byte[pkt7.length - 78];
		System.arraycopy(pkt7, 78, subData7, 0, pkt7.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData7);
		byte[] result7 = ecsh.getBytes();
		for (int i = 0; i < Math.min(result7.length, subData7.length); i++) {
			assertEquals(subData7[i], result7[i]);
		}
		
		byte[] subData8 = new byte[pkt8.length - 78];
		System.arraycopy(pkt8, 78, subData8, 0, pkt8.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData8);
		byte[] result8 = ecsh.getBytes();
		for (int i = 0; i < Math.min(result8.length, subData8.length); i++) {
			assertEquals(subData8[i], result8[i]);
		}
		
		byte[] subData9 = new byte[pkt9.length - 78];
		System.arraycopy(pkt9, 78, subData9, 0, pkt9.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData9);
		byte[] result9 = ecsh.getBytes();
		for (int i = 0; i < Math.min(result9.length, subData9.length); i++) {
			assertEquals(subData9[i], result9[i]);
		}
		
		byte[] subData10 = new byte[pkt10.length - 78];
		System.arraycopy(pkt10, 78, subData10, 0, pkt10.length - 78);
		ecsh = ExpandedCounterSampleHeader.parse(subData10);
		byte[] result10 = ecsh.getBytes();
		for (int i = 0; i < Math.min(result10.length, subData10.length); i++) {
			assertEquals(subData10[i], result10[i]);
		}
	}
}
