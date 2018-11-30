// original filename: 00052590.txt
// after
public class Class00000641Worse {
    /**
     * Build table rules.
     *
     * @param tableRules table rules
     * @return this builder
     */
    public ShardingRuleBuilder tableRules(final TableRule... tableRules) {
        this.tableRules.clear();
        this.tableRules.addAll(Arrays.asList(tableRules));
        return this;
    }
}
