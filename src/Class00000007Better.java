// original filename: 00037128.txt
// after
public class Class00000007Better {
    private TraceContext getDefaultTraceContext() {
        ProfilerConfig profilerConfig = new DefaultProfilerConfig();
        TraceContext traceContext = MockTraceContextFactory.newTestTraceContext(profilerConfig);
        return traceContext;
    }
}
