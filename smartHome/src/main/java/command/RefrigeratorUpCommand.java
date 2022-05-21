package command;

class RefrigeratorUpCommand implements Command {
  private Refrigerator mRefrigerator;

  public RefrigeratorUpCommand(Refrigerator refrigerator) {
  mRefrigerator=refrigerator;
  }

  @Override
  public void execute() {
      mRefrigerator.up();
  }

}