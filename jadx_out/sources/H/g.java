package H;

import android.location.Location;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f3565c = "g";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f3566d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f3567e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f3568f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f3569g = i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List f3570h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X0.a f3571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3572b = false;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends ThreadLocal {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends ThreadLocal {
        b() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends ThreadLocal {
        c() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class d {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final double f3573a;

            a(double d10) {
                this.f3573a = d10;
            }

            double a() {
                return this.f3573a / 2.23694d;
            }
        }

        static a a(double d10) {
            return new a(d10 * 0.621371d);
        }

        static a b(double d10) {
            return new a(d10 * 1.15078d);
        }

        static a c(double d10) {
            return new a(d10);
        }
    }

    private g(X0.a aVar) {
        this.f3571a = aVar;
    }

    private static Date a(String str) {
        return ((SimpleDateFormat) f3566d.get()).parse(str);
    }

    private static Date b(String str) {
        return ((SimpleDateFormat) f3568f.get()).parse(str);
    }

    private static Date c(String str) {
        return ((SimpleDateFormat) f3567e.get()).parse(str);
    }

    public static g e(File file) {
        return f(file.toString());
    }

    public static g f(String str) {
        return new g(new X0.a(str));
    }

    public static g g(androidx.camera.core.o oVar) {
        ByteBuffer byteBufferC = oVar.p()[0].c();
        byteBufferC.rewind();
        byte[] bArr = new byte[byteBufferC.capacity()];
        byteBufferC.get(bArr);
        return h(new ByteArrayInputStream(bArr));
    }

    public static g h(InputStream inputStream) {
        return new g(new X0.a(inputStream));
    }

    public static List i() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    private long s(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return b(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    private long t(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return a(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return c(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return s(str + " " + str2);
    }

    public void d(g gVar) {
        ArrayList<String> arrayList = new ArrayList(f3569g);
        arrayList.removeAll(f3570h);
        for (String str : arrayList) {
            String strK = this.f3571a.k(str);
            String strK2 = gVar.f3571a.k(str);
            if (strK != null && !strK.equals(strK2)) {
                gVar.f3571a.f0(str, strK);
            }
        }
    }

    public String j() {
        return this.f3571a.k("ImageDescription");
    }

    public int k() {
        return this.f3571a.m("ImageLength", 0);
    }

    public Location l() {
        double dA;
        String strK = this.f3571a.k("GPSProcessingMethod");
        double[] dArrQ = this.f3571a.q();
        double dJ = this.f3571a.j(0.0d);
        double dL = this.f3571a.l("GPSSpeed", 0.0d);
        String strK2 = this.f3571a.k("GPSSpeedRef");
        if (strK2 == null) {
            strK2 = "K";
        }
        long jT = t(this.f3571a.k("GPSDateStamp"), this.f3571a.k("GPSTimeStamp"));
        if (dArrQ == null) {
            return null;
        }
        if (strK == null) {
            strK = f3565c;
        }
        Location location = new Location(strK);
        location.setLatitude(dArrQ[0]);
        location.setLongitude(dArrQ[1]);
        if (dJ != 0.0d) {
            location.setAltitude(dJ);
        }
        if (dL != 0.0d) {
            int iHashCode = strK2.hashCode();
            if (iHashCode == 75) {
                strK2.equals("K");
            } else if (iHashCode != 77) {
                if (iHashCode == 78 && strK2.equals("N")) {
                    dA = d.b(dL).a();
                }
                location.setSpeed((float) dA);
            } else {
                if (strK2.equals("M")) {
                    dA = d.c(dL).a();
                }
                location.setSpeed((float) dA);
            }
            dA = d.a(dL).a();
            location.setSpeed((float) dA);
        }
        if (jT != -1) {
            location.setTime(jT);
        }
        return location;
    }

    public int m() {
        return this.f3571a.m("Orientation", 0);
    }

    public int n() {
        switch (m()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long o() {
        long jS = s(this.f3571a.k("DateTimeOriginal"));
        if (jS == -1) {
            return -1L;
        }
        String strK = this.f3571a.k("SubSecTimeOriginal");
        if (strK == null) {
            return jS;
        }
        try {
            long j10 = Long.parseLong(strK);
            while (j10 > 1000) {
                j10 /= 10;
            }
            return jS + j10;
        } catch (NumberFormatException unused) {
            return jS;
        }
    }

    public int p() {
        return this.f3571a.m("ImageWidth", 0);
    }

    public boolean q() {
        return m() == 2;
    }

    public boolean r() {
        int iM = m();
        return iM == 4 || iM == 5 || iM == 7;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(p()), Integer.valueOf(k()), Integer.valueOf(n()), Boolean.valueOf(r()), Boolean.valueOf(q()), l(), Long.valueOf(o()), j());
    }

    public void u(int i10) {
        if (i10 % 90 != 0) {
            AbstractC3583h0.l(f3565c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            this.f3571a.f0("Orientation", String.valueOf(0));
            return;
        }
        int i11 = i10 % 360;
        int iM = m();
        while (i11 < 0) {
            i11 += 90;
            switch (iM) {
                case 2:
                    iM = 5;
                    break;
                case 3:
                case 8:
                    iM = 6;
                    break;
                case 4:
                    iM = 7;
                    break;
                case 5:
                    iM = 4;
                    break;
                case 6:
                    iM = 1;
                    break;
                case 7:
                    iM = 2;
                    break;
                default:
                    iM = 8;
                    break;
            }
        }
        while (i11 > 0) {
            i11 -= 90;
            switch (iM) {
                case 2:
                    iM = 7;
                    break;
                case 3:
                    iM = 8;
                    break;
                case 4:
                    iM = 5;
                    break;
                case 5:
                    iM = 2;
                    break;
                case 6:
                    iM = 3;
                    break;
                case 7:
                    iM = 4;
                    break;
                case 8:
                    iM = 1;
                    break;
                default:
                    iM = 6;
                    break;
            }
        }
        this.f3571a.f0("Orientation", String.valueOf(iM));
    }
}
