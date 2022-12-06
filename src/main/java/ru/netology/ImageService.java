package ru.netology;

import com.aspose.imaging.Image;
import com.aspose.imaging.fileformats.jpeg.JpegCompressionMode;
import com.aspose.imaging.imageoptions.JpegOptions;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    // Загрузить изображение
    public void imageCompression() {
        Image original = Image.load("C:\\Users\\admin\\Downloads\\2 (3).png");
        try {
            JpegOptions jpegOptions = new JpegOptions() {{
                // Применить сжатие
                setCompressionType(JpegCompressionMode.Progressive);
            }};

            // Сохранить сжатое изображение
            original.save("C:\\Users\\admin\\OneDrive\\Рабочий стол\\New\\2!!.png", jpegOptions);
        } finally {
            original.dispose();
        }
    }
}
