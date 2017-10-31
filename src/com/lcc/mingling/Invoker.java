package com.lcc.mingling;

/**
 * 执行者
 */
public class Invoker {
    // 调用者持有一个命令对象
    Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    // 执行命令
    public void excuteCommmand() {
        command.excute();
    }

    // 撤销命令
    public void undoCommand() {
        command.unDo();
    }

}
