package server.command;

import server.service.*;

public class GetAllFilesCommand implements Command {
	private final FileBaseService fileBaseService = ServiceProvider.getInstance().getFileBaseService();

    @Override
    public String execute(String request) {
        return fileBaseService.getAllFiles();
    }
}
