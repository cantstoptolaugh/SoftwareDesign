package DeviceController;

class LedOffCommand implements Command {
  private Led mLed;

  public LedOffCommand(Led led) {
      mLed = led;
  }
  @Override
  public void execute() {
      mLed.off();
  }



}
