package com.raman.designpatterns.interview.designlogger;

public class InfoLogHandler extends LogHandler {
    public InfoLogHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
