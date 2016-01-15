package org.usfirst.frc.team1294.vision.publishers;

import org.jetbrains.annotations.NotNull;
import org.opencv.core.MatOfPoint;

import java.util.List;

/**
 * @author Austin Jenchi (timtim17)
 */
public interface DataPublisher {
    void publishData(@NotNull List<MatOfPoint> data);
}
