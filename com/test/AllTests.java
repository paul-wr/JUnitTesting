package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FirstJUnitTest.class, ObjectTest.class, TestDoubleFloat.class, WeatherTestCase.class })
public class AllTests {

}
