package compositeLaboratory;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent{
    private String name;
    private List<FileComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        components.add(component);
    }

    public void remove(FileComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileComponent component : components) {
            component.showDetails();
        }
    }

}
