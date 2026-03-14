# ParallelTestGrid

A scalable test automation framework designed to run Selenium tests in parallel using Docker and Zalenium.  
This project demonstrates how to execute automated UI tests efficiently across multiple browser instances to reduce execution time and improve test reliability.

---

## 🚀 Overview

Modern applications require fast and reliable testing pipelines. Running tests sequentially can significantly slow down delivery.

ParallelTestGrid solves this problem by leveraging:

- Docker for containerized infrastructure
- Zalenium for dynamic Selenium Grid management
- Parallel execution for faster test runs
- Scalable architecture for large test suites

This setup allows multiple browser sessions to run simultaneously, dramatically reducing the total execution time of test suites.

---

## 🏗 Architecture

The framework is based on the following components:

```
Selenium WebDriver Tests
        │
        │
Zalenium (Selenium Grid Hub)
        │
        │
Docker Containers
        │
┌───────────────┬───────────────┬───────────────┐
│ Chrome Node   │ Chrome Node   │ Chrome Node   │
│ Container     │ Container     │ Container     │
└───────────────┴───────────────┴───────────────┘
```

Zalenium dynamically creates and manages browser containers depending on the number of tests running in parallel.

---

## ⚙️ Technologies Used

- Selenium WebDriver
- Docker
- Zalenium
- Java / TestNG / JUnit (depending on your test framework)
- Maven or Gradle

---

## 📦 Prerequisites

Before running the project, make sure you have installed:

- Docker
- Docker Compose
- Java JDK
- Maven or Gradle
- Git

Check installation:

```bash
docker --version
java -version
mvn -version
```