// original filename: 00027222.txt
// before
public class Class00000111Worse {
    void createHandles() {
        checkCudnn(cudnnCreate(this));
        checkCudnn(cudnnCreateTensorDescriptor(srcTensorDesc));
        checkCudnn(cudnnCreateTensorDescriptor(dstTensorDesc));
        checkCudnn(cudnnCreateTensorDescriptor(deltaTensorDesc));
        checkCudnn(cudnnCreateLRNDescriptor(lrnDesc));
    }
}
