/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
  }

  @Test
  public void greetingShouldReturnHelloworld() {

    App app = new App();
    assertEquals("olá mundo", app.getGreeting());
  }
}