package command;
class HeatingOnCommand implements Command {
  private Heating mHeating;

  public HeatingOnCommand(Heating heating) {
      mHeating=heating;
  }

  @Override
  public void execute() {
      mHeating.on();
  }
}
