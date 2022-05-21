package command;

class NoCommand implements Command {
  public NoCommand() {
  }

  @Override
  public void execute() {
      System.out.println("None");
  }

}
