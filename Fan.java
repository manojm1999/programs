package corejava;

public class Fan {

	public static void main(String[] args) {
		Fan.TurnOn();
		Fan.TurnOff();
		Fan.IncrementFanSpeed();
		Fan.DecrementFanSpeed();
		

	}
	public static void TurnOn() {
		System.out.println("Fan Turned On");
	}
	public static void TurnOff() {
		System.out.println("Fan Turned Off");
	}
	public static void IncrementFanSpeed() {
		System.out.println("Fan Speed Incremented");
	}
	public static void DecrementFanSpeed() {
		System.out.println("Fan Speed Decremented");
	}
}
