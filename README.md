# 🛵 FLEXDELIVERY

>🎉 `플렉스딜리버리`를 소개합니다.<br>
>실생활에서 사용하고 있는 배달앱을 벤치마킹하여 배달 웹 개발을 목표로 진행하였으며 3가지 웹 사이트로 구성됩니다.</p>

1. <a href="https://github.com/2020-07-31/FLEXDELIVERY/tree/master/FlexDelivery/src/main/webapp/WEB-INF/views/member">order site</a><p> : 회원 가입, 로그인, 점포 조회, 장바구니, 쿠폰 발급, 주문/결제, 리뷰 작성, 마이페이지, 선물하기, 일대일문의, 오늘 뭐먹지?</p>
2. <a href="https://github.com/2020-07-31/FLEXDELIVERY/tree/master/FlexDelivery/src/main/webapp/WEB-INF/views/owner">owner site</a><p> : 사장님 가입, 로그인, 사장님 마이페이지, 입점 신청, 내가게 매출/현황 조회, 메뉴 등록/수정, 주문 처리 현황, 리뷰 관리, 쿠폰/광고 관리, 요청 처리 현황, 이벤트, 공지사항, 사장님 꿀 팁, 자주 묻는 질문, 일대일 문의</p>
3. <a href="https://github.com/2020-07-31/FLEXDELIVERY/tree/master/FlexDelivery/src/main/webapp/WEB-INF/views/admin">admin site</a><p> : 회원 관리, 점주 관리, 요청 현황, 메뉴  카테고리 관리, 쿠폰/광고 관리, 선물하기 관리, 공지사항/이벤트/사장님 꿀 팁 작성, 일대일 문의 답변</p>

## 🛵 기간 : 2021.01.11 ~ 2021.02.19 ( 6주 )
- 참여 인원 : 5명<br>
<!-- Table -->
|기간|내용|
|:--:|:--|
|1 ~ 2주차|기획 및 분석|
|3주차|DB설계 및 전반적인 UI 구현|
|4 ~ 5주차|기능 구현 및 테스트|
|6주차|디버깅 및 마무리 작업|
## 🛵 사용기술
* Front-End : Javascript, HTML5, CSS3, JQuery, Ajax, JSP, BootStrap <br>
* Back-End : Java, MyBatis, Oracle, Spring Tool Suite <br>
* Open API : import, SummerNote Editor, JAMES, POI, reCAPTCHA, datePicker, BCrypt, c3 <br>
* Tool : Apache Tomcat 9.0, Eclipse, Git, Github, SourceTree, STS <br>


## 🛵 내용
- 회원가입시 이메일 확인 처리 JAMES api이용, reCAPCHA로 무분별한 회원가입 방지, 도로명주소 api사용
- BCrypt로 비밀번호 암호화
- 주문(회원), 광고(점포) 결제 import api
- c3 차트로 사장님 페이지에서 매출 현황 조회, 관리자 운영 정보 조회 가능
- POI로 DB정보 엑셀로 다운로드 가능(관리자)
- ckEditor로 게시판 글 작성 가능
- datePickker로 리뷰로 기간별 조회 가능
- 회원 페이지에서 주문, 사장님 페이지에서 주문을 처리하는 프로세스 구현
- 회원이 작성한 리뷰 신고 처리 과정에서 관리자 승인 필요
- 게시판 페이징 처리, 점포 조회 시 스크롤 페이징 처리

___
## 역할 및 페이지 구성
#### ➡️ <a href="">사장님 사이트 메인 화면</a>
<img src="https://user-images.githubusercontent.com/69043412/109512488-7db54d80-7ae7-11eb-944c-8fd86f840129.png" alt="ownermain" width="600"><br>
#### ➡️ <a href="">입점 신청</a>
<img src="https://user-images.githubusercontent.com/69043412/109515133-164ccd00-7aea-11eb-9cbb-c5b7ed1e83a4.png" alt="launch" width="600"><br>
#### ➡️ <a href="">내가게 메인</a>
<img src="https://user-images.githubusercontent.com/69043412/109515408-6166e000-7aea-11eb-86a6-6fca0ae7ae5d.png" width="600"><br>
#### ➡️ <a href="">승인 현황 조회</a>
<img src="https://user-images.githubusercontent.com/69043412/109515399-5f048600-7aea-11eb-8d0d-c5410117684f.png" width="600"><br>
#### ➡️ <a href="">리뷰관리</a>
<img src="https://user-images.githubusercontent.com/69043412/109516574-b0614500-7aeb-11eb-949e-bb49adfa9fd3.png" alt="review" width="600"><br>
#### ➡️ <a href="">쿠폰 등록</a>
<img src="https://user-images.githubusercontent.com/69043412/109516649-c111bb00-7aeb-11eb-9267-a75436565176.png" alt="coupon" width="600"><br>
