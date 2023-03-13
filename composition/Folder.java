package CS5800HW1.composition;

import java.nio.file.Files;
import java.util.ArrayList;


public class Folder 
{
    private String folderName;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;
    

    public Folder(String folderName)
    {
        this.folderName = folderName;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
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

    public void display()
    {
        System.out.println(folderName);
        for(Folder subFolder: subFolders)
        {
            subFolder.display();
        }
        for(File file: files)
        {
            file.display();
        }

    }
}
