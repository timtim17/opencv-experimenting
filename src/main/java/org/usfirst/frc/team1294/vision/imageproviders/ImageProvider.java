package org.usfirst.frc.team1294.vision.imageproviders;

import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;

/**
 * @author Austin Jenchi (timtim17)
 */
public interface ImageProvider {
    @NotNull
    Mat getImage();
}
