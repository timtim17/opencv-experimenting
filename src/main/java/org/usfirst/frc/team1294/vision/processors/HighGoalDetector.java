package org.usfirst.frc.team1294.vision.processors;

import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;

import java.util.List;

/**
 * An example implementation of {@link ImageProcessor} to
 * detect the high goals in the FRC 2016 game FIRST
 * Stronghold.
 *
 * @author Austin Jenchi (timtim17)
 */
public class HighGoalDetector implements ImageProcessor {
    @NotNull
    @Override
    public List<MatOfPoint> processImage(Mat image) {
        return null;
    }
}
