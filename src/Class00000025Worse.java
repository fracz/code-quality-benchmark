// original filename: 00027213.txt
// before
public class Class00000025Worse {
    void createHandles() {
        checkCudnn(cudnnCreate(this));
        checkCudnn(cudnnCreateTensorDescriptor(srcTensorDesc));
        checkCudnn(cudnnCreateTensorDescriptor(dstTensorDesc));
        checkCudnn(cudnnCreateTensorDescriptor(deltaTensorDesc));
        checkCudnn(cudnnCreateTensorDescriptor(gammaBetaTensorDesc));
    }
}
