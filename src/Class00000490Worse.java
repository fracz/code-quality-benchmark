// original filename: 00046661.txt
// after
public class Class00000490Worse {
    private Aeron.ClientContext newAeronContext() {
        Aeron.ClientContext ctx = new Aeron.ClientContext();
        ctx.counterLabelsBuffer(counterLabelsBuffer).counterValuesBuffer(counterValuesBuffer);
        return ctx;
    }
}
