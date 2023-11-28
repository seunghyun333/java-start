#1. Hello World
- 자바는 표준 스펙(설계도)과 구현으로 나눌 수 있다.
- 자바 구현들은 모두 표준 스펙에 맞도록 개발되어 있으므로 어떤 자바를 사용하든 문제 없이 동작한다.

[작동 순서]
1. Hello.java 소스 코드를 자바 컴파일러(javac)를 사용하여 소스 코드를 컴파일
2. .java -> .class 파일이 생성된다.(소스 코드를 바이트코드로 변환)
3. 자바 프로그램 실행(java 프로그램 사용, JVM이 샐행되면서 프로그램 작동)

* 개발할 때 자바와 서버에서 실행할 때 다른 자바를 사용할 수 있다.
* 자바의 운영체제 독립성 덕분에 각각의 환경에 맞추어 자바를 설치하는 것이 가능하다.


#2. 변수
[자주 사용하는 타입]
* 정수 - int, long
* 실수 - double
* 불린형 - boolean
* 문자열 - String

[변수 명명 규칙]
* 변수 이름은 숫자로 시작할 수 없다
* 이름에는 공백이 들어갈 수 없다
* 예약어를 변수 이름으로 사용할 수 없다 (int, class, public)
* 변수 이름에는 영문자(a-z, A-Z), 숫자(0~9), $, _ 만 사용할 수 있다.
* 관례: 낙타 표기법(camel case) - **클래스는 대문자로 시작, 나머지는 소문자로 시작** + 낙타 표기법
* 관례 예외 : 상수는 모두 대문자 USER_LIMIT, 패키지는 모두 소문자
* 변수 이름은 의미있고, 그 용도를 명확하게 설명해야 한다.