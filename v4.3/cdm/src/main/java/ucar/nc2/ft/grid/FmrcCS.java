package ucar.nc2.ft.grid;

import ucar.nc2.dataset.CoordinateAxis1DTime;
import ucar.nc2.time.CalendarDate;

import java.util.Date;

/**
 * Description
 *
 * @author John
 * @since 12/23/12
 */
public interface FmrcCS extends CoverageCS {

  /**
   * Get the RunTime axis. Must be 1 dimensional.
   * A runtime coordinate must be a udunit date or ISO String, so it can always be converted to a Date.
   * Typical meaning is the date that a Forecast Model Run is made.
   *
   * @return RunTime CoordinateAxis, may be null.
   */
  public CoordinateAxis1DTime getRunTimeAxis();

  /**
   * This is the case of a 2D time axis, which depends on the run index.
   * A time coordinate must be a udunit date or ISO String, so it can always be converted to a Date.
   *
   * @param runTime which run?
   * @return 1D time axis for that run.
   */
  public CoordinateAxis1DTime getTimeAxisForRun(CalendarDate runTime);
}
