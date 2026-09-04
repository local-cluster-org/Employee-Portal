import java.io.File;
import java.nio.file.Files;

public class FileService {

    public byte[] readFile(String fileName) throws Exception {
        File file = new File("/var/data/" + fileName);
        return Files.readAllBytes(file.toPath());
    }
}
