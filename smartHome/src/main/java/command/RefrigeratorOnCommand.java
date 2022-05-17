package command;

class RefrigeratorOnCommand implements Command {
  private Refrigerator mRefrigerator;

  public RefrigeratorOnCommand(Refrigerator refrigerator) {
  mRefrigerator=refrigerator;
  }

  @Override
  public void execute() {
      mRefrigerator.on();
  }

}