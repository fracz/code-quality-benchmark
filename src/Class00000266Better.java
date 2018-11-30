// original filename: 00055738.txt
// after
public class Class00000266Better {
    /**
     * Returns:
     * <ul>
     * <li>0 if the two conditions have the same number of header expressions
     * <li>Less than 1 if "this" instance has more header expressions
     * <li>Greater than 1 if the "other" instance has more header expressions
     * </ul>
     * <p>
     * <p>It is assumed that both instances have been obtained via {@link #getMatchingCondition(HttpServletRequest)}
     * and each instance contains the matching header expression only or is otherwise empty.
     */
    public int compareTo(HeadersRequestCondition other, HttpServletRequest request) {
        return other.expressions.size() - this.expressions.size();
    }
}
