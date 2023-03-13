package CS5800HW1.composition;

import java.util.ArrayList;

import java.util.Iterator;



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


    public void deleteSubFolder(Folder subFolder)
    {
        subFolders.remove(subFolder);
    }
    /* *
    public void delete()
    {
        for(Folder subFolder: subFolders)
        {
            subFolder.delete();
        }
        for(File file: files)
        {
            file.delete();
        }
    }
    */
    public void delete()
    {
        for (Folder subFolder : subFolders) 
        {
            subFolder.delete();
        }
        subFolders.clear();
        for (File file : files) 
        {
            file.delete();
        }
        files.clear();
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