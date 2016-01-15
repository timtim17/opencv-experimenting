package org.usfirst.frc.team1294.vision.editors;

import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;

/**
 * @author Austin Jenchi (timtim17)
 */
public interface ImageEditor {
    @NotNull
    Mat edit(@NotNull MatOfPoint data);
}
