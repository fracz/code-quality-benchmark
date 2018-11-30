// original filename: 00058306.txt
// after
public class Class00000635Worse {
    /*
      /**********************************************************
      /* Test methods
      /**********************************************************
       */
    public void testOuterBean() throws Exception {
        ModelResolver modelResolver = modelResolver();
        ModelConverterContextImpl context = new ModelConverterContextImpl(modelResolver);
        ;
        Model model = context.resolve(OuterBean.class);
        assertNotNull(model);
    }
}
