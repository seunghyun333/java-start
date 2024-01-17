
김영한의 자바 입문 - 코드로 시작하는 자바 첫걸음

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




#3. 연산자
**연산자 종류**
산술연산자: `+` , `-` , `*` , `/` , `%` (나머지연산자) 
증감(증가 및 감소) 연산자: `++` , `--` 
비교연산자: `==` , `!=` , `>` , `<` , `>=` , `<=`
논리 연산자: `&&` (AND), `||` (OR), `!` (NOT) 
대입연산자: `=` , `+=` , `-=` , `*=` , `/=` , `%=`
삼항 연산자: `? :`


#4. 조건문
=> if문은 특정 조건이 참인지 확인하고, 그 조건이 참(true)일 경우 특정 코드 블럭을 실행한다. 
코드블러기 {}(중괄호)사이에 있는 코드

switch 문은 조건식이 특정 case와 같은지만 체크할 수 있다. (값이 같은지 확인하는 연산만 가능, 문자도 가능)

삼항 연산자
(조건) ? 참_표현식 : 거짓_표현식
: 항이 3개라는 뜻으로, 조건, 참_표현식, 거짓_표현식 


#5. 반복문
* while (조건식) { // 코드  }
조건식이 참이면 코드 실행

* do{ //코드 }while(조건문)
`do-while` 문은 `while` 문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다.

* for(1.초기식; 2.조건식; 4.증감식) { //3. 코드}
*  for (; ;) { // 조건이 없으면 무한 반복


#6. 스코프, 형변환
* 스코프
**변수의 접근 가능한 범위{ } 를 스코프(Scope)라 한다. 참고로 Scope를 번역하면 범위라는 뜻이다.**
-  임시 변수를 아무데나 선언하면 1. 비효율적인 메모리 사용, 2. 코드 복잡성 증가 문제가 발생함.
-  변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋고, 변수의 스코프는 꼭 필요한 곳으로 한정해서 사용하자. 메모리를 효율적으로 사용하고, 더 유지보수하기 좋은 코드를 만들 수 있다.
-  좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절한 제약이 있는 프로그램

* 형변환
- 자동 형변환, 묵시적 형변환 = 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있음.  **int > long > double**
- 큰 범위에서 작은 범위는 다음과 같은 문제가 발생할 수 있다. // 소수점 버림, 오버플로

-  명시적 형변환 : 큰 범위에서 작은 범위로 대입

-  보통 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다. 
   중요한 것은 오버플로우가 발생하는 것 자체가 문제라는 점이다! 오버플로우가 발생했을 때 결과가 어떻게 되는지 계산하는데 시간을 낭비하면 안된다! 
- 오버플로우 자체가 발생하지 않도록 막아야 한다. 이 경우 단순히 대입하는 변수(`intValue` )의타입을 `int` `long` 으로 변경해서 사이즈를 늘리면 오버플로우 문제가 해결된다.
- 
- 서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.


#7. Scanner
`scanner.nextLine()`
엔터( `\n` )을 입력할 때 까지 문자를 가져온다.



#8. 배열
배열은 같은 타입의 변수를 사용하기 편하게 하나로 묶어둔 것

[사용]
**1. 배열 변수 선언**
int[] students;

**2. 배열 생성**
students = new int[5];
=> 다섯 개의 int 공간이 생성되고, 0으로 자동 초기화됨.

**3. 배열 참조값 보관** // 메모리의 주소를 나타내는 값
students = x001;

- 인덱스
배열의 위치를 나타내는 숫자를 인덱스(index)라 한다.
배열은 변수와 사용법이 비슷한데, 차이점이 있다면 다음과 같이 `[]` 사이에 숫자 번호를 넣어주면 된다.
//변수 값 대입 students[0] = 90; students[1] = 80;

**배열은 0부터 시작한다**
사용 가능한 인덱스의 범위는 `0 ~ (n-1)

- 배열 값 읽기
1. 변수 값 읽기
System.out.println("학생1 점수: " + students[0]);
2. 변수에 있는 참조값을 통해 실제 배열에 접근. 인덱스를 사용해서 해당 위치의 요소에 접근
System.out.println("학생1 점수: " + x001[0]);
3. 배열의 값을 읽어옴
System.out.println("학생1 점수: " + 90);

* 변수 데이터 타입
  * 기본형 (Primitive Type): 우리가 지금까지 봤던 `int` , `long` , `double` , `boolean` 처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입을 기본형(Primitive Type)이라 한다.
  * 참조형(ReferenceType):`int[] students` 와 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입을 참조형(Reference Type)이라 한다. 객체나 변수들도 모두 참조 형이다.

* 리팩토링
  * 리펙토링(Refactoring)은 기존의 코드 기능은 유지하면서 내부 구조를 개선하여 가독성을 높이고, 유지보수를 용이하게 하는 과정을 뜻한다. 
  이는 중복을 제거하고, 복잡성을 줄이며, 이해하기 쉬운 코드로 만들기 위해 수행된다. 
  리펙토링은 버그를 줄이고, 프로그램의 성능을 향상시킬 수도 있으며, 코드의 설계를 개선하는 데에도 도움이 된다.
    쉽게 이야기해서 작동하는 기능은 똑같은데, 코드를 개선하는 것을 리펙토링이라 한다.


[배열 리펙토링 - 초기화]
int[] students;
students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화


[2차원 배열]
2차원 배열은 `int[][] arr = new int[2][3]` 와 같이 선언하고 생성한다. 그리고 `arr[1][2]` 와 같이 사용하 는데, 먼저 행 번호를 찾고, 그 다음에 열 번호를 찾으면 된다.
행은 영어로 row(로우), 열은 영어로 column(컬럼)이라 한다.

[향상된 for문]
각각의 요소를 탐색한다는 의미로 for-each문이라고도 부름.

for (변수 : 배열 또는 컬렉션 ) {
  //배열 또는 컬렉션의 요소를 순회하면서 수행할 작업
  }



#9. 메서드
메서드 사용
자바에서는 함수를 메서드(Method)라 한다.

메서드 선언
`public static`
`public` : 다른 클래스에서 호출할 수 있는 메서드라는 뜻이다. 접근 제어에서 학습한다.
`static` : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻이다. 자세한 내용은 뒤에서 다룬다.
두 키워드의 자세한 내용은 뒤에서 다룬다. 지금은 단순하게 메서드를 만들 때 둘을 사용해야 한다고 생각하자.


호출: call("hello", 20)
메서드 정의: int call(String str, int age)


**인수(Argument)**
여기서 `"hello"` , `20` 처럼 넘기는 값을 영어로 Argument(아규먼트), 한글로 인수 또는 인자라 한다. 실무에서는 아규먼트, 인수, 인자라는 용어를 모두 사용한다.

**매개변수(Parameter)**
메서드를 정의할 때 선언한 변수인 `String str` , `int age` 를 매개변수, 파라미터라 한다. 메서드를 호출할 때 인수를 넘기면, 그 인수가 매개변수에 대입된다.
실무에서는 매개변수, 파라미터 용어를 모두 사용한다.

**void와 return 생략**
모든 메서드는 항상 `return` 을 호출해야 한다. 그런데 반환 타입 `void` 의 경우에는 예외로 `printFooter()` 와 같 이 생략해도 된다. 
자바가 반환 타입이 없는 경우에는 `return` 을 마지막줄에 넣어준다. 참고로 `return` 을 만나면 해 당 메서드는 종료된다.

**오버로딩**
이렇게 이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩(Overloading)이라 한다. 
오버로딩은 번역하면 과적인데, 과하게 물건을 담았다는 뜻이다. 따라서 같은 이름의 메서드를 여러개 정의했다고 이해 하면 된다.

용어: 메서드 시그니처(method signature)**
`메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서)`
메서드 시그니처는 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻한다. 메서드 시그니처는 메서드의 이 름과 매개변수 타입(순서 포함)으로 구성되어 있다. 
쉽게 이야기해서 메서드를 구분할 수 있는 기준이다. 자바 입장에서 는 각각의 메서드를 고유하게 구분할 수 있어야한다. 그래야 어떤 메서드를 호출 할 지 결정할 수 있다.
따라서 메서드 오버로딩에서 설명한 것 처럼 메서드 이름이 같아도 메서드 시그니처가 다르면 다른 메서드로 간주한다. 반환 타입은 시그니처에 포함되지 않는다. 
방금 오버로딩이 실패한 두 메서드를 보자. 두 메서드는 `add(int a, int b)` 로 메서드 시그니처가 같다. 따라서 메서드의 구분이 불가능하므로 컴파일 오류가 발생한다.
