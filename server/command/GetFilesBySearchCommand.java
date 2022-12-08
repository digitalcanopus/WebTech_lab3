package server.command;

import server.service.*;

public class GetFilesBySearchCommand implements Command {
	FileBaseService fileBaseService = ServiceProvider.getInstance().getFileBaseService();

    @Override
    public String execute(String request) {
        return fileBaseService.searchFilesByKeywords(request);
    }
}
