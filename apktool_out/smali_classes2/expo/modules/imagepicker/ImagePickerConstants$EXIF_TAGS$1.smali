.class public final Lexpo/modules/imagepicker/ImagePickerConstants$EXIF_TAGS$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/imagepicker/ImagePickerConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Lx7/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001b\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0005H\u0096\u0002R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "expo/modules/imagepicker/ImagePickerConstants$EXIF_TAGS$1",
        "",
        "Lkotlin/Pair;",
        "",
        "iterator",
        "",
        "typeToTags",
        "",
        "",
        "expo-image-picker_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final typeToTags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 57

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v45, "SubSecTimeOriginal"

    .line 5
    .line 6
    const-string v46, "UserComment"

    .line 7
    .line 8
    const-string v1, "Artist"

    .line 9
    .line 10
    const-string v2, "CFAPattern"

    .line 11
    .line 12
    const-string v3, "ComponentsConfiguration"

    .line 13
    .line 14
    const-string v4, "Copyright"

    .line 15
    .line 16
    const-string v5, "DateTime"

    .line 17
    .line 18
    const-string v6, "DateTimeDigitized"

    .line 19
    .line 20
    const-string v7, "DateTimeOriginal"

    .line 21
    .line 22
    const-string v8, "DeviceSettingDescription"

    .line 23
    .line 24
    const-string v9, "ExifVersion"

    .line 25
    .line 26
    const-string v10, "FileSource"

    .line 27
    .line 28
    const-string v11, "FlashpixVersion"

    .line 29
    .line 30
    const-string v12, "GPSAreaInformation"

    .line 31
    .line 32
    const-string v13, "GPSDateStamp"

    .line 33
    .line 34
    const-string v14, "GPSDestBearingRef"

    .line 35
    .line 36
    const-string v15, "GPSDestDistanceRef"

    .line 37
    .line 38
    const-string v16, "GPSDestLatitudeRef"

    .line 39
    .line 40
    const-string v17, "GPSDestLongitudeRef"

    .line 41
    .line 42
    const-string v18, "GPSHPositioningError"

    .line 43
    .line 44
    const-string v19, "GPSImgDirectionRef"

    .line 45
    .line 46
    const-string v20, "GPSLatitudeRef"

    .line 47
    .line 48
    const-string v21, "GPSLongitudeRef"

    .line 49
    .line 50
    const-string v22, "GPSMapDatum"

    .line 51
    .line 52
    const-string v23, "GPSMeasureMode"

    .line 53
    .line 54
    const-string v24, "GPSProcessingMethod"

    .line 55
    .line 56
    const-string v25, "GPSSatellites"

    .line 57
    .line 58
    const-string v26, "GPSSpeedRef"

    .line 59
    .line 60
    const-string v27, "GPSStatus"

    .line 61
    .line 62
    const-string v28, "GPSTimeStamp"

    .line 63
    .line 64
    const-string v29, "GPSTrackRef"

    .line 65
    .line 66
    const-string v30, "GPSVersionID"

    .line 67
    .line 68
    const-string v31, "ImageDescription"

    .line 69
    .line 70
    const-string v32, "ImageUniqueID"

    .line 71
    .line 72
    const-string v33, "InteroperabilityIndex"

    .line 73
    .line 74
    const-string v34, "Make"

    .line 75
    .line 76
    const-string v35, "MakerNote"

    .line 77
    .line 78
    const-string v36, "Model"

    .line 79
    .line 80
    const-string v37, "OECF"

    .line 81
    .line 82
    const-string v38, "RelatedSoundFile"

    .line 83
    .line 84
    const-string v39, "SceneType"

    .line 85
    .line 86
    const-string v40, "Software"

    .line 87
    .line 88
    const-string v41, "SpatialFrequencyResponse"

    .line 89
    .line 90
    const-string v42, "SpectralSensitivity"

    .line 91
    .line 92
    const-string v43, "SubSecTime"

    .line 93
    .line 94
    const-string v44, "SubSecTimeDigitized"

    .line 95
    .line 96
    filled-new-array/range {v1 .. v46}, [Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v1, "string"

    .line 105
    .line 106
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v31, "YCbCrCoefficients"

    .line 111
    .line 112
    const-string v32, "YResolution"

    .line 113
    .line 114
    const-string v1, "ApertureValue"

    .line 115
    .line 116
    const-string v2, "BrightnessValue"

    .line 117
    .line 118
    const-string v3, "CompressedBitsPerPixel"

    .line 119
    .line 120
    const-string v4, "DigitalZoomRatio"

    .line 121
    .line 122
    const-string v5, "ExposureBiasValue"

    .line 123
    .line 124
    const-string v6, "ExposureIndex"

    .line 125
    .line 126
    const-string v7, "ExposureTime"

    .line 127
    .line 128
    const-string v8, "FlashEnergy"

    .line 129
    .line 130
    const-string v9, "FocalLength"

    .line 131
    .line 132
    const-string v10, "FocalPlaneXResolution"

    .line 133
    .line 134
    const-string v11, "FocalPlaneYResolution"

    .line 135
    .line 136
    const-string v12, "FNumber"

    .line 137
    .line 138
    const-string v13, "GPSAltitude"

    .line 139
    .line 140
    const-string v14, "GPSDestBearing"

    .line 141
    .line 142
    const-string v15, "GPSDestDistance"

    .line 143
    .line 144
    const-string v16, "GPSDestLatitude"

    .line 145
    .line 146
    const-string v17, "GPSDestLongitude"

    .line 147
    .line 148
    const-string v18, "GPSDOP"

    .line 149
    .line 150
    const-string v19, "GPSImgDirection"

    .line 151
    .line 152
    const-string v20, "GPSLatitude"

    .line 153
    .line 154
    const-string v21, "GPSLongitude"

    .line 155
    .line 156
    const-string v22, "GPSSpeed"

    .line 157
    .line 158
    const-string v23, "GPSTrack"

    .line 159
    .line 160
    const-string v24, "MaxApertureValue"

    .line 161
    .line 162
    const-string v25, "PrimaryChromaticities"

    .line 163
    .line 164
    const-string v26, "ReferenceBlackWhite"

    .line 165
    .line 166
    const-string v27, "ShutterSpeedValue"

    .line 167
    .line 168
    const-string v28, "SubjectDistance"

    .line 169
    .line 170
    const-string v29, "WhitePoint"

    .line 171
    .line 172
    const-string v30, "XResolution"

    .line 173
    .line 174
    filled-new-array/range {v1 .. v32}, [Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-static {v1}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    const-string v2, "double"

    .line 183
    .line 184
    invoke-static {v2, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    const-string v55, "YCbCrPositioning"

    .line 189
    .line 190
    const-string v56, "YCbCrSubSampling"

    .line 191
    .line 192
    const-string v2, "BitsPerSample"

    .line 193
    .line 194
    const-string v3, "ColorSpace"

    .line 195
    .line 196
    const-string v4, "Compression"

    .line 197
    .line 198
    const-string v5, "Contrast"

    .line 199
    .line 200
    const-string v6, "CustomRendered"

    .line 201
    .line 202
    const-string v7, "DefaultCropSize"

    .line 203
    .line 204
    const-string v8, "DNGVersion"

    .line 205
    .line 206
    const-string v9, "ExposureMode"

    .line 207
    .line 208
    const-string v10, "ExposureProgram"

    .line 209
    .line 210
    const-string v11, "Flash"

    .line 211
    .line 212
    const-string v12, "FocalLengthIn35mmFilm"

    .line 213
    .line 214
    const-string v13, "FocalPlaneResolutionUnit"

    .line 215
    .line 216
    const-string v14, "GainControl"

    .line 217
    .line 218
    const-string v15, "GPSAltitudeRef"

    .line 219
    .line 220
    const-string v16, "GPSDifferential"

    .line 221
    .line 222
    const-string v17, "ImageLength"

    .line 223
    .line 224
    const-string v18, "ImageWidth"

    .line 225
    .line 226
    const-string v19, "ISOSpeedRatings"

    .line 227
    .line 228
    const-string v20, "JPEGInterchangeFormat"

    .line 229
    .line 230
    const-string v21, "JPEGInterchangeFormatLength"

    .line 231
    .line 232
    const-string v22, "LightSource"

    .line 233
    .line 234
    const-string v23, "MeteringMode"

    .line 235
    .line 236
    const-string v24, "NewSubfileType"

    .line 237
    .line 238
    const-string v25, "AspectFrame"

    .line 239
    .line 240
    const-string v26, "PreviewImageLength"

    .line 241
    .line 242
    const-string v27, "PreviewImageStart"

    .line 243
    .line 244
    const-string v28, "Orientation"

    .line 245
    .line 246
    const-string v29, "PhotometricInterpretation"

    .line 247
    .line 248
    const-string v30, "PixelXDimension"

    .line 249
    .line 250
    const-string v31, "PixelYDimension"

    .line 251
    .line 252
    const-string v32, "PlanarConfiguration"

    .line 253
    .line 254
    const-string v33, "ResolutionUnit"

    .line 255
    .line 256
    const-string v34, "RowsPerStrip"

    .line 257
    .line 258
    const-string v35, "ISO"

    .line 259
    .line 260
    const-string v36, "SensorBottomBorder"

    .line 261
    .line 262
    const-string v37, "SensorLeftBorder"

    .line 263
    .line 264
    const-string v38, "SensorRightBorder"

    .line 265
    .line 266
    const-string v39, "SensorTopBorder"

    .line 267
    .line 268
    const-string v40, "SamplesPerPixel"

    .line 269
    .line 270
    const-string v41, "Saturation"

    .line 271
    .line 272
    const-string v42, "SceneCaptureType"

    .line 273
    .line 274
    const-string v43, "SensingMethod"

    .line 275
    .line 276
    const-string v44, "Sharpness"

    .line 277
    .line 278
    const-string v45, "StripByteCounts"

    .line 279
    .line 280
    const-string v46, "StripOffsets"

    .line 281
    .line 282
    const-string v47, "SubfileType"

    .line 283
    .line 284
    const-string v48, "SubjectArea"

    .line 285
    .line 286
    const-string v49, "SubjectDistanceRange"

    .line 287
    .line 288
    const-string v50, "SubjectLocation"

    .line 289
    .line 290
    const-string v51, "ThumbnailImageLength"

    .line 291
    .line 292
    const-string v52, "ThumbnailImageWidth"

    .line 293
    .line 294
    const-string v53, "TransferFunction"

    .line 295
    .line 296
    const-string v54, "WhiteBalance"

    .line 297
    .line 298
    filled-new-array/range {v2 .. v56}, [Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-static {v2}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    const-string v3, "int"

    .line 307
    .line 308
    invoke-static {v3, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v0}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    move-object/from16 v1, p0

    .line 321
    .line 322
    iput-object v0, v1, Lexpo/modules/imagepicker/ImagePickerConstants$EXIF_TAGS$1;->typeToTags:Ljava/util/Map;

    .line 323
    .line 324
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/imagepicker/ImagePickerConstants$EXIF_TAGS$1;->typeToTags:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/util/List;

    .line 39
    .line 40
    new-instance v4, Ljava/util/ArrayList;

    .line 41
    .line 42
    const/16 v5, 0xa

    .line 43
    .line 44
    invoke-static {v2, v5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_0

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v3, v5}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    invoke-static {v1, v4}, Lj7/q;->A(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0
.end method
