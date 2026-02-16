package it.corso;

public class ToDo {
	
	private final int id;
	private String task;
	private boolean done;
	
	
	public ToDo(int id, String task, boolean done) {
		this.id = id;
		this.task = task;
		this.done = done;
	}
	public int getId() {
		return id;
	}
	
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "ToDo [id=" + id + ", task=" + task + ", done=" + done + "]";
	}
	

}
