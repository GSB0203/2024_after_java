package untitled.src.day4;

class MyTv2_1 {
  int temp;
  int preChannel;
  boolean isPowerOn;
  int channel;
  int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  public boolean getIsPowerOn() {
    return isPowerOn;
  }

  public void setIsPowerOn(boolean powerOn) {
    isPowerOn = powerOn;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    temp = preChannel;
    this.channel = channel;
    preChannel = channel;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public void gotoPrevChannel() {
    setChannel(temp);
  }
}

public class exercise7_11 {
  public static void main(String[] args) {
    MyTv2_1 t = new MyTv2_1();

    t.setChannel(10);
    System.out.println("CH:" + t.getChannel());
    t.setChannel(20);
    System.out.println("CH:" + t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:" + t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:" + t.getChannel());
    t.gotoPrevChannel();
    t.gotoPrevChannel();
    System.out.println("CH:" + t.getChannel());
  }
}
