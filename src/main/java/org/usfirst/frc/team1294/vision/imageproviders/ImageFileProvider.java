package org.usfirst.frc.team1294.vision.imageproviders;

import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;

/**
 * @author Austin Jenchi (timtim17)
 */
public class ImageFileProvider implements ImageProvider {
    private Mat image;

    public ImageFileProvider(String fileName) {
        image = null;
    }

    @NotNull
    @Override
    public Mat getImage() {
        return image;
    }
}
