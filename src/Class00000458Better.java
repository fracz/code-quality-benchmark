// original filename: 00026270.txt
// after
public class Class00000458Better {
    /**
     * Skip analysis time filetype check. Don't use it if avoidable.
     */
    public Builder<TYPE> skipAnalysisTimeFileTypeCheck() {
        Preconditions.checkState(type.getLabelClass() == LabelClass.DEPENDENCY, "must be a label-valued type");
        return setPropertyFlag(PropertyFlag.SKIP_ANALYSIS_TIME_FILETYPE_CHECK, "skip_analysis_time_filetype_check");
    }
}
