.class public final Lexpo/modules/camera/utils/ExifTagsKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u001f\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0007\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "VIDEO_2160P",
        "",
        "VIDEO_1080P",
        "VIDEO_720P",
        "VIDEO_480P",
        "VIDEO_4x3",
        "exifTags",
        "",
        "",
        "getExifTags",
        "()[[Ljava/lang/String;",
        "[[Ljava/lang/String;",
        "expo-camera_release"
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
.field public static final VIDEO_1080P:I = 0x1

.field public static final VIDEO_2160P:I = 0x0

.field public static final VIDEO_480P:I = 0x3

.field public static final VIDEO_4x3:I = 0x4

.field public static final VIDEO_720P:I = 0x2

.field private static final exifTags:[[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 135

    .line 1
    const-string v0, "Artist"

    .line 2
    .line 3
    const-string v1, "string"

    .line 4
    .line 5
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v0, "BitsPerSample"

    .line 10
    .line 11
    const-string v3, "int"

    .line 12
    .line 13
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v4, "Compression"

    .line 18
    .line 19
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const-string v5, "Copyright"

    .line 24
    .line 25
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-string v6, "DateTime"

    .line 30
    .line 31
    filled-new-array {v1, v6}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-string v7, "ImageDescription"

    .line 36
    .line 37
    filled-new-array {v1, v7}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    const-string v8, "ImageLength"

    .line 42
    .line 43
    filled-new-array {v3, v8}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    const-string v9, "ImageWidth"

    .line 48
    .line 49
    filled-new-array {v3, v9}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    const-string v10, "JPEGInterchangeFormat"

    .line 54
    .line 55
    filled-new-array {v3, v10}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    const-string v11, "JPEGInterchangeFormatLength"

    .line 60
    .line 61
    filled-new-array {v3, v11}, [Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v11

    .line 65
    const-string v12, "Make"

    .line 66
    .line 67
    filled-new-array {v1, v12}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    const-string v13, "Model"

    .line 72
    .line 73
    filled-new-array {v1, v13}, [Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v13

    .line 77
    const-string v14, "Orientation"

    .line 78
    .line 79
    filled-new-array {v3, v14}, [Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v14

    .line 83
    const-string v15, "PhotometricInterpretation"

    .line 84
    .line 85
    filled-new-array {v3, v15}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v15

    .line 89
    move-object/from16 v16, v0

    .line 90
    .line 91
    const-string v0, "PlanarConfiguration"

    .line 92
    .line 93
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object/from16 v17, v0

    .line 98
    .line 99
    const-string v0, "PrimaryChromaticities"

    .line 100
    .line 101
    move-object/from16 v18, v2

    .line 102
    .line 103
    const-string v2, "double"

    .line 104
    .line 105
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    move-object/from16 v19, v0

    .line 110
    .line 111
    const-string v0, "ReferenceBlackWhite"

    .line 112
    .line 113
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    move-object/from16 v20, v0

    .line 118
    .line 119
    const-string v0, "ResolutionUnit"

    .line 120
    .line 121
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    move-object/from16 v21, v0

    .line 126
    .line 127
    const-string v0, "RowsPerStrip"

    .line 128
    .line 129
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    move-object/from16 v22, v0

    .line 134
    .line 135
    const-string v0, "SamplesPerPixel"

    .line 136
    .line 137
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    move-object/from16 v23, v0

    .line 142
    .line 143
    const-string v0, "Software"

    .line 144
    .line 145
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    move-object/from16 v24, v0

    .line 150
    .line 151
    const-string v0, "StripByteCounts"

    .line 152
    .line 153
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    move-object/from16 v25, v0

    .line 158
    .line 159
    const-string v0, "StripOffsets"

    .line 160
    .line 161
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    move-object/from16 v26, v0

    .line 166
    .line 167
    const-string v0, "TransferFunction"

    .line 168
    .line 169
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move-object/from16 v27, v0

    .line 174
    .line 175
    const-string v0, "WhitePoint"

    .line 176
    .line 177
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    move-object/from16 v28, v0

    .line 182
    .line 183
    const-string v0, "XResolution"

    .line 184
    .line 185
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object/from16 v29, v0

    .line 190
    .line 191
    const-string v0, "YCbCrCoefficients"

    .line 192
    .line 193
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    move-object/from16 v30, v0

    .line 198
    .line 199
    const-string v0, "YCbCrPositioning"

    .line 200
    .line 201
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    move-object/from16 v31, v0

    .line 206
    .line 207
    const-string v0, "YCbCrSubSampling"

    .line 208
    .line 209
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    move-object/from16 v32, v0

    .line 214
    .line 215
    const-string v0, "YResolution"

    .line 216
    .line 217
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    move-object/from16 v33, v0

    .line 222
    .line 223
    const-string v0, "ApertureValue"

    .line 224
    .line 225
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    move-object/from16 v34, v0

    .line 230
    .line 231
    const-string v0, "BrightnessValue"

    .line 232
    .line 233
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    move-object/from16 v35, v0

    .line 238
    .line 239
    const-string v0, "CFAPattern"

    .line 240
    .line 241
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    move-object/from16 v36, v0

    .line 246
    .line 247
    const-string v0, "ColorSpace"

    .line 248
    .line 249
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    move-object/from16 v37, v0

    .line 254
    .line 255
    const-string v0, "ComponentsConfiguration"

    .line 256
    .line 257
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    move-object/from16 v38, v0

    .line 262
    .line 263
    const-string v0, "CompressedBitsPerPixel"

    .line 264
    .line 265
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    move-object/from16 v39, v0

    .line 270
    .line 271
    const-string v0, "Contrast"

    .line 272
    .line 273
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    move-object/from16 v40, v0

    .line 278
    .line 279
    const-string v0, "CustomRendered"

    .line 280
    .line 281
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    move-object/from16 v41, v0

    .line 286
    .line 287
    const-string v0, "DateTimeDigitized"

    .line 288
    .line 289
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    move-object/from16 v42, v0

    .line 294
    .line 295
    const-string v0, "DateTimeOriginal"

    .line 296
    .line 297
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    move-object/from16 v43, v0

    .line 302
    .line 303
    const-string v0, "DeviceSettingDescription"

    .line 304
    .line 305
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    move-object/from16 v44, v0

    .line 310
    .line 311
    const-string v0, "DigitalZoomRatio"

    .line 312
    .line 313
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    move-object/from16 v45, v0

    .line 318
    .line 319
    const-string v0, "ExifVersion"

    .line 320
    .line 321
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    move-object/from16 v46, v0

    .line 326
    .line 327
    const-string v0, "ExposureBiasValue"

    .line 328
    .line 329
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    move-object/from16 v47, v0

    .line 334
    .line 335
    const-string v0, "ExposureIndex"

    .line 336
    .line 337
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    move-object/from16 v48, v0

    .line 342
    .line 343
    const-string v0, "ExposureMode"

    .line 344
    .line 345
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    move-object/from16 v49, v0

    .line 350
    .line 351
    const-string v0, "ExposureProgram"

    .line 352
    .line 353
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    move-object/from16 v50, v0

    .line 358
    .line 359
    const-string v0, "ExposureTime"

    .line 360
    .line 361
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    move-object/from16 v51, v0

    .line 366
    .line 367
    const-string v0, "FNumber"

    .line 368
    .line 369
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    move-object/from16 v52, v0

    .line 374
    .line 375
    const-string v0, "FileSource"

    .line 376
    .line 377
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    move-object/from16 v53, v0

    .line 382
    .line 383
    const-string v0, "Flash"

    .line 384
    .line 385
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    move-object/from16 v54, v0

    .line 390
    .line 391
    const-string v0, "FlashEnergy"

    .line 392
    .line 393
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    move-object/from16 v55, v0

    .line 398
    .line 399
    const-string v0, "FlashpixVersion"

    .line 400
    .line 401
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    move-object/from16 v56, v0

    .line 406
    .line 407
    const-string v0, "FocalLength"

    .line 408
    .line 409
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    move-object/from16 v57, v0

    .line 414
    .line 415
    const-string v0, "FocalLengthIn35mmFilm"

    .line 416
    .line 417
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    move-object/from16 v58, v0

    .line 422
    .line 423
    const-string v0, "FocalPlaneResolutionUnit"

    .line 424
    .line 425
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    move-object/from16 v59, v0

    .line 430
    .line 431
    const-string v0, "FocalPlaneXResolution"

    .line 432
    .line 433
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    move-object/from16 v60, v0

    .line 438
    .line 439
    const-string v0, "FocalPlaneYResolution"

    .line 440
    .line 441
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    move-object/from16 v61, v0

    .line 446
    .line 447
    const-string v0, "GainControl"

    .line 448
    .line 449
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    move-object/from16 v62, v0

    .line 454
    .line 455
    const-string v0, "ISOSpeedRatings"

    .line 456
    .line 457
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    move-object/from16 v63, v0

    .line 462
    .line 463
    const-string v0, "ImageUniqueID"

    .line 464
    .line 465
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    move-object/from16 v64, v0

    .line 470
    .line 471
    const-string v0, "LightSource"

    .line 472
    .line 473
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    move-object/from16 v65, v0

    .line 478
    .line 479
    const-string v0, "MakerNote"

    .line 480
    .line 481
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    move-object/from16 v66, v0

    .line 486
    .line 487
    const-string v0, "MaxApertureValue"

    .line 488
    .line 489
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    move-object/from16 v67, v0

    .line 494
    .line 495
    const-string v0, "MeteringMode"

    .line 496
    .line 497
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    move-object/from16 v68, v0

    .line 502
    .line 503
    const-string v0, "NewSubfileType"

    .line 504
    .line 505
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    move-object/from16 v69, v0

    .line 510
    .line 511
    const-string v0, "OECF"

    .line 512
    .line 513
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    move-object/from16 v70, v0

    .line 518
    .line 519
    const-string v0, "PixelXDimension"

    .line 520
    .line 521
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    move-object/from16 v71, v0

    .line 526
    .line 527
    const-string v0, "PixelYDimension"

    .line 528
    .line 529
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    move-object/from16 v72, v0

    .line 534
    .line 535
    const-string v0, "RelatedSoundFile"

    .line 536
    .line 537
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    move-object/from16 v73, v0

    .line 542
    .line 543
    const-string v0, "Saturation"

    .line 544
    .line 545
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    move-object/from16 v74, v0

    .line 550
    .line 551
    const-string v0, "SceneCaptureType"

    .line 552
    .line 553
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    move-object/from16 v75, v0

    .line 558
    .line 559
    const-string v0, "SceneType"

    .line 560
    .line 561
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    move-object/from16 v76, v0

    .line 566
    .line 567
    const-string v0, "SensingMethod"

    .line 568
    .line 569
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    move-object/from16 v77, v0

    .line 574
    .line 575
    const-string v0, "Sharpness"

    .line 576
    .line 577
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    move-object/from16 v78, v0

    .line 582
    .line 583
    const-string v0, "ShutterSpeedValue"

    .line 584
    .line 585
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    move-object/from16 v79, v0

    .line 590
    .line 591
    const-string v0, "SpatialFrequencyResponse"

    .line 592
    .line 593
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    move-object/from16 v80, v0

    .line 598
    .line 599
    const-string v0, "SpectralSensitivity"

    .line 600
    .line 601
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    move-object/from16 v81, v0

    .line 606
    .line 607
    const-string v0, "SubfileType"

    .line 608
    .line 609
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    move-object/from16 v82, v0

    .line 614
    .line 615
    const-string v0, "SubSecTime"

    .line 616
    .line 617
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    move-object/from16 v83, v0

    .line 622
    .line 623
    const-string v0, "SubSecTimeDigitized"

    .line 624
    .line 625
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    move-object/from16 v84, v0

    .line 630
    .line 631
    const-string v0, "SubSecTimeOriginal"

    .line 632
    .line 633
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    move-object/from16 v85, v0

    .line 638
    .line 639
    const-string v0, "SubjectArea"

    .line 640
    .line 641
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    move-object/from16 v86, v0

    .line 646
    .line 647
    const-string v0, "SubjectDistance"

    .line 648
    .line 649
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    move-object/from16 v87, v0

    .line 654
    .line 655
    const-string v0, "SubjectDistanceRange"

    .line 656
    .line 657
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    move-object/from16 v88, v0

    .line 662
    .line 663
    const-string v0, "SubjectLocation"

    .line 664
    .line 665
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    move-object/from16 v89, v0

    .line 670
    .line 671
    const-string v0, "UserComment"

    .line 672
    .line 673
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    move-object/from16 v90, v0

    .line 678
    .line 679
    const-string v0, "WhiteBalance"

    .line 680
    .line 681
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    move-object/from16 v91, v0

    .line 686
    .line 687
    const-string v0, "GPSAltitude"

    .line 688
    .line 689
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    move-object/from16 v92, v0

    .line 694
    .line 695
    const-string v0, "GPSAltitudeRef"

    .line 696
    .line 697
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    move-object/from16 v93, v0

    .line 702
    .line 703
    const-string v0, "GPSAreaInformation"

    .line 704
    .line 705
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    move-object/from16 v94, v0

    .line 710
    .line 711
    const-string v0, "GPSDOP"

    .line 712
    .line 713
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    move-object/from16 v95, v0

    .line 718
    .line 719
    const-string v0, "GPSDateStamp"

    .line 720
    .line 721
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    move-object/from16 v96, v0

    .line 726
    .line 727
    const-string v0, "GPSDestBearing"

    .line 728
    .line 729
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    move-object/from16 v97, v0

    .line 734
    .line 735
    const-string v0, "GPSDestBearingRef"

    .line 736
    .line 737
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    move-object/from16 v98, v0

    .line 742
    .line 743
    const-string v0, "GPSDestDistance"

    .line 744
    .line 745
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    move-object/from16 v99, v0

    .line 750
    .line 751
    const-string v0, "GPSDestDistanceRef"

    .line 752
    .line 753
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    move-object/from16 v100, v0

    .line 758
    .line 759
    const-string v0, "GPSDestLatitude"

    .line 760
    .line 761
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    move-object/from16 v101, v0

    .line 766
    .line 767
    const-string v0, "GPSDestLatitudeRef"

    .line 768
    .line 769
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    move-object/from16 v102, v0

    .line 774
    .line 775
    const-string v0, "GPSDestLongitude"

    .line 776
    .line 777
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    move-object/from16 v103, v0

    .line 782
    .line 783
    const-string v0, "GPSDestLongitudeRef"

    .line 784
    .line 785
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    move-object/from16 v104, v0

    .line 790
    .line 791
    const-string v0, "GPSDifferential"

    .line 792
    .line 793
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    move-object/from16 v105, v0

    .line 798
    .line 799
    const-string v0, "GPSHPositioningError"

    .line 800
    .line 801
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    move-object/from16 v106, v0

    .line 806
    .line 807
    const-string v0, "GPSImgDirection"

    .line 808
    .line 809
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    move-object/from16 v107, v0

    .line 814
    .line 815
    const-string v0, "GPSImgDirectionRef"

    .line 816
    .line 817
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    move-object/from16 v108, v0

    .line 822
    .line 823
    const-string v0, "GPSLatitude"

    .line 824
    .line 825
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    move-object/from16 v109, v0

    .line 830
    .line 831
    const-string v0, "GPSLatitudeRef"

    .line 832
    .line 833
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    move-object/from16 v110, v0

    .line 838
    .line 839
    const-string v0, "GPSLongitude"

    .line 840
    .line 841
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    move-object/from16 v111, v0

    .line 846
    .line 847
    const-string v0, "GPSLongitudeRef"

    .line 848
    .line 849
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    move-object/from16 v112, v0

    .line 854
    .line 855
    const-string v0, "GPSMapDatum"

    .line 856
    .line 857
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    move-object/from16 v113, v0

    .line 862
    .line 863
    const-string v0, "GPSMeasureMode"

    .line 864
    .line 865
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    move-object/from16 v114, v0

    .line 870
    .line 871
    const-string v0, "GPSProcessingMethod"

    .line 872
    .line 873
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    move-object/from16 v115, v0

    .line 878
    .line 879
    const-string v0, "GPSSatellites"

    .line 880
    .line 881
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    move-object/from16 v116, v0

    .line 886
    .line 887
    const-string v0, "GPSSpeed"

    .line 888
    .line 889
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    move-object/from16 v117, v0

    .line 894
    .line 895
    const-string v0, "GPSSpeedRef"

    .line 896
    .line 897
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    move-object/from16 v118, v0

    .line 902
    .line 903
    const-string v0, "GPSStatus"

    .line 904
    .line 905
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    move-object/from16 v119, v0

    .line 910
    .line 911
    const-string v0, "GPSTimeStamp"

    .line 912
    .line 913
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    move-object/from16 v120, v0

    .line 918
    .line 919
    const-string v0, "GPSTrack"

    .line 920
    .line 921
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    const-string v2, "GPSTrackRef"

    .line 926
    .line 927
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    move-object/from16 v121, v0

    .line 932
    .line 933
    const-string v0, "GPSVersionID"

    .line 934
    .line 935
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    move-object/from16 v122, v0

    .line 940
    .line 941
    const-string v0, "InteroperabilityIndex"

    .line 942
    .line 943
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    const-string v1, "ThumbnailImageLength"

    .line 948
    .line 949
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v123

    .line 953
    const-string v1, "ThumbnailImageWidth"

    .line 954
    .line 955
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v124

    .line 959
    const-string v1, "DNGVersion"

    .line 960
    .line 961
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v125

    .line 965
    const-string v1, "DefaultCropSize"

    .line 966
    .line 967
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v126

    .line 971
    const-string v1, "PreviewImageStart"

    .line 972
    .line 973
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v127

    .line 977
    const-string v1, "PreviewImageLength"

    .line 978
    .line 979
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v128

    .line 983
    const-string v1, "AspectFrame"

    .line 984
    .line 985
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v129

    .line 989
    const-string v1, "SensorBottomBorder"

    .line 990
    .line 991
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v130

    .line 995
    const-string v1, "SensorLeftBorder"

    .line 996
    .line 997
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v131

    .line 1001
    const-string v1, "SensorRightBorder"

    .line 1002
    .line 1003
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v132

    .line 1007
    const-string v1, "SensorTopBorder"

    .line 1008
    .line 1009
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v133

    .line 1013
    const-string v1, "ISO"

    .line 1014
    .line 1015
    filled-new-array {v3, v1}, [Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v134

    .line 1019
    move-object/from16 v3, v120

    .line 1020
    .line 1021
    move-object/from16 v120, v2

    .line 1022
    .line 1023
    move-object/from16 v2, v18

    .line 1024
    .line 1025
    move-object/from16 v18, v20

    .line 1026
    .line 1027
    move-object/from16 v20, v22

    .line 1028
    .line 1029
    move-object/from16 v22, v24

    .line 1030
    .line 1031
    move-object/from16 v24, v26

    .line 1032
    .line 1033
    move-object/from16 v26, v28

    .line 1034
    .line 1035
    move-object/from16 v28, v30

    .line 1036
    .line 1037
    move-object/from16 v30, v32

    .line 1038
    .line 1039
    move-object/from16 v32, v34

    .line 1040
    .line 1041
    move-object/from16 v34, v36

    .line 1042
    .line 1043
    move-object/from16 v36, v38

    .line 1044
    .line 1045
    move-object/from16 v38, v40

    .line 1046
    .line 1047
    move-object/from16 v40, v42

    .line 1048
    .line 1049
    move-object/from16 v42, v44

    .line 1050
    .line 1051
    move-object/from16 v44, v46

    .line 1052
    .line 1053
    move-object/from16 v46, v48

    .line 1054
    .line 1055
    move-object/from16 v48, v50

    .line 1056
    .line 1057
    move-object/from16 v50, v52

    .line 1058
    .line 1059
    move-object/from16 v52, v54

    .line 1060
    .line 1061
    move-object/from16 v54, v56

    .line 1062
    .line 1063
    move-object/from16 v56, v58

    .line 1064
    .line 1065
    move-object/from16 v58, v60

    .line 1066
    .line 1067
    move-object/from16 v60, v62

    .line 1068
    .line 1069
    move-object/from16 v62, v64

    .line 1070
    .line 1071
    move-object/from16 v64, v66

    .line 1072
    .line 1073
    move-object/from16 v66, v68

    .line 1074
    .line 1075
    move-object/from16 v68, v70

    .line 1076
    .line 1077
    move-object/from16 v70, v72

    .line 1078
    .line 1079
    move-object/from16 v72, v74

    .line 1080
    .line 1081
    move-object/from16 v74, v76

    .line 1082
    .line 1083
    move-object/from16 v76, v78

    .line 1084
    .line 1085
    move-object/from16 v78, v80

    .line 1086
    .line 1087
    move-object/from16 v80, v82

    .line 1088
    .line 1089
    move-object/from16 v82, v84

    .line 1090
    .line 1091
    move-object/from16 v84, v86

    .line 1092
    .line 1093
    move-object/from16 v86, v88

    .line 1094
    .line 1095
    move-object/from16 v88, v90

    .line 1096
    .line 1097
    move-object/from16 v90, v92

    .line 1098
    .line 1099
    move-object/from16 v92, v94

    .line 1100
    .line 1101
    move-object/from16 v94, v96

    .line 1102
    .line 1103
    move-object/from16 v96, v98

    .line 1104
    .line 1105
    move-object/from16 v98, v100

    .line 1106
    .line 1107
    move-object/from16 v100, v102

    .line 1108
    .line 1109
    move-object/from16 v102, v104

    .line 1110
    .line 1111
    move-object/from16 v104, v106

    .line 1112
    .line 1113
    move-object/from16 v106, v108

    .line 1114
    .line 1115
    move-object/from16 v108, v110

    .line 1116
    .line 1117
    move-object/from16 v110, v112

    .line 1118
    .line 1119
    move-object/from16 v112, v114

    .line 1120
    .line 1121
    move-object/from16 v114, v116

    .line 1122
    .line 1123
    move-object/from16 v116, v118

    .line 1124
    .line 1125
    move-object/from16 v118, v3

    .line 1126
    .line 1127
    move-object/from16 v3, v16

    .line 1128
    .line 1129
    move-object/from16 v16, v17

    .line 1130
    .line 1131
    move-object/from16 v17, v19

    .line 1132
    .line 1133
    move-object/from16 v19, v21

    .line 1134
    .line 1135
    move-object/from16 v21, v23

    .line 1136
    .line 1137
    move-object/from16 v23, v25

    .line 1138
    .line 1139
    move-object/from16 v25, v27

    .line 1140
    .line 1141
    move-object/from16 v27, v29

    .line 1142
    .line 1143
    move-object/from16 v29, v31

    .line 1144
    .line 1145
    move-object/from16 v31, v33

    .line 1146
    .line 1147
    move-object/from16 v33, v35

    .line 1148
    .line 1149
    move-object/from16 v35, v37

    .line 1150
    .line 1151
    move-object/from16 v37, v39

    .line 1152
    .line 1153
    move-object/from16 v39, v41

    .line 1154
    .line 1155
    move-object/from16 v41, v43

    .line 1156
    .line 1157
    move-object/from16 v43, v45

    .line 1158
    .line 1159
    move-object/from16 v45, v47

    .line 1160
    .line 1161
    move-object/from16 v47, v49

    .line 1162
    .line 1163
    move-object/from16 v49, v51

    .line 1164
    .line 1165
    move-object/from16 v51, v53

    .line 1166
    .line 1167
    move-object/from16 v53, v55

    .line 1168
    .line 1169
    move-object/from16 v55, v57

    .line 1170
    .line 1171
    move-object/from16 v57, v59

    .line 1172
    .line 1173
    move-object/from16 v59, v61

    .line 1174
    .line 1175
    move-object/from16 v61, v63

    .line 1176
    .line 1177
    move-object/from16 v63, v65

    .line 1178
    .line 1179
    move-object/from16 v65, v67

    .line 1180
    .line 1181
    move-object/from16 v67, v69

    .line 1182
    .line 1183
    move-object/from16 v69, v71

    .line 1184
    .line 1185
    move-object/from16 v71, v73

    .line 1186
    .line 1187
    move-object/from16 v73, v75

    .line 1188
    .line 1189
    move-object/from16 v75, v77

    .line 1190
    .line 1191
    move-object/from16 v77, v79

    .line 1192
    .line 1193
    move-object/from16 v79, v81

    .line 1194
    .line 1195
    move-object/from16 v81, v83

    .line 1196
    .line 1197
    move-object/from16 v83, v85

    .line 1198
    .line 1199
    move-object/from16 v85, v87

    .line 1200
    .line 1201
    move-object/from16 v87, v89

    .line 1202
    .line 1203
    move-object/from16 v89, v91

    .line 1204
    .line 1205
    move-object/from16 v91, v93

    .line 1206
    .line 1207
    move-object/from16 v93, v95

    .line 1208
    .line 1209
    move-object/from16 v95, v97

    .line 1210
    .line 1211
    move-object/from16 v97, v99

    .line 1212
    .line 1213
    move-object/from16 v99, v101

    .line 1214
    .line 1215
    move-object/from16 v101, v103

    .line 1216
    .line 1217
    move-object/from16 v103, v105

    .line 1218
    .line 1219
    move-object/from16 v105, v107

    .line 1220
    .line 1221
    move-object/from16 v107, v109

    .line 1222
    .line 1223
    move-object/from16 v109, v111

    .line 1224
    .line 1225
    move-object/from16 v111, v113

    .line 1226
    .line 1227
    move-object/from16 v113, v115

    .line 1228
    .line 1229
    move-object/from16 v115, v117

    .line 1230
    .line 1231
    move-object/from16 v117, v119

    .line 1232
    .line 1233
    move-object/from16 v119, v121

    .line 1234
    .line 1235
    move-object/from16 v121, v122

    .line 1236
    .line 1237
    move-object/from16 v122, v0

    .line 1238
    .line 1239
    filled-new-array/range {v2 .. v134}, [[Ljava/lang/String;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v0

    .line 1243
    sput-object v0, Lexpo/modules/camera/utils/ExifTagsKt;->exifTags:[[Ljava/lang/String;

    .line 1244
    .line 1245
    return-void
.end method

.method public static final getExifTags()[[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/camera/utils/ExifTagsKt;->exifTags:[[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
