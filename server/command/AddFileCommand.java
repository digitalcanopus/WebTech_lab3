package server.command;

import server.service.*;

public class AddFileCommand implements Command {
	FileBaseService fileBaseService = ServiceProvider.getInstance().getFileBaseService();

    @Override
    public String execute(String request) {
        String response;

        response = "file added.";

        // �������� ���� ����� ����� � ���� �������
        //fileBaseService.addFile();

        return response;
    }
}
