package com.api.projectservice.service;

import java.util.List;

import com.api.projectservice.model.Task;
import com.api.projectservice.model.TaskStatus;

public interface TaskService {

  Task createTask(Task task, String requesterRole) throws Exception;

  Task getTaskById(Long id) throws Exception;

  List<Task> getAllTask(TaskStatus status);

  Task updateTask(Long id, Task updatedTask, Long userId) throws Exception;

  void deleteTask(Long id);

  Task assignedToUser(Long userId, Long taskId) throws Exception;

  List<Task> assignedUsrTask(Long userId, TaskStatus status);

  Task completeTask(Long taskId) throws Exception;

}
