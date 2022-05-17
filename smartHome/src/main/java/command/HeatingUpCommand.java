package command;

class HeatingUpCommand implements Command {

  private Heating mHeating;

  public HeatingUpCommand(Heating heating) {
      mHeating = heating;
  }

  @Override
  public void execute() {
      mHeating.down();
  }

}
