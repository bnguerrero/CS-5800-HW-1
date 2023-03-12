package CS5800HW1.composition;

import java.util.ArrayList;


public class Folder 
{
    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;
    

    public Folder(String name)
    {
        this.name = name;
    }

    public void addSubFolder(Folder subFolder)
    {
        this.subFolders.add(subFolder);
    }

    public void addFile(File file)
    {
        this.files.add(file);
    }
    public void deleteSubFolders()
    {
        for(int i = 0; i< subFolders.size(); i++)
        {
            subFolders.remove(i);
        }
    }
    public void deleteFile()
    {
        for(int i = 0; i< subFolders.size(); i++)
        {
            files.remove(i);
        }
    }

}
