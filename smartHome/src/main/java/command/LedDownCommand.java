package command;

class LedDownCommand implements Command {
  private Led mLed;

  public LedDownCommand(Led led) {
       mLed = led;
  }
  @Override
  public void execute() {
      mLed.down();
  }

}
