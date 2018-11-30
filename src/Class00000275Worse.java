// original filename: 00016510.txt
// before
public class Class00000275Worse {
    public static boolean isSDKConfiguredFor(@NotNull final Module module) {
        final GlobalSearchScope scope = module.getModuleWithDependenciesAndLibrariesScope(false);
        return containsKotlinCompilerJar(FilenameIndex.getVirtualFilesByName(module.getProject(), KOTLIN_COMPILER_JAR, scope));
    }
}
