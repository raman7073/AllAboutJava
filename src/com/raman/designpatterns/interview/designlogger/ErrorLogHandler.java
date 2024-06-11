package com.raman.designpatterns.interview.designlogger;

public class ErrorLogHandler extends LogHandler {
    public ErrorLogHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
