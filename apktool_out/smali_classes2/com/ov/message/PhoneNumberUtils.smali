.class public Lcom/ov/message/PhoneNumberUtils;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final KEY_MY_PHONE_NUMBER:Ljava/lang/String; = "my_phone_number"

.field private static final PREFS_NAME:Ljava/lang/String; = "OVMessagePrefs"

.field private static final TAG:Ljava/lang/String; = "PhoneNumberUtils"

.field private static phoneUtil:LT5/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LT5/e;->t()LT5/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static fixLeadingZeroAfterPrefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-string v9, "+351"

    .line 12
    .line 13
    const-string v10, "+44"

    .line 14
    .line 15
    const-string v2, "+33"

    .line 16
    .line 17
    const-string v3, "+32"

    .line 18
    .line 19
    const-string v4, "+31"

    .line 20
    .line 21
    const-string v5, "+41"

    .line 22
    .line 23
    const-string v6, "+49"

    .line 24
    .line 25
    const-string v7, "+39"

    .line 26
    .line 27
    const-string v8, "+34"

    .line 28
    .line 29
    filled-new-array/range {v2 .. v10}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x0

    .line 34
    :goto_0
    const/16 v2, 0x9

    .line 35
    .line 36
    if-ge v1, v2, :cond_2

    .line 37
    .line 38
    aget-object v2, v0, v1

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-le v3, v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    const/16 v4, 0x30

    .line 65
    .line 66
    if-ne v3, v4, :cond_1

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const-string v0, "^0+"

    .line 77
    .line 78
    const-string v1, ""

    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    :goto_1
    return-object p0
.end method

.method private static getDefaultCountry(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    const-string v1, "OVMessagePrefs"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "my_phone_number"

    .line 13
    .line 14
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    :try_start_1
    sget-object v2, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 27
    .line 28
    invoke-virtual {v2, v1, v0}, LT5/e;->X(Ljava/lang/CharSequence;Ljava/lang/String;)LT5/j;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, LT5/j;->j()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    sget-object v2, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, LT5/e;->B(LT5/j;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v2
    :try_end_1
    .catch LT5/d; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    return-object v1

    .line 53
    :catch_0
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-eqz p0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    iget-object p0, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 66
    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    :try_start_3
    invoke-virtual {p0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_3

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 85
    return-object p0

    .line 86
    :catch_1
    :cond_2
    move-object p0, v0

    .line 87
    :catch_2
    :cond_3
    if-eqz p0, :cond_4

    .line 88
    .line 89
    :goto_0
    :try_start_4
    invoke-virtual {p0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    goto :goto_0

    .line 99
    :goto_1
    if-eqz p0, :cond_5

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    invoke-static {p0}, Lcom/ov/message/PhoneNumberUtils;->mapLanguageToCountry(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 111
    if-eqz p0, :cond_5

    .line 112
    .line 113
    return-object p0

    .line 114
    :catch_3
    :cond_5
    return-object v0
.end method

.method private static mapLanguageToCountry(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_13

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, -0x1

    .line 24
    sparse-switch v1, :sswitch_data_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :sswitch_0
    const-string v1, "tl"

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_1

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_1
    const/16 v2, 0x11

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :sswitch_1
    const-string v1, "sv"

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_2

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_2
    const/16 v2, 0x10

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :sswitch_2
    const-string v1, "pt"

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_3

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_3
    const/16 v2, 0xf

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :sswitch_3
    const-string v1, "no"

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_4

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_4
    const/16 v2, 0xe

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :sswitch_4
    const-string v1, "nl"

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-nez p0, :cond_5

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_5
    const/16 v2, 0xd

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :sswitch_5
    const-string v1, "ms"

    .line 100
    .line 101
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-nez p0, :cond_6

    .line 106
    .line 107
    goto/16 :goto_0

    .line 108
    .line 109
    :cond_6
    const/16 v2, 0xc

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :sswitch_6
    const-string v1, "it"

    .line 114
    .line 115
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-nez p0, :cond_7

    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :cond_7
    const/16 v2, 0xb

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :sswitch_7
    const-string v1, "is"

    .line 128
    .line 129
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-nez p0, :cond_8

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_8
    const/16 v2, 0xa

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :sswitch_8
    const-string v1, "id"

    .line 142
    .line 143
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-nez p0, :cond_9

    .line 148
    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :cond_9
    const/16 v2, 0x9

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :sswitch_9
    const-string v1, "gd"

    .line 156
    .line 157
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_a

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_a
    const/16 v2, 0x8

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :sswitch_a
    const-string v1, "fr"

    .line 170
    .line 171
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    if-nez p0, :cond_b

    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_b
    const/4 v2, 0x7

    .line 179
    goto :goto_0

    .line 180
    :sswitch_b
    const-string v1, "fi"

    .line 181
    .line 182
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-nez p0, :cond_c

    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_c
    const/4 v2, 0x6

    .line 190
    goto :goto_0

    .line 191
    :sswitch_c
    const-string v1, "es"

    .line 192
    .line 193
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-nez p0, :cond_d

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_d
    const/4 v2, 0x5

    .line 201
    goto :goto_0

    .line 202
    :sswitch_d
    const-string v1, "en"

    .line 203
    .line 204
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    if-nez p0, :cond_e

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_e
    const/4 v2, 0x4

    .line 212
    goto :goto_0

    .line 213
    :sswitch_e
    const-string v1, "de"

    .line 214
    .line 215
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-nez p0, :cond_f

    .line 220
    .line 221
    goto :goto_0

    .line 222
    :cond_f
    const/4 v2, 0x3

    .line 223
    goto :goto_0

    .line 224
    :sswitch_f
    const-string v1, "da"

    .line 225
    .line 226
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    if-nez p0, :cond_10

    .line 231
    .line 232
    goto :goto_0

    .line 233
    :cond_10
    const/4 v2, 0x2

    .line 234
    goto :goto_0

    .line 235
    :sswitch_10
    const-string v1, "cy"

    .line 236
    .line 237
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-nez p0, :cond_11

    .line 242
    .line 243
    goto :goto_0

    .line 244
    :cond_11
    const/4 v2, 0x1

    .line 245
    goto :goto_0

    .line 246
    :sswitch_11
    const-string v1, "ca"

    .line 247
    .line 248
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    if-nez p0, :cond_12

    .line 253
    .line 254
    goto :goto_0

    .line 255
    :cond_12
    const/4 v2, 0x0

    .line 256
    :goto_0
    const-string p0, "ES"

    .line 257
    .line 258
    const-string v1, "GB"

    .line 259
    .line 260
    packed-switch v2, :pswitch_data_0

    .line 261
    .line 262
    .line 263
    return-object v0

    .line 264
    :pswitch_0
    const-string p0, "PH"

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_1
    const-string p0, "SE"

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_2
    const-string p0, "PT"

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_3
    const-string p0, "NO"

    .line 274
    .line 275
    return-object p0

    .line 276
    :pswitch_4
    const-string p0, "NL"

    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_5
    const-string p0, "MY"

    .line 280
    .line 281
    return-object p0

    .line 282
    :pswitch_6
    const-string p0, "IT"

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_7
    const-string p0, "IS"

    .line 286
    .line 287
    return-object p0

    .line 288
    :pswitch_8
    const-string p0, "ID"

    .line 289
    .line 290
    return-object p0

    .line 291
    :pswitch_9
    return-object v1

    .line 292
    :pswitch_a
    const-string p0, "FR"

    .line 293
    .line 294
    return-object p0

    .line 295
    :pswitch_b
    const-string p0, "FI"

    .line 296
    .line 297
    :pswitch_c
    return-object p0

    .line 298
    :pswitch_d
    const-string p0, "US"

    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_e
    const-string p0, "DE"

    .line 302
    .line 303
    return-object p0

    .line 304
    :pswitch_f
    const-string p0, "DK"

    .line 305
    .line 306
    return-object p0

    .line 307
    :pswitch_10
    return-object v1

    .line 308
    :pswitch_11
    return-object p0

    .line 309
    :cond_13
    :goto_1
    return-object v0

    .line 310
    nop

    :sswitch_data_0
    .sparse-switch
        0xc5e -> :sswitch_11
        0xc76 -> :sswitch_10
        0xc7d -> :sswitch_f
        0xc81 -> :sswitch_e
        0xca9 -> :sswitch_d
        0xcae -> :sswitch_c
        0xcc3 -> :sswitch_b
        0xccc -> :sswitch_a
        0xcdd -> :sswitch_9
        0xd1b -> :sswitch_8
        0xd2a -> :sswitch_7
        0xd2b -> :sswitch_6
        0xda6 -> :sswitch_5
        0xdbe -> :sswitch_4
        0xdc1 -> :sswitch_3
        0xe04 -> :sswitch_2
        0xe63 -> :sswitch_1
        0xe78 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static normalizePhoneNumber(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p0, :cond_b

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    const-string v1, "[\\s\\-\\.\\(\\)]"

    .line 14
    .line 15
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "+"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    :try_start_0
    sget-object p1, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 29
    .line 30
    invoke-virtual {p1, p0, v2}, LT5/e;->X(Ljava/lang/CharSequence;Ljava/lang/String;)LT5/j;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v0, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, LT5/e;->K(LT5/j;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    sget-object v0, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 43
    .line 44
    sget-object v1, LT5/e$c;->g:LT5/e$c;

    .line 45
    .line 46
    invoke-virtual {v0, p1, v1}, LT5/e;->n(LT5/j;LT5/e$c;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lcom/ov/message/PhoneNumberUtils;->fixLeadingZeroAfterPrefix(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_0
    .catch LT5/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    return-object p0

    .line 55
    :catch_0
    :cond_1
    invoke-static {p0}, Lcom/ov/message/PhoneNumberUtils;->fixLeadingZeroAfterPrefix(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_2
    const-string v1, "00"

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_4

    .line 67
    .line 68
    new-instance p1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const/4 v0, 0x2

    .line 77
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    :try_start_1
    sget-object p1, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 89
    .line 90
    invoke-virtual {p1, p0, v2}, LT5/e;->X(Ljava/lang/CharSequence;Ljava/lang/String;)LT5/j;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    sget-object v0, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 95
    .line 96
    invoke-virtual {v0, p1}, LT5/e;->K(LT5/j;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    sget-object v0, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 103
    .line 104
    sget-object v1, LT5/e$c;->g:LT5/e$c;

    .line 105
    .line 106
    invoke-virtual {v0, p1, v1}, LT5/e;->n(LT5/j;LT5/e$c;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p1}, Lcom/ov/message/PhoneNumberUtils;->fixLeadingZeroAfterPrefix(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0
    :try_end_1
    .catch LT5/d; {:try_start_1 .. :try_end_1} :catch_1

    .line 114
    return-object p0

    .line 115
    :catch_1
    :cond_3
    invoke-static {p0}, Lcom/ov/message/PhoneNumberUtils;->fixLeadingZeroAfterPrefix(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    const/16 v2, 0x8

    .line 125
    .line 126
    if-lt v1, v2, :cond_7

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    const/16 v2, 0xf

    .line 133
    .line 134
    if-gt v1, v2, :cond_7

    .line 135
    .line 136
    const-string v1, "\\d+"

    .line 137
    .line 138
    invoke-virtual {p0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_7

    .line 143
    .line 144
    invoke-static {p1}, Lcom/ov/message/PhoneNumberUtils;->getDefaultCountry(Landroid/content/Context;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-eqz p1, :cond_6

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-nez v1, :cond_6

    .line 155
    .line 156
    :try_start_2
    sget-object v1, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 157
    .line 158
    invoke-virtual {v1, p0, p1}, LT5/e;->X(Ljava/lang/CharSequence;Ljava/lang/String;)LT5/j;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    sget-object v1, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 163
    .line 164
    invoke-virtual {v1, p1}, LT5/e;->K(LT5/j;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_5

    .line 169
    .line 170
    sget-object v0, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 171
    .line 172
    sget-object v1, LT5/e$c;->g:LT5/e$c;

    .line 173
    .line 174
    invoke-virtual {v0, p1, v1}, LT5/e;->n(LT5/j;LT5/e$c;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {p1}, Lcom/ov/message/PhoneNumberUtils;->fixLeadingZeroAfterPrefix(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0

    .line 183
    :cond_5
    invoke-virtual {p1}, LT5/j;->j()Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_6

    .line 188
    .line 189
    invoke-virtual {p1}, LT5/j;->n()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_6

    .line 194
    .line 195
    invoke-virtual {p1}, LT5/j;->c()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {p1}, LT5/j;->f()J

    .line 204
    .line 205
    .line 206
    move-result-wide v2

    .line 207
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    new-instance v2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-static {p1}, Lcom/ov/message/PhoneNumberUtils;->fixLeadingZeroAfterPrefix(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0
    :try_end_2
    .catch LT5/d; {:try_start_2 .. :try_end_2} :catch_2

    .line 233
    :catch_2
    :cond_6
    return-object p0

    .line 234
    :cond_7
    invoke-static {p1}, Lcom/ov/message/PhoneNumberUtils;->getDefaultCountry(Landroid/content/Context;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    if-eqz p1, :cond_a

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_8

    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_8
    :try_start_3
    sget-object v1, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 248
    .line 249
    invoke-virtual {v1, p0, p1}, LT5/e;->X(Ljava/lang/CharSequence;Ljava/lang/String;)LT5/j;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    sget-object v1, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 254
    .line 255
    invoke-virtual {v1, p1}, LT5/e;->K(LT5/j;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_9

    .line 260
    .line 261
    sget-object v0, Lcom/ov/message/PhoneNumberUtils;->phoneUtil:LT5/e;

    .line 262
    .line 263
    sget-object v1, LT5/e$c;->g:LT5/e$c;

    .line 264
    .line 265
    invoke-virtual {v0, p1, v1}, LT5/e;->n(LT5/j;LT5/e$c;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    invoke-static {p1}, Lcom/ov/message/PhoneNumberUtils;->fixLeadingZeroAfterPrefix(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    return-object p0

    .line 274
    :cond_9
    invoke-virtual {p1}, LT5/j;->j()Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_a

    .line 279
    .line 280
    invoke-virtual {p1}, LT5/j;->n()Z

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    if-eqz v1, :cond_a

    .line 285
    .line 286
    invoke-virtual {p1}, LT5/j;->c()I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {p1}, LT5/j;->f()J

    .line 295
    .line 296
    .line 297
    move-result-wide v2

    .line 298
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    new-instance v2, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-static {p1}, Lcom/ov/message/PhoneNumberUtils;->fixLeadingZeroAfterPrefix(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p0
    :try_end_3
    .catch LT5/d; {:try_start_3 .. :try_end_3} :catch_3

    .line 324
    :catch_3
    :cond_a
    :goto_0
    return-object p0

    .line 325
    :cond_b
    :goto_1
    return-object v0
.end method
