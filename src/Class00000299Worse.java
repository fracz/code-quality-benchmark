// original filename: 00040942.txt
// before
public class Class00000299Worse {
    /**
     * Called by the SCR to deactivate the component when either the configuration is removed or
     * mandatory references are no longer satisfied or the component has simply been stopped.
     *
     * @param reason Reason code for the deactivation:<br>
     *               <ul>
     *               <li>0 – Unspecified
     *               <li>1 – The component was disabled
     *               <li>2 – A reference became unsatisfied
     *               <li>3 – A configuration was changed
     *               <li>4 – A configuration was deleted
     *               <li>5 – The component was disposed
     *               <li>6 – The bundle was stopped
     *               </ul>
     */
    public void deactivate(final int reason) {
        this.bundleContext = null;
// deallocate resources here that are no longer needed and
// should be reset when activating this binding again
    }
}
