package co.medirecords.exam.objects;

public class WeatherstackResponse {

    private WeatherstackError error;

    private WeatherstackLocation location;
    private WeatherstackCurrent current;

    public WeatherstackError getError() {
        return error;
    }

    public void setError(WeatherstackError error) {
        this.error = error;
    }

    public WeatherstackLocation getLocation() {
        return location;
    }

    public void setLocation(WeatherstackLocation location) {
        this.location = location;
    }

    public WeatherstackCurrent getCurrent() {
        return current;
    }

    public void setCurrent(WeatherstackCurrent current) {
        this.current = current;
    }
}
