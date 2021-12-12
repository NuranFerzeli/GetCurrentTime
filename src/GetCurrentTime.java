import java.util.Date;

public class GetCurrentTime {

	public static void main(String[] args) {
		long ms = System.currentTimeMillis();
		long seconds = ms / 1000;
		long currentSeconds, currentMinutes, currentHours;
		currentSeconds = seconds % 60;
		currentMinutes = seconds / 60 % 60;
		currentHours = seconds / 60 / 60 % 24;
		System.out.println(currentHours + " : " + currentMinutes + " : " + currentSeconds);
	}
}
