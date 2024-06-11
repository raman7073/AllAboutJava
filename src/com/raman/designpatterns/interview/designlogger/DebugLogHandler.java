package com.raman.designpatterns.interview.designlogger;

public class DebugLogHandler extends LogHandler {
    public DebugLogHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(logLevel, message);
        }
    }

}
