# 🛒 Item Service - 스프링 MVC 상품 관리 웹 애플리케이션

Spring Boot와 Thymeleaf를 활용한 **상품 관리 웹 애플리케이션**입니다.  
기본적인 상품 CRUD 기능을 학습하며, 스프링 MVC의 흐름과 PRG 패턴, 타임리프 템플릿 사용법까지 실습할 수 있습니다.

---

## 📌 프로젝트 개요

- **상품 도메인 객체(Item)**를 활용한 웹 애플리케이션
- 스프링 MVC의 핵심 구조 학습: DispatcherServlet, Controller, Model, View
- 타임리프(Thymeleaf)를 이용한 HTML 렌더링
- Form 전송, Redirect, URL 템플릿 처리 학습
- `@ModelAttribute`, `@RequestParam`, `@PathVariable` 등 MVC 핵심 어노테이션 활용

---

## 🧱 기술 스택

- Java 21
- Spring Boot 3.3.4
- Gradle
- Thymeleaf
- Lombok
- Bootstrap 5

---

## 💡 주요 학습 포인트

### ✅ 스프링 MVC 구조 이해
- `DispatcherServlet` → `HandlerAdapter` → `Controller` 흐름 학습
- `@ModelAttribute`, `@PathVariable`, `@RequestParam` 실습
- `RedirectAttributes`를 활용한 PRG(Post-Redirect-Get) 패턴 적용

### ✅ Thymeleaf 템플릿 활용
- `th:each`, `th:text`, `th:href`, `th:value` 등 주요 문법 사용
- 정적 HTML → 템플릿 변환 실습
- Natural Templates의 장점 체험

### ✅ PRG 패턴 적용
- 중복 제출 방지를 위한 리다이렉트 처리

