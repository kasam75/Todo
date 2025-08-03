package spring.todo.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class TodoResponseDto {
    private final Long id;

    private final String title;
    //일정 제목
    private final String detail;
    //일정 내용
    private final String name;
    //일정 작성자명
    private final LocalDateTime createdAt;
    //일정 작성/수정일
    private final LocalDateTime modifiedAt;
//
//    public TodoResponseDto(Long id, String title, String detail, String name, Double password, LocalDateTime createdAt, LocalDateTime modifiedAt) {
//        this.id = id;
//        this.title = title;
//        this.detail = detail;
//        this.name = name;
//        this.password = password;
//        this.createdAt = createdAt;
//        this.modifiedAt = modifiedAt;
//    }
}
//어찌하여 Demo는 this를 쓰지않고 4강에서는 this를 썼는지위에 RequiredArgsConstructor덕 인거 같은데 정확히 확인
//import java.time.LocalDateTime;와import java.util.Date;의 차이 처음 했을떄는 후자로 해서 안되서 찿아서 고침
//비밀번호 포함까지 삭제기능을 구현하는걸 알지모 돗하면서 알트엔터로 구현함