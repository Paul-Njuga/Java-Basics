class DrumKit {
	void playTopHat () {
		System.out.println("ding ding da-ding");
	}
	void playSnare() {
		System.out.println("bang bang ba-bang");
	}
}

class DrumKitTestDrive {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();
		d.playTopHat();
		d.playSnare();
	}
}
