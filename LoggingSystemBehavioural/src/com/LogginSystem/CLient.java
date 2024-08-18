package com.LogginSystem;

public class CLient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

       
        Command infoCommand = new LogCommand(infoHandler);
        Command debugCommand = new LogCommand(debugHandler);
        Command errorCommand = new LogCommand(errorHandler);

        
        Logger logger = new Logger();
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand);
        logger.addCommand(errorCommand);

        
        logger.processCommands();
    }

	}


