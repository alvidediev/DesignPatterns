package ru.dediev.oop.patterns.behavioral.chainOfResponsebility;

public class ChainOfResponsibilityRunner {
    public static void main(String[] args) {
        Logger logger, logger1,logger2;
        logger = new StdOutLogger(Logger.DEBUG);
        logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
        logger2 = logger1.setNext(new StdErrLogger(Logger.ERR));

        logger.message("Entering function y.", Logger.DEBUG);
        logger.message("Step1 completed.", Logger.NOTICE);
        logger.message("An error has occurred.", Logger.ERR);
    }
}
