// original filename: 00012521.txt
// after
public class Class00000453Better {
    public LibraryEditor getLibraryEditor(Library library) {
        LibraryEditor libraryEditor = myLibrary2EditorMap.get(library);
        if (libraryEditor == null) {
            libraryEditor = createLibraryEditor(library);
        }
        return libraryEditor;
    }
}
