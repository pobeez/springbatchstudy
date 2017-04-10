# 스프링배치 개발 환경 구축
## 사용도구
* eclipse 
    * eclipse java neon:4.6
    * STS:3.8.4
* java
    * 1.8.11
* gradle
    * 3.4.1
* Spring
    * Spring Framework:4.3.7
    * Spring Batch: 3.0.7

`Spring Framework Gradle 설정`
```gradle
dependencies {
    compile 'org.springframework:spring-context:4.3.7.RELEASE'
}
```  
`Spring Batch Gradle 설정`
```gradle
dependencies {
    compile 'org.springframework.batch:spring-batch-core:3.0.7.RELEASE'
}        
```

## 구축 방향
* 압축파일로 설치 파일 제공
* 별도의 설치 작업이 없이 압축파일을 특정 디렉토리 위치에 풀기만 하면 개발이 가능한 수준으로 구축
    * 설치 포함 툴
        * eclipse
        * JDK
        * STS(Springsource Tool Suite)
        * gradle
* 소스 저장소, 참조 저장소 고려

