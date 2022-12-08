package server.service;

import server.execution.*;

public interface FileBaseService {
	void addFile(File file);
    void deleteFile(int fileId);
    String getAllFiles();
    String searchFilesByKeywords(String request);
}
