/**
 * Logback: the generic, reliable, fast and flexible logging framework.
 * 
 * Copyright (C) 1999-2006, QOS.ch
 * 
 * This library is free software, you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation.
 */
package ch.qos.logback.access.db;

import junit.framework.*;

public class PackageTest extends TestCase {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTest(new JUnit4TestAdapter(DBAppenderTest.class));
    suite.addTest(new JUnit4TestAdapter(DBAppenderIntegrationTest.class));
    return suite;
  }
}