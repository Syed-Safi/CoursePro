# CoursePro

CoursePro is a Java-based automation testing project built using Cucumber and other tools.

## 🧠 Overview

This repository contains test automation for an online course platform.  
It includes various BDD test scenarios implemented using Cucumber, and the tests are organized under multiple feature files.

## 🛠️ Tech Stack

- Java
- Cucumber (BDD) (Gherkin)
- Page Object Model (POM) design pattern
- Selenium PageFactory (`@FindBy`)
- Selenium WebDriver
- Maven
- JUnit

Project Structure
Name- AdatinProject
- `src/test/java` → Contains reusable Selenium utility methods (base)
- `src/test/java` → POM class (Pages)
- `src/test/java` →  test (Test)
- `pom.xml` → Maven dependencies and build config


Name- CucumberPro
- `src/test/java` → Contains reusable Selenium utility methods (BaseClass)
- `src/test/java` → method defines (Step)
- `src/test/java` →  Test + Cucumber Runner (TestRun)
- `src/test/resources` → Feature files (End2Scenario)
- `pom.xml` → Maven dependencies and build config
