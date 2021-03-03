package com.example.demo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Todo {
	private String todoId;
	private String desc;
	private Date targetDate;
	private boolean isDone;
	
	
	public String getDetails()
	{
		return "TODO ID: "+getTodoId()+" TODO DESC: "+getDesc()+" TODO TARGET DATE: "+getTargetDate()+" COMPLETED: "+isDone;
	}
}
