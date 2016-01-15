package org.usfirst.frc.team1294.vision;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

public class Program {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {

        Mat originalImage = new Mat();
        VideoCapture capture = new VideoCapture(0);
        capture.read(originalImage);
    }
}
