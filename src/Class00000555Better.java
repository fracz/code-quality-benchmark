// original filename: 00012770.txt
// before
public class Class00000555Better {
    @NotNull
    public VcsShowSettingOption getOrCreateCustomOption(@NotNull String vcsActionName, @NotNull AbstractVcs vcs) {
        final VcsShowOptionsSettingImpl option = getOrCreateOption(vcsActionName);
        option.addApplicableVcs(vcs);
        return option;
    }
}
