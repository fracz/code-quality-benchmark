// original filename: 00027222.txt
// after
public class Class00000111Better {
    @Override
    protected void createHandles() {
        super.createHandles();
        checkCudnn(cudnnCreateTensorDescriptor(srcTensorDesc));
        checkCudnn(cudnnCreateTensorDescriptor(dstTensorDesc));
        checkCudnn(cudnnCreateTensorDescriptor(deltaTensorDesc));
        checkCudnn(cudnnCreateLRNDescriptor(lrnDesc));
    }
}
