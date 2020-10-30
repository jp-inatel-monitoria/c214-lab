package model.entities;

public class Logger {
	
	private Logger () {}
	
	private static Logger instance;
	
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	public void println(String msg) {
		System.out.println(msg);
	}
	
}
