// original filename: 00037677.txt
// before
public class Class00000225Worse {
    private void addServerInterceptor(ProfilerPluginSetupContext context, JettyConfiguration config) {
        context.addClassFileTransformer("org.eclipse.jetty.server.Server", PinpointClassFileTransformers.addInterceptor("com.navercorp.pinpoint.plugin.jetty.interceptor.ServerHandleInterceptor", va(config.getJettyExcludeUrlFilter())));
    }
}
