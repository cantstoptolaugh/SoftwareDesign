package DeviceController;
class HeatingOffCommand implements Command {
  private Heating mHeating;

  public HeatingOffCommand(Heating heating) {
      mHeating=heating;
  }

  @Override
  public void execute() {
      mHeating.off();
  }
}
