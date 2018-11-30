// original filename: 00012521.txt
// before
public class Class00000453Worse {
    public LibraryEditor getLibraryEditor(Library library) {
        LibraryEditor libraryEditor = myLibrary2EditorMap.get(library);
        if (libraryEditor == null) {
            libraryEditor = new LibraryEditor(library);
            myLibrary2EditorMap.put(library, libraryEditor);
        }
        return libraryEditor;
    }
}
