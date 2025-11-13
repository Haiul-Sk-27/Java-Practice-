import oshi.SystemInfo;
import oshi.hardware.PowerSource;

public class BatteryCheck {
    public static void main(String[] args) {
        SystemInfo si = new SystemInfo();
        for (PowerSource ps : si.getHardware().getPowerSources()) {
            System.out.println(ps.getName() + " - " + ps.getRemainingCapacityPercent() * 100 + "%");
        }
    }
}
