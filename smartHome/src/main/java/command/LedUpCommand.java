package command;

class LedUpCommand implements Command {
  private Led mLed;

  public LedUpCommand(Led led) {
       mLed = led;
  }
  @Override
  public void execute() {
      mLed.up();
  }

}
