.class public final Lexpo/modules/medialibrary/MediaLibraryConstantsKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0008\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0019\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0011\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0012\u0010\u0013\"\u001f\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u00110\u0011\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "ERROR_UNABLE_TO_LOAD_PERMISSION",
        "",
        "ERROR_UNABLE_TO_SAVE_PERMISSION",
        "ERROR_UNABLE_TO_DELETE",
        "ERROR_UNABLE_TO_LOAD",
        "ERROR_UNABLE_TO_SAVE",
        "ERROR_IO_EXCEPTION",
        "ERROR_NO_PERMISSIONS",
        "ERROR_NO_PERMISSIONS_MESSAGE",
        "ERROR_NO_WRITE_PERMISSION_MESSAGE",
        "ERROR_USER_DID_NOT_GRANT_WRITE_PERMISSIONS_MESSAGE",
        "LIBRARY_DID_CHANGE_EVENT",
        "EXTERNAL_CONTENT_URI",
        "Landroid/net/Uri;",
        "getEXTERNAL_CONTENT_URI",
        "()Landroid/net/Uri;",
        "ASSET_PROJECTION",
        "",
        "getASSET_PROJECTION",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "EXIF_TAGS",
        "getEXIF_TAGS",
        "()[[Ljava/lang/String;",
        "[[Ljava/lang/String;",
        "expo-media-library_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ASSET_PROJECTION:[Ljava/lang/String;

.field public static final ERROR_IO_EXCEPTION:Ljava/lang/String; = "E_IO_EXCEPTION"

.field public static final ERROR_NO_PERMISSIONS:Ljava/lang/String; = "E_NO_PERMISSIONS"

.field public static final ERROR_NO_PERMISSIONS_MESSAGE:Ljava/lang/String; = "Missing MEDIA_LIBRARY permissions."

.field public static final ERROR_NO_WRITE_PERMISSION_MESSAGE:Ljava/lang/String; = "Missing MEDIA_LIBRARY write permission."

.field public static final ERROR_UNABLE_TO_DELETE:Ljava/lang/String; = "E_UNABLE_TO_DELETE"

.field public static final ERROR_UNABLE_TO_LOAD:Ljava/lang/String; = "E_UNABLE_TO_LOAD"

.field public static final ERROR_UNABLE_TO_LOAD_PERMISSION:Ljava/lang/String; = "E_UNABLE_TO_LOAD_PERMISSION"

.field public static final ERROR_UNABLE_TO_SAVE:Ljava/lang/String; = "E_UNABLE_TO_SAVE"

.field public static final ERROR_UNABLE_TO_SAVE_PERMISSION:Ljava/lang/String; = "E_UNABLE_TO_SAVE_PERMISSION"

.field public static final ERROR_USER_DID_NOT_GRANT_WRITE_PERMISSIONS_MESSAGE:Ljava/lang/String; = "User didn\'t grant write permission to requested files."

.field private static final EXIF_TAGS:[[Ljava/lang/String;

.field private static final EXTERNAL_CONTENT_URI:Landroid/net/Uri;

.field public static final LIBRARY_DID_CHANGE_EVENT:Ljava/lang/String; = "mediaLibraryDidChange"


# direct methods
.method static constructor <clinit>()V
    .locals 131

    .line 1
    const-string v0, "external"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getContentUri(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lexpo/modules/medialibrary/MediaLibraryConstantsKt;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 13
    .line 14
    const-string v11, "duration"

    .line 15
    .line 16
    const-string v12, "bucket_id"

    .line 17
    .line 18
    const-string v2, "_id"

    .line 19
    .line 20
    const-string v3, "_display_name"

    .line 21
    .line 22
    const-string v4, "_data"

    .line 23
    .line 24
    const-string v5, "media_type"

    .line 25
    .line 26
    const-string v6, "width"

    .line 27
    .line 28
    const-string v7, "height"

    .line 29
    .line 30
    const-string v8, "datetaken"

    .line 31
    .line 32
    const-string v9, "date_modified"

    .line 33
    .line 34
    const-string v10, "orientation"

    .line 35
    .line 36
    filled-new-array/range {v2 .. v12}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Lexpo/modules/medialibrary/MediaLibraryConstantsKt;->ASSET_PROJECTION:[Ljava/lang/String;

    .line 41
    .line 42
    const-string v0, "Artist"

    .line 43
    .line 44
    const-string v1, "string"

    .line 45
    .line 46
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v0, "BitsPerSample"

    .line 51
    .line 52
    const-string v3, "int"

    .line 53
    .line 54
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v4, "Compression"

    .line 59
    .line 60
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const-string v5, "Copyright"

    .line 65
    .line 66
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const-string v6, "DateTime"

    .line 71
    .line 72
    filled-new-array {v1, v6}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    const-string v7, "ImageDescription"

    .line 77
    .line 78
    filled-new-array {v1, v7}, [Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    const-string v8, "ImageLength"

    .line 83
    .line 84
    filled-new-array {v3, v8}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    const-string v9, "ImageWidth"

    .line 89
    .line 90
    filled-new-array {v3, v9}, [Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    const-string v10, "JPEGInterchangeFormat"

    .line 95
    .line 96
    filled-new-array {v3, v10}, [Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    const-string v11, "JPEGInterchangeFormatLength"

    .line 101
    .line 102
    filled-new-array {v3, v11}, [Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    const-string v12, "Make"

    .line 107
    .line 108
    filled-new-array {v1, v12}, [Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    const-string v13, "Model"

    .line 113
    .line 114
    filled-new-array {v1, v13}, [Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    const-string v14, "Orientation"

    .line 119
    .line 120
    filled-new-array {v3, v14}, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v14

    .line 124
    const-string v15, "PhotometricInterpretation"

    .line 125
    .line 126
    filled-new-array {v3, v15}, [Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    move-object/from16 v16, v0

    .line 131
    .line 132
    const-string v0, "PlanarConfiguration"

    .line 133
    .line 134
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    move-object/from16 v17, v0

    .line 139
    .line 140
    const-string v0, "PrimaryChromaticities"

    .line 141
    .line 142
    move-object/from16 v18, v2

    .line 143
    .line 144
    const-string v2, "double"

    .line 145
    .line 146
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    move-object/from16 v19, v0

    .line 151
    .line 152
    const-string v0, "ReferenceBlackWhite"

    .line 153
    .line 154
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    move-object/from16 v20, v0

    .line 159
    .line 160
    const-string v0, "ResolutionUnit"

    .line 161
    .line 162
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    move-object/from16 v21, v0

    .line 167
    .line 168
    const-string v0, "RowsPerStrip"

    .line 169
    .line 170
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    move-object/from16 v22, v0

    .line 175
    .line 176
    const-string v0, "SamplesPerPixel"

    .line 177
    .line 178
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    move-object/from16 v23, v0

    .line 183
    .line 184
    const-string v0, "Software"

    .line 185
    .line 186
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    move-object/from16 v24, v0

    .line 191
    .line 192
    const-string v0, "StripByteCounts"

    .line 193
    .line 194
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    move-object/from16 v25, v0

    .line 199
    .line 200
    const-string v0, "StripOffsets"

    .line 201
    .line 202
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    move-object/from16 v26, v0

    .line 207
    .line 208
    const-string v0, "TransferFunction"

    .line 209
    .line 210
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    move-object/from16 v27, v0

    .line 215
    .line 216
    const-string v0, "WhitePoint"

    .line 217
    .line 218
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    move-object/from16 v28, v0

    .line 223
    .line 224
    const-string v0, "XResolution"

    .line 225
    .line 226
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    move-object/from16 v29, v0

    .line 231
    .line 232
    const-string v0, "YCbCrCoefficients"

    .line 233
    .line 234
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    move-object/from16 v30, v0

    .line 239
    .line 240
    const-string v0, "YCbCrPositioning"

    .line 241
    .line 242
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    move-object/from16 v31, v0

    .line 247
    .line 248
    const-string v0, "YCbCrSubSampling"

    .line 249
    .line 250
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    move-object/from16 v32, v0

    .line 255
    .line 256
    const-string v0, "YResolution"

    .line 257
    .line 258
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    move-object/from16 v33, v0

    .line 263
    .line 264
    const-string v0, "ApertureValue"

    .line 265
    .line 266
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    move-object/from16 v34, v0

    .line 271
    .line 272
    const-string v0, "BrightnessValue"

    .line 273
    .line 274
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    move-object/from16 v35, v0

    .line 279
    .line 280
    const-string v0, "CFAPattern"

    .line 281
    .line 282
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    move-object/from16 v36, v0

    .line 287
    .line 288
    const-string v0, "ColorSpace"

    .line 289
    .line 290
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    move-object/from16 v37, v0

    .line 295
    .line 296
    const-string v0, "ComponentsConfiguration"

    .line 297
    .line 298
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    move-object/from16 v38, v0

    .line 303
    .line 304
    const-string v0, "CompressedBitsPerPixel"

    .line 305
    .line 306
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    move-object/from16 v39, v0

    .line 311
    .line 312
    const-string v0, "Contrast"

    .line 313
    .line 314
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    move-object/from16 v40, v0

    .line 319
    .line 320
    const-string v0, "CustomRendered"

    .line 321
    .line 322
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    move-object/from16 v41, v0

    .line 327
    .line 328
    const-string v0, "DateTimeDigitized"

    .line 329
    .line 330
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    move-object/from16 v42, v0

    .line 335
    .line 336
    const-string v0, "DateTimeOriginal"

    .line 337
    .line 338
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    move-object/from16 v43, v0

    .line 343
    .line 344
    const-string v0, "DeviceSettingDescription"

    .line 345
    .line 346
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    move-object/from16 v44, v0

    .line 351
    .line 352
    const-string v0, "DigitalZoomRatio"

    .line 353
    .line 354
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    move-object/from16 v45, v0

    .line 359
    .line 360
    const-string v0, "ExifVersion"

    .line 361
    .line 362
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    move-object/from16 v46, v0

    .line 367
    .line 368
    const-string v0, "ExposureBiasValue"

    .line 369
    .line 370
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    move-object/from16 v47, v0

    .line 375
    .line 376
    const-string v0, "ExposureIndex"

    .line 377
    .line 378
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    move-object/from16 v48, v0

    .line 383
    .line 384
    const-string v0, "ExposureMode"

    .line 385
    .line 386
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    move-object/from16 v49, v0

    .line 391
    .line 392
    const-string v0, "ExposureProgram"

    .line 393
    .line 394
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    move-object/from16 v50, v0

    .line 399
    .line 400
    const-string v0, "ExposureTime"

    .line 401
    .line 402
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    move-object/from16 v51, v0

    .line 407
    .line 408
    const-string v0, "FNumber"

    .line 409
    .line 410
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    move-object/from16 v52, v0

    .line 415
    .line 416
    const-string v0, "FileSource"

    .line 417
    .line 418
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    move-object/from16 v53, v0

    .line 423
    .line 424
    const-string v0, "Flash"

    .line 425
    .line 426
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    move-object/from16 v54, v0

    .line 431
    .line 432
    const-string v0, "FlashEnergy"

    .line 433
    .line 434
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    move-object/from16 v55, v0

    .line 439
    .line 440
    const-string v0, "FlashpixVersion"

    .line 441
    .line 442
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    move-object/from16 v56, v0

    .line 447
    .line 448
    const-string v0, "FocalLength"

    .line 449
    .line 450
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    move-object/from16 v57, v0

    .line 455
    .line 456
    const-string v0, "FocalLengthIn35mmFilm"

    .line 457
    .line 458
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    move-object/from16 v58, v0

    .line 463
    .line 464
    const-string v0, "FocalPlaneResolutionUnit"

    .line 465
    .line 466
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    move-object/from16 v59, v0

    .line 471
    .line 472
    const-string v0, "FocalPlaneXResolution"

    .line 473
    .line 474
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    move-object/from16 v60, v0

    .line 479
    .line 480
    const-string v0, "FocalPlaneYResolution"

    .line 481
    .line 482
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    move-object/from16 v61, v0

    .line 487
    .line 488
    const-string v0, "GainControl"

    .line 489
    .line 490
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    move-object/from16 v62, v0

    .line 495
    .line 496
    const-string v0, "ISOSpeedRatings"

    .line 497
    .line 498
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    move-object/from16 v63, v0

    .line 503
    .line 504
    const-string v0, "ImageUniqueID"

    .line 505
    .line 506
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    move-object/from16 v64, v0

    .line 511
    .line 512
    const-string v0, "LightSource"

    .line 513
    .line 514
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    move-object/from16 v65, v0

    .line 519
    .line 520
    const-string v0, "MakerNote"

    .line 521
    .line 522
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    move-object/from16 v66, v0

    .line 527
    .line 528
    const-string v0, "MaxApertureValue"

    .line 529
    .line 530
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    move-object/from16 v67, v0

    .line 535
    .line 536
    const-string v0, "MeteringMode"

    .line 537
    .line 538
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    move-object/from16 v68, v0

    .line 543
    .line 544
    const-string v0, "NewSubfileType"

    .line 545
    .line 546
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    move-object/from16 v69, v0

    .line 551
    .line 552
    const-string v0, "OECF"

    .line 553
    .line 554
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    move-object/from16 v70, v0

    .line 559
    .line 560
    const-string v0, "PixelXDimension"

    .line 561
    .line 562
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    move-object/from16 v71, v0

    .line 567
    .line 568
    const-string v0, "PixelYDimension"

    .line 569
    .line 570
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    move-object/from16 v72, v0

    .line 575
    .line 576
    const-string v0, "RelatedSoundFile"

    .line 577
    .line 578
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    move-object/from16 v73, v0

    .line 583
    .line 584
    const-string v0, "Saturation"

    .line 585
    .line 586
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    move-object/from16 v74, v0

    .line 591
    .line 592
    const-string v0, "SceneCaptureType"

    .line 593
    .line 594
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    move-object/from16 v75, v0

    .line 599
    .line 600
    const-string v0, "SceneType"

    .line 601
    .line 602
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    move-object/from16 v76, v0

    .line 607
    .line 608
    const-string v0, "SensingMethod"

    .line 609
    .line 610
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    move-object/from16 v77, v0

    .line 615
    .line 616
    const-string v0, "Sharpness"

    .line 617
    .line 618
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    move-object/from16 v78, v0

    .line 623
    .line 624
    const-string v0, "ShutterSpeedValue"

    .line 625
    .line 626
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    move-object/from16 v79, v0

    .line 631
    .line 632
    const-string v0, "SpatialFrequencyResponse"

    .line 633
    .line 634
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    move-object/from16 v80, v0

    .line 639
    .line 640
    const-string v0, "SpectralSensitivity"

    .line 641
    .line 642
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    move-object/from16 v81, v0

    .line 647
    .line 648
    const-string v0, "SubfileType"

    .line 649
    .line 650
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    move-object/from16 v82, v0

    .line 655
    .line 656
    const-string v0, "SubSecTime"

    .line 657
    .line 658
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    move-object/from16 v83, v0

    .line 663
    .line 664
    const-string v0, "SubSecTimeDigitized"

    .line 665
    .line 666
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    move-object/from16 v84, v0

    .line 671
    .line 672
    const-string v0, "SubSecTimeOriginal"

    .line 673
    .line 674
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    move-object/from16 v85, v0

    .line 679
    .line 680
    const-string v0, "SubjectArea"

    .line 681
    .line 682
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    move-object/from16 v86, v0

    .line 687
    .line 688
    const-string v0, "SubjectDistance"

    .line 689
    .line 690
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    move-object/from16 v87, v0

    .line 695
    .line 696
    const-string v0, "SubjectDistanceRange"

    .line 697
    .line 698
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    move-object/from16 v88, v0

    .line 703
    .line 704
    const-string v0, "SubjectLocation"

    .line 705
    .line 706
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    move-object/from16 v89, v0

    .line 711
    .line 712
    const-string v0, "UserComment"

    .line 713
    .line 714
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    move-object/from16 v90, v0

    .line 719
    .line 720
    const-string v0, "WhiteBalance"

    .line 721
    .line 722
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    move-object/from16 v91, v0

    .line 727
    .line 728
    const-string v0, "GPSAltitudeRef"

    .line 729
    .line 730
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    move-object/from16 v92, v0

    .line 735
    .line 736
    const-string v0, "GPSAreaInformation"

    .line 737
    .line 738
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    move-object/from16 v93, v0

    .line 743
    .line 744
    const-string v0, "GPSDOP"

    .line 745
    .line 746
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    move-object/from16 v94, v0

    .line 751
    .line 752
    const-string v0, "GPSDateStamp"

    .line 753
    .line 754
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    move-object/from16 v95, v0

    .line 759
    .line 760
    const-string v0, "GPSDestBearing"

    .line 761
    .line 762
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    move-object/from16 v96, v0

    .line 767
    .line 768
    const-string v0, "GPSDestBearingRef"

    .line 769
    .line 770
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    move-object/from16 v97, v0

    .line 775
    .line 776
    const-string v0, "GPSDestDistance"

    .line 777
    .line 778
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    move-object/from16 v98, v0

    .line 783
    .line 784
    const-string v0, "GPSDestDistanceRef"

    .line 785
    .line 786
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    move-object/from16 v99, v0

    .line 791
    .line 792
    const-string v0, "GPSDestLatitude"

    .line 793
    .line 794
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    move-object/from16 v100, v0

    .line 799
    .line 800
    const-string v0, "GPSDestLatitudeRef"

    .line 801
    .line 802
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    move-object/from16 v101, v0

    .line 807
    .line 808
    const-string v0, "GPSDestLongitude"

    .line 809
    .line 810
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    move-object/from16 v102, v0

    .line 815
    .line 816
    const-string v0, "GPSDestLongitudeRef"

    .line 817
    .line 818
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    move-object/from16 v103, v0

    .line 823
    .line 824
    const-string v0, "GPSDifferential"

    .line 825
    .line 826
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    move-object/from16 v104, v0

    .line 831
    .line 832
    const-string v0, "GPSImgDirection"

    .line 833
    .line 834
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    move-object/from16 v105, v0

    .line 839
    .line 840
    const-string v0, "GPSImgDirectionRef"

    .line 841
    .line 842
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    move-object/from16 v106, v0

    .line 847
    .line 848
    const-string v0, "GPSLatitudeRef"

    .line 849
    .line 850
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    move-object/from16 v107, v0

    .line 855
    .line 856
    const-string v0, "GPSLongitudeRef"

    .line 857
    .line 858
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    move-object/from16 v108, v0

    .line 863
    .line 864
    const-string v0, "GPSMapDatum"

    .line 865
    .line 866
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    move-object/from16 v109, v0

    .line 871
    .line 872
    const-string v0, "GPSMeasureMode"

    .line 873
    .line 874
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    move-object/from16 v110, v0

    .line 879
    .line 880
    const-string v0, "GPSProcessingMethod"

    .line 881
    .line 882
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    move-object/from16 v111, v0

    .line 887
    .line 888
    const-string v0, "GPSSatellites"

    .line 889
    .line 890
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    move-object/from16 v112, v0

    .line 895
    .line 896
    const-string v0, "GPSSpeed"

    .line 897
    .line 898
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    move-object/from16 v113, v0

    .line 903
    .line 904
    const-string v0, "GPSSpeedRef"

    .line 905
    .line 906
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    move-object/from16 v114, v0

    .line 911
    .line 912
    const-string v0, "GPSStatus"

    .line 913
    .line 914
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    move-object/from16 v115, v0

    .line 919
    .line 920
    const-string v0, "GPSTimeStamp"

    .line 921
    .line 922
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    move-object/from16 v116, v0

    .line 927
    .line 928
    const-string v0, "GPSTrack"

    .line 929
    .line 930
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    const-string v2, "GPSTrackRef"

    .line 935
    .line 936
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v2

    .line 940
    move-object/from16 v117, v0

    .line 941
    .line 942
    const-string v0, "GPSVersionID"

    .line 943
    .line 944
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    move-object/from16 v118, v0

    .line 949
    .line 950
    const-string v0, "InteroperabilityIndex"

    .line 951
    .line 952
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    const-string v1, "ThumbnailImageLength"

    .line 957
    .line 958
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v119

    .line 962
    const-string v1, "ThumbnailImageWidth"

    .line 963
    .line 964
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v120

    .line 968
    const-string v1, "DNGVersion"

    .line 969
    .line 970
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v121

    .line 974
    const-string v1, "DefaultCropSize"

    .line 975
    .line 976
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v122

    .line 980
    const-string v1, "PreviewImageStart"

    .line 981
    .line 982
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v123

    .line 986
    const-string v1, "PreviewImageLength"

    .line 987
    .line 988
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v124

    .line 992
    const-string v1, "AspectFrame"

    .line 993
    .line 994
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object v125

    .line 998
    const-string v1, "SensorBottomBorder"

    .line 999
    .line 1000
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v126

    .line 1004
    const-string v1, "SensorLeftBorder"

    .line 1005
    .line 1006
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v127

    .line 1010
    const-string v1, "SensorRightBorder"

    .line 1011
    .line 1012
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v128

    .line 1016
    const-string v1, "SensorTopBorder"

    .line 1017
    .line 1018
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v129

    .line 1022
    const-string v1, "ISO"

    .line 1023
    .line 1024
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v130

    .line 1028
    move-object/from16 v3, v116

    .line 1029
    .line 1030
    move-object/from16 v116, v2

    .line 1031
    .line 1032
    move-object/from16 v2, v18

    .line 1033
    .line 1034
    move-object/from16 v18, v20

    .line 1035
    .line 1036
    move-object/from16 v20, v22

    .line 1037
    .line 1038
    move-object/from16 v22, v24

    .line 1039
    .line 1040
    move-object/from16 v24, v26

    .line 1041
    .line 1042
    move-object/from16 v26, v28

    .line 1043
    .line 1044
    move-object/from16 v28, v30

    .line 1045
    .line 1046
    move-object/from16 v30, v32

    .line 1047
    .line 1048
    move-object/from16 v32, v34

    .line 1049
    .line 1050
    move-object/from16 v34, v36

    .line 1051
    .line 1052
    move-object/from16 v36, v38

    .line 1053
    .line 1054
    move-object/from16 v38, v40

    .line 1055
    .line 1056
    move-object/from16 v40, v42

    .line 1057
    .line 1058
    move-object/from16 v42, v44

    .line 1059
    .line 1060
    move-object/from16 v44, v46

    .line 1061
    .line 1062
    move-object/from16 v46, v48

    .line 1063
    .line 1064
    move-object/from16 v48, v50

    .line 1065
    .line 1066
    move-object/from16 v50, v52

    .line 1067
    .line 1068
    move-object/from16 v52, v54

    .line 1069
    .line 1070
    move-object/from16 v54, v56

    .line 1071
    .line 1072
    move-object/from16 v56, v58

    .line 1073
    .line 1074
    move-object/from16 v58, v60

    .line 1075
    .line 1076
    move-object/from16 v60, v62

    .line 1077
    .line 1078
    move-object/from16 v62, v64

    .line 1079
    .line 1080
    move-object/from16 v64, v66

    .line 1081
    .line 1082
    move-object/from16 v66, v68

    .line 1083
    .line 1084
    move-object/from16 v68, v70

    .line 1085
    .line 1086
    move-object/from16 v70, v72

    .line 1087
    .line 1088
    move-object/from16 v72, v74

    .line 1089
    .line 1090
    move-object/from16 v74, v76

    .line 1091
    .line 1092
    move-object/from16 v76, v78

    .line 1093
    .line 1094
    move-object/from16 v78, v80

    .line 1095
    .line 1096
    move-object/from16 v80, v82

    .line 1097
    .line 1098
    move-object/from16 v82, v84

    .line 1099
    .line 1100
    move-object/from16 v84, v86

    .line 1101
    .line 1102
    move-object/from16 v86, v88

    .line 1103
    .line 1104
    move-object/from16 v88, v90

    .line 1105
    .line 1106
    move-object/from16 v90, v92

    .line 1107
    .line 1108
    move-object/from16 v92, v94

    .line 1109
    .line 1110
    move-object/from16 v94, v96

    .line 1111
    .line 1112
    move-object/from16 v96, v98

    .line 1113
    .line 1114
    move-object/from16 v98, v100

    .line 1115
    .line 1116
    move-object/from16 v100, v102

    .line 1117
    .line 1118
    move-object/from16 v102, v104

    .line 1119
    .line 1120
    move-object/from16 v104, v106

    .line 1121
    .line 1122
    move-object/from16 v106, v108

    .line 1123
    .line 1124
    move-object/from16 v108, v110

    .line 1125
    .line 1126
    move-object/from16 v110, v112

    .line 1127
    .line 1128
    move-object/from16 v112, v114

    .line 1129
    .line 1130
    move-object/from16 v114, v3

    .line 1131
    .line 1132
    move-object/from16 v3, v16

    .line 1133
    .line 1134
    move-object/from16 v16, v17

    .line 1135
    .line 1136
    move-object/from16 v17, v19

    .line 1137
    .line 1138
    move-object/from16 v19, v21

    .line 1139
    .line 1140
    move-object/from16 v21, v23

    .line 1141
    .line 1142
    move-object/from16 v23, v25

    .line 1143
    .line 1144
    move-object/from16 v25, v27

    .line 1145
    .line 1146
    move-object/from16 v27, v29

    .line 1147
    .line 1148
    move-object/from16 v29, v31

    .line 1149
    .line 1150
    move-object/from16 v31, v33

    .line 1151
    .line 1152
    move-object/from16 v33, v35

    .line 1153
    .line 1154
    move-object/from16 v35, v37

    .line 1155
    .line 1156
    move-object/from16 v37, v39

    .line 1157
    .line 1158
    move-object/from16 v39, v41

    .line 1159
    .line 1160
    move-object/from16 v41, v43

    .line 1161
    .line 1162
    move-object/from16 v43, v45

    .line 1163
    .line 1164
    move-object/from16 v45, v47

    .line 1165
    .line 1166
    move-object/from16 v47, v49

    .line 1167
    .line 1168
    move-object/from16 v49, v51

    .line 1169
    .line 1170
    move-object/from16 v51, v53

    .line 1171
    .line 1172
    move-object/from16 v53, v55

    .line 1173
    .line 1174
    move-object/from16 v55, v57

    .line 1175
    .line 1176
    move-object/from16 v57, v59

    .line 1177
    .line 1178
    move-object/from16 v59, v61

    .line 1179
    .line 1180
    move-object/from16 v61, v63

    .line 1181
    .line 1182
    move-object/from16 v63, v65

    .line 1183
    .line 1184
    move-object/from16 v65, v67

    .line 1185
    .line 1186
    move-object/from16 v67, v69

    .line 1187
    .line 1188
    move-object/from16 v69, v71

    .line 1189
    .line 1190
    move-object/from16 v71, v73

    .line 1191
    .line 1192
    move-object/from16 v73, v75

    .line 1193
    .line 1194
    move-object/from16 v75, v77

    .line 1195
    .line 1196
    move-object/from16 v77, v79

    .line 1197
    .line 1198
    move-object/from16 v79, v81

    .line 1199
    .line 1200
    move-object/from16 v81, v83

    .line 1201
    .line 1202
    move-object/from16 v83, v85

    .line 1203
    .line 1204
    move-object/from16 v85, v87

    .line 1205
    .line 1206
    move-object/from16 v87, v89

    .line 1207
    .line 1208
    move-object/from16 v89, v91

    .line 1209
    .line 1210
    move-object/from16 v91, v93

    .line 1211
    .line 1212
    move-object/from16 v93, v95

    .line 1213
    .line 1214
    move-object/from16 v95, v97

    .line 1215
    .line 1216
    move-object/from16 v97, v99

    .line 1217
    .line 1218
    move-object/from16 v99, v101

    .line 1219
    .line 1220
    move-object/from16 v101, v103

    .line 1221
    .line 1222
    move-object/from16 v103, v105

    .line 1223
    .line 1224
    move-object/from16 v105, v107

    .line 1225
    .line 1226
    move-object/from16 v107, v109

    .line 1227
    .line 1228
    move-object/from16 v109, v111

    .line 1229
    .line 1230
    move-object/from16 v111, v113

    .line 1231
    .line 1232
    move-object/from16 v113, v115

    .line 1233
    .line 1234
    move-object/from16 v115, v117

    .line 1235
    .line 1236
    move-object/from16 v117, v118

    .line 1237
    .line 1238
    move-object/from16 v118, v0

    .line 1239
    .line 1240
    filled-new-array/range {v2 .. v130}, [[Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v0

    .line 1244
    sput-object v0, Lexpo/modules/medialibrary/MediaLibraryConstantsKt;->EXIF_TAGS:[[Ljava/lang/String;

    .line 1245
    .line 1246
    return-void
.end method

.method public static final getASSET_PROJECTION()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/MediaLibraryConstantsKt;->ASSET_PROJECTION:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getEXIF_TAGS()[[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/MediaLibraryConstantsKt;->EXIF_TAGS:[[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getEXTERNAL_CONTENT_URI()Landroid/net/Uri;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/medialibrary/MediaLibraryConstantsKt;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method
