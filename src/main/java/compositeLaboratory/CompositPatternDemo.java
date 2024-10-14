package compositeLaboratory;

public class CompositPatternDemo {
    public static void main(String[] args) {
        // Crear archivos
        FileComponent file1 = new File("Document.txt");
        FileComponent file2 = new File("Image1.png");
        FileComponent file3 = new File("Image2.png");

        // Crear carpetas y agregar archivos
        Folder folder1 = new Folder("Root");
        Folder folder2 = new Folder("Images");

        folder1.add(file1);
        folder2.add(file2);
        folder2.add(file3);
        folder1.add(folder2);

        // Mostrar detalles
        folder1.showDetails();
    }
}
