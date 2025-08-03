package spring.todo.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TodoRequestDto {
    private Long id;
    //데이터 베이스에서 불러오는 아이디
    private String title;
    //일정 제목
    private String detail;
    //일정 내용
    private String name;
    //        일정 작성자명
    private String password;
    //페스워드
    private LocalDateTime createdAt;
    //일정 작성/수정일
    private LocalDateTime modifiedAt;
}

