// Java标准库提供的日志
package javaException;

import java.util.logging.Logger;
import java.util.logging.Level;

public class javaLogging {
    public static void main(String[] args) {

        Logger logger = Logger.getGlobal();
        logger.info("info---start process...");
        logger.warning("warn---memory is running out...");
        logger.fine("fine---ignored.");
        logger.severe("term---process will be terminated...");
    }
}
