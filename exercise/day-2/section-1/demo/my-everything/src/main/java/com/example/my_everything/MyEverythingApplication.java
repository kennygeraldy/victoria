package com.example.my_everything;

import com.example.my_everything.request.CreateTaskRequest;
import com.example.my_everything.request.UpdateTaskRequest;
import com.example.my_everything.response.CreateTaskResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@SpringBootApplication
public class MyEverythingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEverythingApplication.class, args);
	}

	private List<CreateTaskResponse> tasks = new ArrayList<>();

//	Create new task
	@PostMapping("/tasks")
	public ResponseEntity<List<CreateTaskResponse>> createTask(
			@RequestBody CreateTaskRequest request) {

//		Set the status as To Do by default, and making sure other requried data is filled in
		String status = request.getStatus() != null ? request.getStatus() : "To Do";

		if (request.getName() != null && request.getDescription() != null) {
			tasks.add(CreateTaskResponse.builder().id((long) tasks.size()+1).name(request.getName()).description(request.getDescription()).status(status).build());
		}

//Return response for creating new task
		return new ResponseEntity<>(tasks, HttpStatus.OK);
	}

//	Patch task by certain Id
	@PatchMapping("/tasks/{id}")
	public ResponseEntity<List<CreateTaskResponse>> updateTask(
			@RequestBody UpdateTaskRequest request,
			@PathVariable("id") Long id
	){

//		Checking the task
		for(CreateTaskResponse task : tasks) {
			if(task.getId()==id){
				task.setStatus(request.getStatus());
			}
		}

//		Return response for updating task
		return new ResponseEntity<>(tasks, HttpStatus.OK);
	}

//	Get all task
	@GetMapping("/tasks")
	public List<CreateTaskResponse> getAllTask(
			@RequestParam(name = "page", required = false, defaultValue = "1") int page,
			@RequestParam(name = "size", required = false, defaultValue = "3") int size
	){
		int start = (page - 1) * size;
		int end = Math.min(start + size, tasks.size());

		if (start >= tasks.size()) {
			return new ArrayList<>();
		}

		return tasks.subList(start, end);
	}

//	Get task by Id
	@GetMapping("/tasks/{id}")
	public ResponseEntity<CreateTaskResponse> getTaskById(
			@PathVariable Long id) {

		for (CreateTaskResponse task : tasks) {
			if (task.getId().equals(id)) {
				return new ResponseEntity<>(task, HttpStatus.OK);
			}
		}

		// Return 404 if task not found
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

//	Delete task by id
	@DeleteMapping("/tasks/{id}")
	public ResponseEntity<List<CreateTaskResponse>> deleteTaskById(
			@PathVariable Long id) {

		boolean removed = tasks.removeIf(task -> task.getId().equals(id));

		if (removed) {
			return new ResponseEntity<>(tasks, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}

