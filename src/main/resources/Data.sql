INSERT INTO student (student_id, student_name, birth, address, phone, dept, entrance_date) VALUES
('20241101', '홍길동', '2005-05-15', '서울시 강남구', '010-1234-5678', '컴퓨터공학과', '2024-03-04'),
('20241102', '이순신', '2005-02-28', '서울시 서초구', '010-2345-6789', '컴퓨터공학과', '2024-03-04'),
('20241103', '김철수', '2005-07-20', '서울시 송파구', '010-3456-7890', '컴퓨터공학과', '2024-03-04'),
('20241104', '이영희', '2004-03-10', '경기도 수원시', '010-4567-8901', '컴퓨터공학과', '2024-03-04'),
('20241105', '박민수', '2005-01-05', '경기도 용인시', '010-5678-9012', '컴퓨터공학과', '2024-03-04'),
('20241106', '정진영', '2005-09-28', '경기도 성남시', '010-6789-0123', '컴퓨터공학과', '2024-03-04'),
('20241107', '이지은', '2005-08-15', '서울시 강동구', '010-7890-1234', '컴퓨터공학과', '2024-03-04'),
('20241108', '김영수', '2005-11-12', '서울시 강서구', '010-8901-2345', '컴퓨터공학과', '2024-03-04'),
('20241109', '장호준', '2005-02-10', '서울시 영등포구', '010-9012-3456', '컴퓨터공학과', '2024-03-04');

INSERT INTO teacher (teacher_id, teacher_name, birth, address, phone, dept, hire_date, retire_date)
VALUES
('A23753', '이철수', '1980-05-15', '서울시 강남구', '010-2364-5234', '컴퓨터공학과', '2017-08-04', NULL),
('A24502', '김영수', '1975-08-28', '서울시 서초구', '010-2554-3251', '컴퓨터공학과', '2018-03-02', NULL),
('A43502', '박민수', '1982-03-20', '서울시 송파구', '010-3263-1264', '컴퓨터공학과', '2021-08-03', NULL),
('A63452', '정지원', '1978-11-10', '서울시 강동구', '010-1507-8771', '컴퓨터공학과', '2021-03-04', NULL),
('A49234', '이미경', '1985-02-05', '서울시 서대문구', '010-5235-5012', '컴퓨터공학과', '2020-03-05', NULL),
('A44563', '김영진', '1974-09-28', '서울시 종로구', '010-6134-0623', '컴퓨터공학과', '2018-07-06', NULL),
('A85052', '이지수', '1988-07-20', '서울시 강서구', '010-2051-1214', '컴퓨터공학과', '2019-06-01', NULL),
('A34566', '김철수', '1976-11-12', '서울시 구로구', '010-8901-2235', '컴퓨터공학과', '2021-03-04', NULL),
('A37454', '이준석', '1983-06-25', '서울시 영등포구', '010-9054-1236', '컴퓨터공학과', '2023-03-09', NULL),
('A27464', '박지원', '1987-04-18', '서울시 마포구', '010-1234-5467', '컴퓨터공학과', '2018-03-02', NULL),
('A49645', '고길동', '1979-10-30', '서울시 동작구', '010-3534-2678', '컴퓨터공학과', '2021-03-11', NULL),
('A36451', '김우진', '1981-01-15', '서울시 관악구', '010-1734-2359', '컴퓨터공학과', '2018-03-02', NULL),
('A82612', '장성호', '1972-12-05', '서울시 강북구', '010-3754-2390', '컴퓨터공학과', '2021-03-13', NULL),
('A21230', '최성철', '1970-07-08', '서울시 성북구', '010-4123-8528', '컴퓨터공학과', '2021-03-04', NULL),
('A45233', '한영훈', '1984-09-12', '서울시 도봉구', '010-8578-4612', '컴퓨터공학과', '2021-03-15', NULL),
('A13643', '박성호', '1986-11-23', '서울시 노원구', '010-2689-0823', '컴퓨터공학과', '2019-03-02', NULL),
('A42003', '최성철', '1989-03-07', '서울시 중랑구', '010-7376-1244', '컴퓨터공학과', '2019-08-03', NULL),
('A62543', '김성민', '1982-05-28', '서울시 성동구', '010-8345-7845', '컴퓨터공학과', '2021-08-02', NULL),
('A43457', '정성호', '1977-08-19', '서울시 강남구', '010-9232-3626', '컴퓨터공학과', '2021-08-11', NULL),
('A30253', '홍성철', '1973-02-14', '서울시 서초구', '010-6543-2237', '컴퓨터공학과', '2017-08-20', NULL);



INSERT INTO subject (subject_name, teacher_id, class_room, day, start_time, end_time, max_student, credit)
VALUES
('컴퓨터 구조', 'A23753', 101, 'MON', '09:00:00', '11:00:00', 25, 3),
('알고리즘', 'A24502', 102, 'TUE', '10:00:00', '12:00:00', 25, 3),
('자료구조', 'A43502', 103, 'WED', '09:00:00', '11:00:00', 30, 3),
('네트워크', 'A63452', 104, 'THU', '14:00:00', '16:00:00', 30, 3),
('소프트웨어공학', 'A49234', 105, 'FRI', '16:00:00', '18:00:00', 30, 3),
('웹 개발', 'A44563', 201, 'MON', '09:00:00', '11:00:00', 25, 3),
('보안 공학', 'A85052', 202, 'TUE', '10:00:00', '12:00:00', 25, 3),
('빅데이터 분석', 'A34566', 203, 'WED', '13:00:00', '15:00:00', 25, 3),
('인공지능', 'A37454', 204, 'MON', '14:00:00', '16:00:00', 30, 3),
('웹 프로그래밍', 'A27464', 205, 'FRI', '16:00:00', '18:00:00', 30, 3),
('데이터베이스', 'A49645', 101, 'MON', '13:00:00', '15:00:00', 25, 3),
('컴퓨터 보안', 'A36451', 102, 'TUE', '13:00:00', '15:00:00', 25, 3),
('시스템 설계', 'A82612', 103, 'WED', '13:00:00', '15:00:00', 30, 3),
('암호학', 'A21230', 104, 'THU', '09:00:00', '11:00:00', 30, 3),
('클라우드 컴퓨팅', 'A45233', 105, 'FRI', '09:00:00', '11:00:00', 30, 3),
('소프트웨어 엔지니어링', 'A13643', 201, 'MON', '16:00:00', '18:00:00', 25, 3),
('웹 보안', 'A42003', 202, 'TUE', '14:00:00', '16:00:00', 25, 3),
('프로그래밍 언어', 'A62543', 203, 'WED', '10:00:00', '12:00:00', 30, 3),
('시스템 분석', 'A43457', 204, 'THU', '14:00:00', '12:00:00', 30, 3),
('게임 프로그래밍', 'A30253', 205, 'FRI', '10:00:00', '12:00:00', 30, 3);

INSERT INTO apply (student_id, subject_id) VALUES
('20241101', 1),
('20241102', 2),
('20241103', 5);



INSERT INTO grade (student_id, subject_id, score, grade, complete) VALUES
('20241101', 1, 80, 'B', 'P'),
('20241102', 2, 90, 'A', 'P'),
('20241103', 5, 40, 'F', 'NP');