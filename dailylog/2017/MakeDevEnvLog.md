# Spring Batch 개발 도구 설정
## 설치 도구 목록
* Eclipse JEE neon `[4/11] java => jee로 변경`
    * Plug in list
        * STS (Springsource Tool Suite)
        * Gradle Edit
        * eclipse color theme
* Gradle
* JDK
## 설치도구 디렉토리 구조
* C:\ `개발에 용이할 수 있도록 C drive로 설정`
    * SpringBatchIDE
        * .gradle `gradle user directory`
        * eclipse `eclipse Java EE`
        * gradle-3.4.1
        * jdk1.8.0_111
        * workspace

## workspace 디렉토리 구조
### 기본 구조
* .metadata
* SPRING_BATCH
    * __build__
        * classes
        * test-classes
    * __shell__
    * __src__
        * main
            * java
            * resources
                * jobs
                * sqls
                    * mysql
                    * oracle
        * test
                * java
                * resources
### 디렉토리 별 설명
| 디렉토리                      | 용도                                       | 비고   |
| ------------------------- | ---------------------------------------- | ---- |
| **build**                 | 빌드 결과물 저장 디렉토리                           |      |
| *build/classes*           | **main 컴파일 target 디렉토리** . java classes, resources(jobs, sql파일 등) |      |
| *build/test-classes*      | **테스트용 target 디렉토리**, java classes, resources(jobs, sql파일 등) |      |
| **shell**                 | 배치 실행 용 shell 디렉토리                       |      |
| **src**                   | Spring Batch 소스 디렉토리                     |      |
| *src/main*                | 소스 디렉토리 root                             |      |
| *src/main/java*           | java 소스 파일                               |      |
| *src/main/resources*      | java 소스 외에 모든 파일 들                       |      |
| *src/main/resources/jobs* | Spring Batch Job xml 파일, 업무 구분에 따른 서브 디렉토리를 생성할 수 있음. |      |
| *src/main/resources/sqls* | 쿼리 파일, DBMS의 종류에 따른 서브디렉토리 생성, DBMS 별 서브 디렉토리에 업무별 서브 디렉토리 생성 가능 함. |      |
| *src/test*                | 테스트 소스 디렉토리 root                         |      |
| *src/test/java*           | 테스트 용 java 소스 디렉토리                       |      |
| *src/test/resources*      | 테스트 용 리소스 디렉토리                           |      |

