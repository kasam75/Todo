package spring.todo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spring.todo.dto.TodoRequestDto;
import spring.todo.dto.TodoResponseDto;
import spring.todo.service.TodoService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/todos")
    public TodoResponseDto createTodo(@RequestBody TodoRequestDto todoRequestDto) {
        return todoService.save(todoRequestDto);
    }// 데이터 세이브 미구현

    @GetMapping("/todos")
    public List<TodoResponseDto> getTodos() {
        return todoService.findAll();
        //전체조회  미구현
    }

    @GetMapping("/todos/{todoId}")
    public TodoResponseDto getTodo(
            @PathVariable Long todoId
    ) {
        return todoService.findTodo(todoId);
        //단건조회 미구현
    }

    @PutMapping("/todos/{todoId}")
    public TodoResponseDto updateTodo(
            @RequestBody TodoRequestDto todoRequestDto,
            @PathVariable Long todoId
    ) {
        return todoService.update(todoId, todoRequestDto);
        //수정 미구현
    }

    @DeleteMapping("/todos/{todoId}")
    public void deleteTodo(
            @PathVariable Long todoId, String password
    ) {
        todoService.deleteTodo(todoId, password);
    }
}
//삭제 미구현
