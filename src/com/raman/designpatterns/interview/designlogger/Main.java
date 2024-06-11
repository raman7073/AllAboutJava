package com.raman.designpatterns.interview.designlogger;

public class Main {

    public static void main(String[] args) {
        LogHandler logHandler = new InfoLogHandler(new DebugLogHandler(new ErrorLogHandler(null)));
        logHandler.log(LogHandler.ERROR, "Exception thrown");
        logHandler.log(LogHandler.DEBUG, "Debug please");
        logHandler.log(LogHandler.INFO, "Info");
    }
}
