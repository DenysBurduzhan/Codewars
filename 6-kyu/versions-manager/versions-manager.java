import java.util.*;
​
public class VersionManager {
    private int major;
    private int minor;
    private int patch;
    private Deque<int[]> history = new ArrayDeque<>();
​
    public VersionManager(String version) {
        if (version == null || version.isEmpty()) {
            this.major = 0;
            this.minor = 0;
            this.patch = 1;
            return;
        }
​
        String[] parts = version.split("\\.");
        try {
            this.major = Integer.parseInt(parts[0]);
            this.minor = parts.length > 1 ? Integer.parseInt(parts[1]) : 0;
            this.patch = parts.length > 2 ? Integer.parseInt(parts[2]) : 0;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error occured while parsing version!");
        }
    }
​
    public VersionManager() {
        this("0.0.1");
    }
​
    public VersionManager major() {
        saveState();
        major++;
        minor = 0;
        patch = 0;
        return this;
    }
​
    public VersionManager minor() {
        saveState();
        minor++;
        patch = 0;
        return this;
    }
​
    public VersionManager patch() {
        saveState();
        patch++;
        return this;
    }
​
    public VersionManager rollback() {
        if (history.isEmpty()) {
            throw new IllegalStateException("Cannot rollback!");
        }
        int[] prev = history.pop();
        major = prev[0];
        minor = prev[1];
        patch = prev[2];
        return this;
    }
​
    public String release() {
        return major + "." + minor + "." + patch;
    }
​
    private void saveState() {
        history.push(new int[]{major, minor, patch});
    }
}
​