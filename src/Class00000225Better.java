// original filename: 00037677.txt
// after
public class Class00000225Better {
    private void addServerInterceptor(ProfilerPluginSetupContext context, JettyConfiguration config) {
        final TransformCallback transformCallback = PinpointClassFileTransformers.addInterceptor("com.navercorp.pinpoint.plugin.jetty.interceptor.ServerHandleInterceptor", va(config.getJettyExcludeUrlFilter()));
        context.addClassFileTransformer("org.eclipse.jetty.server.Server", transformCallback);
    }
}
