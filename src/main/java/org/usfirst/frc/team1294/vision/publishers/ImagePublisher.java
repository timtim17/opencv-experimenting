package org.usfirst.frc.team1294.vision.publishers;

import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;

/**
 * @author Austin Jenchi (timtim17)
 */
public interface ImagePublisher {
    void publishImage(@NotNull Mat image);
}
