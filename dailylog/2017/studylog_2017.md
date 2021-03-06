## Log directory for 2017

* 2017/03/20
    * 개발 툴 설치 (installTools.md)
* 2017/03/23
    * `Gradle 철저 입문` 교제 학습
    * 3장: 그레이들 시작 (完)
        * gradle/study/ch3/JAVA_PROJECT
        * gradle/study/ch3/WEB_PROJECT
    * 4장: 자바 프로젝트 빌드
        * 4.3. 자바프로젝트에 적용하기
            *  gradle/study/ch4/example_test
* 2017/03/24  
**So, Gradle is very difficult!!!**
    * `Gradle 철저 입문` 교제 학습
    * 4장: 자바 프로젝트 빌드
        * 4.3. 자바프로젝트에 적용하기
            * /gradle/study/ch4/example_test
        * 4.4. Java플러그인 상세 사항
        * 4.5. 규칙에 벗어난 프로젝트에 적용
            * gradle/study/ch4/integration_test
        * 4.6, 4.7 생략 
    * 5장: 그레이들 기초
        * 5.1. 그레이들의 빌드
        * 5.2. 아키텍쳐와 주요 기능
        * 5.3. 설정으로 자동으로 로드하기
* __2017/03/29__ `[13:00 ~ 16:43]`
    * 5장: 그레이들 기초
        * 5.4. 프로젝트 탐색
        * 5.5. 태스크 그래프
        * 5.6. 파일 조작
        * 5.7. 로그
    * 6장: 스크립트 파일 작성
        * 6.1. 스크립트 파일의 구조와 공통 요소
        * 6.2. 그레이들 도메인 객체
        * 6.3. 태스크 작성 `/6.3.2. 의존관계 설정 방법 dependsOn/`
* __2017/03/30__ `[14:55 ~ 17:00]`
    * 6장: 스크립트 파일 작성
        * 6.3. 태스크 작성
        * 6.4. 플러그인 작성
        * 6.5. 멀티프로젝트의 스크립트 파일 작성
* __2017/03/31__ `[13:07 ~ 16:36]`
    * 7장: 의존관계 정리        
        * 7.1. 의존관계 관리의 목적
        * 7.2. 의존관계 해결 자동화
        * 7.3. 전이적 의존관계 관리
        * 7.4. 사용중인 모듈 조사
        * 7.5. 캐시제어와 오프라인 실행
* __2017/04/07__ `[11:00 ~ 16:48]`
    * 8장: 그레이들에서의 테스트
        * 8.1. 테스트 자동화와 빌드 툴
        * 8.2. 그레이들을 이용한 접근법
        * 8.3. 그레이들의 테스트 자동화
        * 8.4. 테스트 관련 기타 기능
* __2017/04/10__ `[10:00 ~ ]`
    * 10장: 통합개발환경과의 연계
    * 11장 이후는 추후 케이브 발생 시 참조하는것으로 마침
    * Spring Batch 개발 환경 구축.
* __2017/04/17__ `[11:00 ~ 14:36]`
    * Spring Batch workspace directory 설정
    * workspace Java build path 설정
    * `build.gradle`에 dependency 추가
       ```gradle
        	// 2017/04/17 추가
	        compile 'org.apache.commons:commons-compress:1.13'
	        compile 'commons-logging:commons-logging:1.2'
	        compile 'commons-dbcp:commons-dbcp:1.4'
	        compile 'commons-pool:commons-pool:1.6'
	        compile 'commons-io:commons-io:2.5'
	        compile 'commons-collections:commons-collections:3.2.2'
	        compile 'org.springframework:spring-context:4.3.7.RELEASE'
	        compile 'org.quartz-scheduler:quartz:2.2.3'
      ```
* __2017/04/18__ `[ ~ ]`
    * Spring Batch 개발을 위한 환경 설정