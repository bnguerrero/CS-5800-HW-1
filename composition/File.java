package CS5800HW1.composition;

public class File 
{
    private String fileName;
    private Folder folder;

    public File(String fileName, Folder folder)
    {
        this.fileName = fileName;
        this.folder = folder;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void delete()
    {
        folder.delete();
    }

    public void display()
    {
        System.out.println(fileName);
    }
}
