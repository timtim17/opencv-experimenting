package org.usfirst.frc.team1294.vision.publishers;

import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;

import java.util.List;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 * @author Austin Jenchi (timtim17)
 */
public class DriverStationPublisher implements ImagePublisher, DataPublisher {
    private static NetworkTable table;

    private String key;

    static {
        NetworkTable.setTeam(1294);
        table = NetworkTable.getTable("Vision");
    }

    public DriverStationPublisher(String key) {
        this.key = key;
    }

    @Override
    public void publishData(@NotNull List<MatOfPoint> data) {
        table.putValue(key, data);
    }

    @Override
    public void publishImage(@NotNull Mat image) {
        // TODO: Implement MJPEG streamer
    }
}
