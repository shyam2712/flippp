$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DELL/eclipse-workspace/cucumber/src/test/resources/flipi.feature");
formatter.feature({
  "name": "GET TEXT",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Buy ticket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "launch a browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Flipi_stepdefinition.launch_a_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Flipi_stepdefinition.close_the_login_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button [@class \u003d \u0027_2KpZ6l _2doB4z\u0027]\"}\n  (Session info: MicrosoftEdge\u003d113.0.1774.57)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.8.3\u0027, revision: \u0027e5e76298c3\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.5\u0027\nDriver info: org.openqa.selenium.edge.EdgeDriver\nCommand: [278667a407051365a626093b6478b505, findElement {using\u003dxpath, value\u003d//button [@class \u003d \u0027_2KpZ6l _2doB4z\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: msedge, browserVersion: 113.0.1774.57, ms:edgeOptions: {debuggerAddress: localhost:52207}, msedge: {msedgedriverVersion: 113.0.1774.57 (b3b212deff59..., userDataDir: C:\\Users\\DELL\\AppData\\Local...}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:52207/devtoo..., se:cdpVersion: 113.0.1774.57, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 278667a407051365a626093b6478b505\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:193)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:183)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.cucu.Flipi_stepdefinition.close_the_login_button(Flipi_stepdefinition.java:37)\r\n\tat ✽.close the login button(C:/Users/DELL/eclipse-workspace/cucumber/src/test/resources/flipi.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter value and search",
  "keyword": "And "
});
formatter.match({
  "location": "Flipi_stepdefinition.user_enter_value_and_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the search result",
  "keyword": "Then "
});
formatter.match({
  "location": "Flipi_stepdefinition.validate_the_search_result()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "quit the browser",
  "keyword": "When "
});
formatter.match({
  "location": "Flipi_stepdefinition.quit_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});