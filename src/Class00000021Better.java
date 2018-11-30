// original filename: 00027214.txt
// after
public class Class00000021Better {
    @Override
    protected void destroyHandles() {
        checkCudnn(cudnnDestroyTensorDescriptor(srcTensorDesc));
        checkCudnn(cudnnDestroyTensorDescriptor(dstTensorDesc));
        checkCudnn(cudnnDestroyTensorDescriptor(deltaTensorDesc));
        checkCudnn(cudnnDestroyTensorDescriptor(gammaBetaTensorDesc));
        super.destroyHandles();
    }
}
