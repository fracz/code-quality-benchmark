// original filename: 00012188.txt
// before
public class Class00000351Worse {
    private List<Repository> initRepositories(String... names) {
        return ContainerUtil.map(names, new Function<String, Repository>() {

            @Override
            public Repository fun(String s) {
                return initRepository(s);
            }
        });
    }
}
