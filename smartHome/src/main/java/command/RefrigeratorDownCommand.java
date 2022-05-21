package command;

class RefrigeratorDownCommand implements Command {
  private Refrigerator mRefrigerator;

  public RefrigeratorDownCommand(Refrigerator refrigerator) {
  mRefrigerator=refrigerator;
  }

  @Override
  public void execute() {
      mRefrigerator.down();
  }

}
