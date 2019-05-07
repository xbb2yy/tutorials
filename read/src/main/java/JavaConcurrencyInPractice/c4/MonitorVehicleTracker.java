package JavaConcurrencyInPractice.c4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MonitorVehicleTracker {

    private final Map<String, MutablePoint> locations;

    public MonitorVehicleTracker(Map<String, MutablePoint> locations) {
        this.locations = deepCopy(locations);
    }

    public synchronized Map<String, MutablePoint> getLocations() {
        return deepCopy(locations);
    }

    public synchronized MutablePoint getLocation(String id) {
        MutablePoint mutablePoint = locations.get(id);
        return mutablePoint == null ? null: new MutablePoint(mutablePoint.x, mutablePoint.y);
    }

    public synchronized void setLocation(String id, int x, int y) {
        MutablePoint point = locations.get(id);
        if (null == point) {
            throw new IllegalArgumentException("no such element");
        }
        point.x = x;
        point.y = y;
    }

    private static Map<String, MutablePoint> deepCopy(Map<String, MutablePoint> locations) {
        Map<String, MutablePoint> m = new HashMap<>();
        for (Map.Entry<String, MutablePoint> entry : locations.entrySet()) {
            m.put(entry.getKey(), entry.getValue());
        }
        return Collections.unmodifiableMap(m);
    }

}
