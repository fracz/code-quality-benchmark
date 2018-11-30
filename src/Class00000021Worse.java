// original filename: 00027214.txt
// before
public class Class00000021Worse {
    void destroyHandles() {
        checkCudnn(cudnnDestroyTensorDescriptor(srcTensorDesc));
        checkCudnn(cudnnDestroyTensorDescriptor(dstTensorDesc));
        checkCudnn(cudnnDestroyTensorDescriptor(deltaTensorDesc));
        checkCudnn(cudnnDestroyTensorDescriptor(gammaBetaTensorDesc));
        checkCudnn(cudnnDestroy(this));
    }
}
