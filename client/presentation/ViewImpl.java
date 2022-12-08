package client.presentation;

import client.execution.*;

public class ViewImpl implements View{
	@Override
    public void print(File file) {
        System.out.println(file);
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
