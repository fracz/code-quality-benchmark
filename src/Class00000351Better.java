// original filename: 00012188.txt
// after
public class Class00000351Better {
    private List<Repository> initRepositories(String... names) {
        return ContainerUtil.map(names, this::initRepository);
    }
}
