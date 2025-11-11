public class Dropbox implements CloudStorageProvider {

    @Override
    public void storeFile(String name) {
        System.out.println("File stored on Dropbox: " + name);
    }

    @Override
    public String getFile(String name) {
        return "File retrieved from Dropbox: " + name);
    }
}
