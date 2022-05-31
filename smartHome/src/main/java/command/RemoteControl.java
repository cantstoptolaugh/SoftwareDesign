package command;

import java.util.ArrayList;
import java.util.List;

class RemoteControl {
  private final int MAX_COMMANDS = 3;
  private List<Command> mOnCommand; // on 명령 저장
  private List<Command> mOffCommand; // off 명령 저장

  
  public RemoteControl() {
      mOnCommand = new ArrayList<Command>(MAX_COMMANDS); 
      mOffCommand = new ArrayList<Command>(MAX_COMMANDS);
       
      Command noCommand = new NoCommand(); //초기상태
      for(int i=0;i<MAX_COMMANDS;i++) {
          mOnCommand.add(i, noCommand); // on 명렁 리스트 초기화
          mOffCommand.add(i, noCommand); // off 명렁 리스트 초기화
      }
  }

  public void setOnOffCommand(int slot, Command onCommand, Command offCommand) {
       mOnCommand.add(slot, onCommand);
       mOffCommand.add(slot, offCommand);
  }


  public void onButtonWasPushed(int slot) {
      mOnCommand.get(slot).execute();
  }

  public void offButtonWasPushed(int slot) {
       mOffCommand.get(slot).execute();
  }


   @Override
 public String toString() {
      StringBuilder output = new StringBuilder();
      output.append("\n---- Remote Control ----\n");
      for(int i=0; i<MAX_COMMANDS;i++) {
          output.append("[slot" + i + "]" + mOnCommand.get(i).getClass().getName() + ", " 
                  + mOffCommand.get(i).getClass().getName()  + "\n");

      }
      return output.toString();
  }
}
