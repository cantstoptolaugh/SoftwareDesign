package DeviceController;

class RefrigeratorOffCommand implements Command {
  private Refrigerator mRefrigerator;

  public RefrigeratorOffCommand(Refrigerator refrigerator) {
  mRefrigerator=refrigerator;
  }

  @Override
  public void execute() {
      mRefrigerator.off();
  }

}