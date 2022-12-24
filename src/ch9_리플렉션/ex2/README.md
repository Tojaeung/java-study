### [답변링크] (https://okky.kr/articles/1377946#note-1598045)

리플렉션에서 자주 사용하는 메소드 3대장이 있습니다.

// 1그룹
clazz.getConstructors();
clazz.getFields();
clazz.getMethods();

얘네들은 메소드 이름과 달리 public 생성자, public 필드, public 메소드만 반환합니다.

1그룹의 메소드와 비슷하게 "Declared"가 붙은 애들이 따로 있습니다.

// 2그룹
clazz.getDeclaredConstructors();
clazz.getDeclaredFields();
clazz.getDeclaredMethods();

얘네들은 public, protected, package private, private 가리지 않고 전부 반환합니다.

1그룹을 getPublicMethods(), 2그룹은 getAllMethods()와 같이 이름 붙였으면 좋았을텐데, 뭐 만든 애가 저렇게 지었으니 어쩔 수 없고...(20년 전에 jdk 1.1 시절에 들어간 기능이라 메소드 이름같은거 설렁설렁 지은 흔적이 좀 있음)

getDeclaredXXX() 를 호출해서 생성자, 필드, 메소드 정보를 가져올 수 있다고 해서 호출해서 쓸 수 있는건 아닙니다. public, private, static, final 같은 키워드들을 내부적으로 modifier 라고 부르는데 여기서 public modifier(숫자 1임)가 지정되어 있어야 리플렉션을 통해 생성자나 메소드를 실행할 수 있습니다.

그런데 나는 언어의 제약을 돌파해서 private 메소드(생성자)도 호출하고 싶다!

이럴때 setAccessible(true) 를 호출해서 modifier를 바꿔준 후 호출합니다.
