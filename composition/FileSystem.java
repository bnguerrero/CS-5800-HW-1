package CS5800HW1.composition;

public class FileSystem 
{
    public static void main(String[] args)
    {
        // creating all folders
        Folder php_demo1 = new Folder("php_demo1");
        Folder source_files = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publik = new Folder("public");
        Folder includePath = new Folder("Include Path");

        // organizing subfolders
        php_demo1.addSubFolder(source_files);
        source_files.addSubFolder(phalcon);
        source_files.addSubFolder(app);
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);
        source_files.addSubFolder(cache);
        source_files.addSubFolder(publik);
        php_demo1.addSubFolder(includePath);

        // creating all files
        File htaccess = new File(".htaccess", publik);
        File htrouter = new File(".htrouter.php", publik);
        File indexhtml = new File("index.html", publik);
        File remoteFiles = new File("Remote Files", php_demo1);

        // organizing files in their folders
        publik.addFile(htaccess);
        publik.addFile(htrouter);
        publik.addFile(indexhtml);
        php_demo1.addFile(indexhtml);
        php_demo1.addFile(remoteFiles);

        // display all files and subfolders
        php_demo1.display();
        System.out.println("\n");

        // delete folder app
        app.delete();
        php_demo1.display();



    }
}
