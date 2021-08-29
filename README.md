@Controller
public @ResponseBody User info(@RequestBody User user){}

@ResponseBody

Json 형식으로 http body에 실어 보낸다.

@RequestBody

http request의 body 접근.

@RequestParam('userName') String username

uri의 params에 접근.

@RestController
= @Controller + @ResponseBody

@RequestMapping("/")

router와 같이 사용될 수 있다
uri 분기

@GetMapping("/")

@PostMapping("/")

@PutMapping("/")

gradle 프로젝트 루트 경로에서

gradle tasks

build.gradle 플러그인 설정

gradle build 명령어 : 프로젝트 빌드

위의 그래들 빌드 명령을 실행하면 build/libs/ 디렉터리 밑에 jar 파일이 생성된다.

classes : 프로젝트의 컴파일된 .class 파일
reports : 빌드에 의해 생성된 레포트가 존재 (test에 대한 수행 결과)
libs : 조립된 프로젝트 라이브러리 파일

---

의존성 관리

build.gradle 파일

---

실행

gradle bootRun
