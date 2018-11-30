// original filename: 00005779.txt
// before
public class Class00000010Worse {
    public VirtualFile getProjectFile() {
        if (myFilePointer == null)
            return null;
        VirtualFile file = myFilePointer.getFile();
    /* commented out to fix # 25591
    if (file == null){
      //???
      return ApplicationManager.getApplication().runWriteAction(new Computable<VirtualFile>() {
        public VirtualFile compute() {
          return VirtualFileManager.getInstance().refreshAndFindFileByUrl(myFilePointer.getUrl());
        }
      });
    }
    */
        return file;
    }
}
