.class public Lcom/ov/message/SmsReadModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final MODULE_NAME:Ljava/lang/String; = "SmsReadModule"

.field private static final TAG:Ljava/lang/String; = "SmsReadModule"


# instance fields
.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/ov/message/SmsReadModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "SmsReadModule"

    .line 2
    .line 3
    return-object v0
.end method

.method public isReady(Lcom/facebook/react/bridge/Promise;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ready"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const-string v3, "androidVersion"

    .line 14
    .line 15
    invoke-interface {v0, v3, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    const/16 v3, 0x1f

    .line 19
    .line 20
    if-lt v1, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    :goto_0
    const-string v1, "android12Plus"

    .line 25
    .line 26
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public list(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
    .locals 22
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const-string v0, "%"

    .line 6
    .line 7
    const-string v3, "inbox"

    .line 8
    .line 9
    const-string v4, "date DESC"

    .line 10
    .line 11
    const-string v5, "address"

    .line 12
    .line 13
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    .line 14
    .line 15
    move-object/from16 v7, p1

    .line 16
    .line 17
    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v7, "box"

    .line 21
    .line 22
    invoke-virtual {v6, v7, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    const/4 v8, 0x0

    .line 27
    invoke-virtual {v6, v5, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    const-string v10, "maxCount"

    .line 32
    .line 33
    const/16 v11, 0x32

    .line 34
    .line 35
    invoke-virtual {v6, v10, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    const-string v11, "sort"

    .line 40
    .line 41
    invoke-virtual {v6, v11, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    const v12, 0x35cf98

    .line 54
    .line 55
    .line 56
    const-string v13, "sent"

    .line 57
    .line 58
    if-eq v11, v12, :cond_2

    .line 59
    .line 60
    const v12, 0x5b679a1

    .line 61
    .line 62
    .line 63
    if-eq v11, v12, :cond_1

    .line 64
    .line 65
    const v12, 0x5fb2286

    .line 66
    .line 67
    .line 68
    if-eq v11, v12, :cond_0

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_0
    :try_start_1
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    goto :goto_1

    .line 76
    :catch_0
    move-exception v0

    .line 77
    goto/16 :goto_12

    .line 78
    .line 79
    :cond_1
    const-string v3, "draft"

    .line 80
    .line 81
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_3

    .line 86
    .line 87
    const-string v3, "content://sms/draft"

    .line 88
    .line 89
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    :goto_0
    move-object v15, v3

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_3

    .line 100
    .line 101
    const-string v3, "content://sms/sent"

    .line 102
    .line 103
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    goto :goto_0

    .line 108
    :cond_3
    :goto_1
    const-string v3, "content://sms/inbox"

    .line 109
    .line 110
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    goto :goto_0

    .line 115
    :goto_2
    const-string v16, "_id"

    .line 116
    .line 117
    const-string v17, "address"

    .line 118
    .line 119
    const-string v18, "body"

    .line 120
    .line 121
    const-string v19, "date"

    .line 122
    .line 123
    const-string v20, "type"

    .line 124
    .line 125
    const-string v21, "read"

    .line 126
    .line 127
    filled-new-array/range {v16 .. v21}, [Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v16

    .line 131
    new-instance v3, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    new-instance v7, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    if-eqz v9, :cond_4

    .line 142
    .line 143
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    if-nez v11, :cond_4

    .line 152
    .line 153
    iget-object v11, v1, Lcom/ov/message/SmsReadModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 154
    .line 155
    invoke-static {v9, v11}, Lcom/ov/message/PhoneNumberUtils;->normalizePhoneNumber(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    const-string v11, "("

    .line 160
    .line 161
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v11, " = ? OR "

    .line 168
    .line 169
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v11, " LIKE ?"

    .line 176
    .line 177
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v11, ")"

    .line 181
    .line 182
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    new-instance v11, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    :cond_4
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-lez v0, :cond_5

    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    move-object/from16 v17, v0

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_5
    move-object/from16 v17, v8

    .line 223
    .line 224
    :goto_3
    const/4 v0, 0x0

    .line 225
    new-array v3, v0, [Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    move-object/from16 v18, v3

    .line 232
    .line 233
    check-cast v18, [Ljava/lang/String;

    .line 234
    .line 235
    if-eqz v6, :cond_6

    .line 236
    .line 237
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-nez v3, :cond_6

    .line 242
    .line 243
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    const-string v6, "asc"

    .line 248
    .line 249
    invoke-virtual {v3, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-eqz v3, :cond_6

    .line 254
    .line 255
    const-string v4, "date ASC"

    .line 256
    .line 257
    :cond_6
    move-object/from16 v19, v4

    .line 258
    .line 259
    iget-object v3, v1, Lcom/ov/message/SmsReadModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 260
    .line 261
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 262
    .line 263
    .line 264
    move-result-object v14
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 265
    :try_start_2
    invoke-virtual/range {v14 .. v19}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    if-nez v8, :cond_7

    .line 270
    .line 271
    const-string v0, "[]"

    .line 272
    .line 273
    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 274
    .line 275
    .line 276
    if-eqz v8, :cond_10

    .line 277
    .line 278
    :try_start_3
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :catchall_0
    move-exception v0

    .line 283
    goto/16 :goto_11

    .line 284
    .line 285
    :catch_1
    move-exception v0

    .line 286
    goto/16 :goto_e

    .line 287
    .line 288
    :cond_7
    :try_start_4
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    move v4, v0

    .line 293
    :goto_4
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    .line 294
    .line 295
    .line 296
    move-result v6
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_8
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 297
    const-string v7, "read"

    .line 298
    .line 299
    const-string v9, "type"

    .line 300
    .line 301
    const-string v11, "date"

    .line 302
    .line 303
    const-string v12, "body"

    .line 304
    .line 305
    const-string v14, "_id"

    .line 306
    .line 307
    if-eqz v6, :cond_d

    .line 308
    .line 309
    if-ge v4, v10, :cond_d

    .line 310
    .line 311
    :try_start_5
    invoke-interface {v8, v14}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 312
    .line 313
    .line 314
    move-result v6

    .line 315
    invoke-interface {v8, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 316
    .line 317
    .line 318
    move-result v15

    .line 319
    invoke-interface {v8, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    move-result v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 323
    move/from16 v16, v4

    .line 324
    .line 325
    :try_start_6
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v4
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 329
    move/from16 v17, v10

    .line 330
    .line 331
    :try_start_7
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 332
    .line 333
    .line 334
    move-result v10
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 335
    move-object/from16 v18, v13

    .line 336
    .line 337
    :try_start_8
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 338
    .line 339
    .line 340
    move-result v13

    .line 341
    const/4 v2, -0x1

    .line 342
    if-eq v6, v2, :cond_c

    .line 343
    .line 344
    if-eq v15, v2, :cond_c

    .line 345
    .line 346
    if-eq v0, v2, :cond_c

    .line 347
    .line 348
    if-eq v4, v2, :cond_c

    .line 349
    .line 350
    if-ne v10, v2, :cond_8

    .line 351
    .line 352
    goto/16 :goto_b

    .line 353
    .line 354
    :cond_8
    invoke-interface {v8, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    invoke-interface {v8, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v15

    .line 362
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-interface {v8, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 367
    .line 368
    .line 369
    move-result-wide v19

    .line 370
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getInt(I)I

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    if-eq v13, v2, :cond_9

    .line 375
    .line 376
    invoke-interface {v8, v13}, Landroid/database/Cursor;->getInt(I)I

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    goto :goto_5

    .line 381
    :catchall_1
    move-exception v0

    .line 382
    move-object/from16 v2, p2

    .line 383
    .line 384
    goto/16 :goto_11

    .line 385
    .line 386
    :cond_9
    const/4 v2, 0x0

    .line 387
    :goto_5
    iget-object v10, v1, Lcom/ov/message/SmsReadModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 388
    .line 389
    invoke-static {v15, v10}, Lcom/ov/message/PhoneNumberUtils;->normalizePhoneNumber(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v10

    .line 393
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 394
    .line 395
    .line 396
    move-result-object v13

    .line 397
    invoke-interface {v13, v14, v6}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    invoke-interface {v13, v5, v10}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    if-eqz v0, :cond_a

    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_a
    const-string v0, ""

    .line 407
    .line 408
    :goto_6
    invoke-interface {v13, v12, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-interface {v13, v11, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    const/4 v0, 0x2

    .line 419
    if-ne v4, v0, :cond_b

    .line 420
    .line 421
    move-object/from16 v0, v18

    .line 422
    .line 423
    goto :goto_7

    .line 424
    :cond_b
    const-string v0, "received"

    .line 425
    .line 426
    :goto_7
    invoke-interface {v13, v9, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    invoke-interface {v13, v7, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 430
    .line 431
    .line 432
    invoke-interface {v3, v13}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 433
    .line 434
    .line 435
    add-int/lit8 v4, v16, 0x1

    .line 436
    .line 437
    move-object/from16 v2, p2

    .line 438
    .line 439
    :goto_8
    move/from16 v10, v17

    .line 440
    .line 441
    move-object/from16 v13, v18

    .line 442
    .line 443
    const/4 v0, 0x0

    .line 444
    goto/16 :goto_4

    .line 445
    .line 446
    :catch_2
    :goto_9
    move-object/from16 v18, v13

    .line 447
    .line 448
    goto :goto_b

    .line 449
    :catch_3
    :goto_a
    move/from16 v17, v10

    .line 450
    .line 451
    goto :goto_9

    .line 452
    :catch_4
    move/from16 v16, v4

    .line 453
    .line 454
    goto :goto_a

    .line 455
    :catch_5
    :cond_c
    :goto_b
    move-object/from16 v2, p2

    .line 456
    .line 457
    move/from16 v4, v16

    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_d
    :try_start_9
    new-instance v0, Lorg/json/JSONArray;

    .line 461
    .line 462
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 463
    .line 464
    .line 465
    const/4 v2, 0x0

    .line 466
    :goto_c
    invoke-interface {v3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    if-ge v2, v4, :cond_e

    .line 471
    .line 472
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    new-instance v6, Lorg/json/JSONObject;

    .line 477
    .line 478
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 479
    .line 480
    .line 481
    invoke-interface {v4, v14}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v10

    .line 485
    invoke-virtual {v6, v14, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 486
    .line 487
    .line 488
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v10

    .line 492
    invoke-virtual {v6, v5, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 493
    .line 494
    .line 495
    invoke-interface {v4, v12}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v10

    .line 499
    invoke-virtual {v6, v12, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 500
    .line 501
    .line 502
    invoke-interface {v4, v11}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v10

    .line 506
    invoke-virtual {v6, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 507
    .line 508
    .line 509
    invoke-interface {v4, v9}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v10

    .line 513
    invoke-virtual {v6, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 514
    .line 515
    .line 516
    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 517
    .line 518
    .line 519
    move-result v4

    .line 520
    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 524
    .line 525
    .line 526
    add-int/lit8 v2, v2, 0x1

    .line 527
    .line 528
    goto :goto_c

    .line 529
    :catch_6
    move-exception v0

    .line 530
    move-object/from16 v2, p2

    .line 531
    .line 532
    goto :goto_e

    .line 533
    :catch_7
    move-object/from16 v2, p2

    .line 534
    .line 535
    goto :goto_10

    .line 536
    :cond_e
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v0
    :try_end_9
    .catch Ljava/lang/SecurityException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 540
    move-object/from16 v2, p2

    .line 541
    .line 542
    :try_start_a
    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/SecurityException; {:try_start_a .. :try_end_a} :catch_8
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 543
    .line 544
    .line 545
    :goto_d
    :try_start_b
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    .line 546
    .line 547
    .line 548
    goto :goto_13

    .line 549
    :goto_e
    :try_start_c
    const-string v3, "READ_ERROR"

    .line 550
    .line 551
    new-instance v4, Ljava/lang/StringBuilder;

    .line 552
    .line 553
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 554
    .line 555
    .line 556
    const-string v5, "Erreur de lecture: "

    .line 557
    .line 558
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-interface {v2, v3, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    if-eqz v8, :cond_10

    .line 576
    .line 577
    :goto_f
    goto :goto_d

    .line 578
    :catch_8
    :goto_10
    const-string v0, "PERMISSION_DENIED"

    .line 579
    .line 580
    const-string v3, "Permission READ_SMS non accord\u00e9e"

    .line 581
    .line 582
    invoke-interface {v2, v0, v3}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 583
    .line 584
    .line 585
    if-eqz v8, :cond_10

    .line 586
    .line 587
    goto :goto_f

    .line 588
    :goto_11
    if-eqz v8, :cond_f

    .line 589
    .line 590
    :try_start_d
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 591
    .line 592
    .line 593
    :cond_f
    throw v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    .line 594
    :goto_12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 595
    .line 596
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 597
    .line 598
    .line 599
    const-string v4, "Erreur parsing filtres: "

    .line 600
    .line 601
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    const-string v3, "PARSE_ERROR"

    .line 616
    .line 617
    invoke-interface {v2, v3, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    :cond_10
    :goto_13
    return-void
.end method
