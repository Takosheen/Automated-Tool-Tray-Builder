package com.example.automatedtooltraybuilder;

public class imageFolder {
    private  String path;
    private  String FolderName;
    private int numberOfPics = 0;
    private String firstPic;

    public imageFolder(){
    }
    public imageFolder(String path, String folderName) {
        this.path = path;
        FolderName = folderName;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }
    public void setFolderName(String folderName) {
        FolderName = folderName;
    }
    public String getFolderName() {
        return FolderName;
    }
    public void setNumberOfPics(int numberOfPics) {
        this.numberOfPics = numberOfPics;
    }
    public int getNumberOfPics() {
        return numberOfPics;
    }
    public void setFirstPic(String firstPic) {
        this.firstPic = firstPic;
    }
    public String getFirstPic() {
        return firstPic;
    }
    public void addpics(){
        this.numberOfPics++;
    }
}
