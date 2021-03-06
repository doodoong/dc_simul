package csmaCA;

public class Station {

	private boolean packetGeneration;
	private int packetGenerationTime;
	private int numTxPacket;
	private int totlalPacketDelay;
	private boolean ack;
	private boolean buffer;


	public Station() {
		this.packetGeneration = false;
		this.packetGenerationTime = 0;
		this.numTxPacket = 0;
		this.totlalPacketDelay = 0;
		this.ack = false;
		this.buffer = false;
	}

	// setter and updater
	public void setPacketGeneration(boolean packet) {
		packetGeneration = packet;
	}

	public void setPacketGenerationTime(int slotTime) {
		packetGenerationTime = slotTime;
	}

	public void updateNumTxPacket() {
		numTxPacket++;
	}

	public void updatePacketDelay(int slotTime) {
		totlalPacketDelay += (slotTime - packetGenerationTime);
	}

	public void waitingAck(boolean ack) {
		ack = ack;
	}

	public void setBuffer(boolean buffer) {
		buffer = buffer;
	}

	// getter
	public boolean getPacketGeneration() {
		return packetGeneration;
	}

	public int getPacketGenerationTime() {
		return packetGenerationTime;
	}

	public int getnumTxPacket() {
		return numTxPacket;
	}

	public int getPacketDelay() {
		return totlalPacketDelay;
	}
}
