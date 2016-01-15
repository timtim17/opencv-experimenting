package org.usfirst.frc.team1294.vision.processors;

import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;

import java.util.List;

/**
 * @author Austin Jenchi (timtim17)
 */
public interface ImageProcessor {
    @NotNull
    List<MatOfPoint> processImage(@NotNull Mat image);
}
