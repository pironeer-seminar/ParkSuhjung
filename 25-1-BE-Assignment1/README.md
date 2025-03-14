## 22기 코딩 테스트 자바로 구현하기 + 리팩토링

1. DetectiveGame에 있는 4~8번, 10번 완성하기
2. 완성된 코드에서 깔끔하게 코드 리팩토링하기

### 📌 리팩토링 채점 기준
- 각 함수는 최대 20줄까지만 허용(출력 함수 제외)
- if문을 중첩으로 쓰지 말것
- Enum 사용하기
- Optional 사용하기
- Stream API 사용하기


### 🛠 과제 수행 결과
###  **1. 함수 역할 분리 **

- 함수별 역할을 명확히 분리하여 20줄 이하 유지
- 주요 함수:
    - `startSuspect()`
    - `printCharacterAppearance()`
---


###  **2. Enum 사용**

- `Appearance` Enum 활용하여 머리, 옷, 신발 속성 관리
- `Appearance.getRandomAppearance()` 메서드 추가하여 **랜덤 속성 선택 자동화**
---

###  **3. Optional 사용**

- `investigate()`에서 `Optional.ifPresentOrElse()` 사용하여 **중복 로직 제거**
---

###  **5. Stream API 사용**

### - **반복문 단순화 (`printCharacterAppearance()`)**

- `Arrays.stream(Appearance.values()).forEach(...)` 사용하여 코드 간결화

```java

Stream<Appearance> appearanceStream = Arrays.stream(Appearance.values());
appearanceStream.forEach(type ->
    System.out.println("- " + type.getDescription() + ": " + character.getAppearance(type))
);

```

