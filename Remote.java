public class Remote {

	int C;
	int V;
	private boolean on = false;

	public Remote() {
		this.C = 1;
		this.V = 1;
		this.on = false;

	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int C) {
		if (on == true) {
			this.C = C;

		}
	}

	public void setVolume(int V) {
		if (on == true) {

			this.V = V;
		}
	}

	public void VolumeUp() {
		if (on == true) {
			V += 1;
		}
	}

	public void ChannelUp() {
		if (on == true) {
			C += 1;
		}
	}

	public void ChannelDown() {
		if (on == true) {
			C -= 1;
		}
	}

	public void VolumeDown() {
		if (on == true) {
			V -= 1;
		}

	}
}
