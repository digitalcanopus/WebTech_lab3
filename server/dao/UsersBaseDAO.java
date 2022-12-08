package server.dao;

import server.execution.*;

import java.util.HashMap;

public interface UsersBaseDAO {
	HashMap<String, User> readUsersFromXml();
    HashMap<String, User> parseXmlToTheListOfUsers(String xml);
    void writeUsersToXml();
    HashMap<String, User> getUsers();
    String getXmlElementCustom(User user);
    String getXmlDocument(HashMap<String, User> users);
    byte[] encryptUserPassword(String password);
    String decryptUserPassword(String bytesArrayInString);
    byte[] getBytesArrayFromString(String password);
}
