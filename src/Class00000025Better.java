// original filename: 00027213.txt
// after
public class Class00000025Better {
    @Override
    protected void createHandles() {
        super.createHandles();
        checkCudnn(cudnnCreateTensorDescriptor(srcTensorDesc));
        checkCudnn(cudnnCreateTensorDescriptor(dstTensorDesc));
        checkCudnn(cudnnCreateTensorDescriptor(deltaTensorDesc));
        checkCudnn(cudnnCreateTensorDescriptor(gammaBetaTensorDesc));
    }
}
