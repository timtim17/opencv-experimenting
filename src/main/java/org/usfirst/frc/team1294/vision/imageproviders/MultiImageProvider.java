package org.usfirst.frc.team1294.vision.imageproviders;

import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Austin Jenchi (timtim17)
 */
public class MultiImageProvider implements ImageProvider {
    private int index = -1;
    private ArrayList<Mat> images;

    public MultiImageProvider(@NotNull List<String> fileNames) {
        images = new ArrayList<>();

        if (fileNames.size() == 0) throw new IllegalArgumentException("No file names in list");

        for (String fileName : fileNames) {
            images.add(null);
        }
    }

    @NotNull
    @Override
    public Mat getImage() {
        index++;
        if (index >= images.size()) index = 0;
        return images.get(index);
    }
}
