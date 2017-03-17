# Spring Batch Study

### 프로젝트 목적"
* Spring Batch, Gradle, Git에 대한 이용방법을 숙지한다.
* 위 기반 지식을 기반으로 Spring Batch Framework 개발도구 생성을 완료한다.
* Spring Batch를 실행할 수 있는 실행환경을 생성한다.
* 개발에 필요한 Repository를 생성한다.
* 개발한 Spring Batch 배포 도구를 생성한다.

### 개발/배포/실행 환경"
* 개발 환경
    * IDE: eclipse
    * 개발 도구: Spring Batch
    * 빌드 도구: Gradle
    * 레포지토리: Git
* 서버 실행 환경
    * OS: Linux
    * Platform : Java
* 배포 환경
    * 배포 툴: Jenkins

### 프로젝트 수행 방안"
**<u>시간이 소요되더라도 조급함을 가지지 말고 빠짐 없이 목표를 이루도록 한다.</u>**
1. 개발 툴 학습
    * Spring Batch
        * 사용도구
             * eclipse Neon(4.6)
             * STS(3.8.4)
             * java(1.8)
        * 참고서적
            * Pro Spring Batch (Michael Minella)
            * Spring Batch Reference Guide (Lucas Ward)
    * Gradle
        * 사용도구
            * eclipse Neon(4.6)
            * Gradle(3.4.0)
        * 참고서적
            * Gradle 철저 입문 (와타비키 타쿠마)
    * __*<font color="red">개발 툴 학습 단계</font>*__
        1. 개발도구 설치
            * eclipse 설치
            * STS 설치
            * Gradle 설치
            * Spring Batch sample 프로젝트 생성`(import)`
            * mySql 설치
        2. 학습 방안
            * DBtoDB Batch Job을 개발하면서
            * 빌드에 필요한 build.gradle 작성 `<= Gradle 학습`
            * Batch Job Coding `<= Spring Batch 학습`
            * 실행환경 설정 `<= 개발 환경 설정 학습`
        3. 학습 방식
            * 사무실에서 학습(집에서는 학습 하지 않음)
            * 운영 피크 기간(1~3)을 제외하고는 월~금 학습
            * 하루 최소 1시간 학습
            * 2017/03/20 부터 시작
            * <u><font color="blue">매출 학습한 내용 및 소스는 github에 push 必</font></u>
2. 서버 실행 환경 학습
    * 개발 툴 학습 완료 후에 방안 수립
3. 배포 환경 학습
    * 서버 실행 환경 학습 완료 후에 방안 수립

