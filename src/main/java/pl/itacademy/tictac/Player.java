import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Player {
public String name;
private String password;
protected Statistic statistic;
protected char X,O;

//private Map<String,String> playersList = new HashMap<>();
Scanner input = new Scanner(System.in);

public Player(String name) {
	this.name = name;
}
public Player(String name, String password) {
	this.name=name;
	this.password=password;
}
public void register() {	
}
public void login() {
}
public Statistic viewOwnStatic() {
	return statistic;
}
public void createGame() {
}
public void leaveGame() {
}
public void move() {
}
}
