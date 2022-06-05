package DeviceController;

class LedOnCommand implements Command {
  private Led mLed;

  public LedOnCommand(Led led) {
       mLed = led;
  }
  @Override
  public void execute() {
      mLed.on();
  }

}
