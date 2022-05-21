package command;

class HeatingDownCommand implements Command {
  private Heating mHeating;

  public HeatingDownCommand(Heating heating) {
      mHeating=heating;
  }

  @Override
  public void execute() {
      mHeating.down();
  }

}
