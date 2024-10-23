## ✍️✍️간단하게 헷갈리는 부분 정리

### 🌟str1.length()와 str1.length 차이
![image](https://github.com/user-attachments/assets/349a76d0-b143-4fab-afb9-69353f262ea4)
---

### 🌟append와 add 의 차이 
![image](https://github.com/user-attachments/assets/1be9aa56-c2ff-492d-ad1b-31aace461406)
---


### 🌟 == 와 equals()의 차이
### == 연산자:
비교 대상: 두 객체의 **참조(메모리 주소)** 를 비교합니다.
기본 타입(Primitive Types): == 연산자는 기본 데이터 타입(int, char, boolean 등)을 비교할 때 값 자체를 비교합니다.
참조 타입(Reference Types): 참조 타입(예: 객체, 배열 등)의 경우, 두 객체가 같은 메모리 위치를 가리키고 있는지를 비교합니다.
예를 들어 두 개의 문자열 객체를 ==로 비교하면, 문자열의 값이 같더라도 두 객체의 메모리 주소가 다르면 false가 됩니다.

### equals() 메서드:
비교 대상: 객체의 **내용(값)** 을 비교합니다. 기본적으로 Object 클래스에서 상속된 equals() 메서드는 ==와 동일하게 참조를 비교하지만, 많은 클래스(특히 String 클래스 등)에서 이를 오버라이딩하여 값 비교를 수행합니다.
문자열 비교: String 클래스의 equals()는 두 문자열의 **내용(값)**을 비교하도록 오버라이딩되어 있습니다.

### 차이 요약:
- ==: 객체의 참조(메모리 주소)를 비교.
- equals(): 객체의 값을 비교 (주로 오버라이딩된 경우).
---
