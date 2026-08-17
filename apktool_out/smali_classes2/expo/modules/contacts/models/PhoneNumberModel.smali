.class public final Lexpo/modules/contacts/models/PhoneNumberModel;
.super Lexpo/modules/contacts/models/BaseModel;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00082\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00058\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u001a\u0004\u0008\u0018\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/contacts/models/PhoneNumberModel;",
        "Lexpo/modules/contacts/models/BaseModel;",
        "<init>",
        "()V",
        "",
        "",
        "",
        "readableMap",
        "Li7/B;",
        "fromMap",
        "(Ljava/util/Map;)V",
        "label",
        "",
        "mapStringToType",
        "(Ljava/lang/String;)I",
        "Landroid/database/Cursor;",
        "cursor",
        "getLabelFromCursor",
        "(Landroid/database/Cursor;)Ljava/lang/String;",
        "contentType",
        "Ljava/lang/String;",
        "getContentType",
        "()Ljava/lang/String;",
        "dataAlias",
        "getDataAlias",
        "expo-contacts_release"
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
.field private final contentType:Ljava/lang/String;

.field private final dataAlias:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/contacts/models/BaseModel;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "vnd.android.cursor.item/phone_v2"

    .line 5
    .line 6
    iput-object v0, p0, Lexpo/modules/contacts/models/PhoneNumberModel;->contentType:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "number"

    .line 9
    .line 10
    iput-object v0, p0, Lexpo/modules/contacts/models/PhoneNumberModel;->dataAlias:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public fromMap(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "readableMap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lexpo/modules/contacts/models/BaseModel;->fromMap(Ljava/util/Map;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lexpo/modules/contacts/models/BaseModel;->getData()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lexpo/modules/contacts/models/BaseModel;->getMap()Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, LP8/o;

    .line 21
    .line 22
    const-string v2, "[^\\d.]"

    .line 23
    .line 24
    invoke-direct {v1, v2}, LP8/o;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v2, ""

    .line 28
    .line 29
    invoke-virtual {v1, p1, v2}, LP8/o;->e(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "digits"

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/models/PhoneNumberModel;->contentType:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDataAlias()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/contacts/models/PhoneNumberModel;->dataAlias:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method protected getLabelFromCursor(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "cursor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lexpo/modules/contacts/models/BaseModel;->getLabelFromCursor(Landroid/database/Cursor;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "data2"

    .line 13
    .line 14
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    packed-switch p1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    const-string p1, "unknown"

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    const-string p1, "mms"

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_1
    const-string p1, "assistant"

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_2
    const-string p1, "workPager"

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_3
    const-string p1, "workMobile"

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_4
    const-string p1, "ttyTdd"

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_5
    const-string p1, "telex"

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_6
    const-string p1, "radio"

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_7
    const-string p1, "otherFax"

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_8
    const-string p1, "main"

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_9
    const-string p1, "isdn"

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_a
    const-string p1, "companyMain"

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_b
    const-string p1, "car"

    .line 62
    .line 63
    return-object p1

    .line 64
    :pswitch_c
    const-string p1, "callback"

    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_d
    const-string p1, "other"

    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_e
    const-string p1, "pager"

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_f
    const-string p1, "faxHome"

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_10
    const-string p1, "faxWork"

    .line 77
    .line 78
    return-object p1

    .line 79
    :pswitch_11
    const-string p1, "work"

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_12
    const-string p1, "mobile"

    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_13
    const-string p1, "home"

    .line 86
    .line 87
    return-object p1

    .line 88
    :cond_0
    return-object v0

    .line 89
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
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

.method public mapStringToType(Ljava/lang/String;)I
    .locals 1

    .line 1
    if-eqz p1, :cond_14

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :sswitch_0
    const-string v0, "assistant"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_0
    const/16 p1, 0x13

    .line 23
    .line 24
    return p1

    .line 25
    :sswitch_1
    const-string v0, "workPager"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_1
    const/16 p1, 0x12

    .line 36
    .line 37
    return p1

    .line 38
    :sswitch_2
    const-string v0, "telex"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_2
    const/16 p1, 0xf

    .line 49
    .line 50
    return p1

    .line 51
    :sswitch_3
    const-string v0, "radio"

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_3
    const/16 p1, 0xe

    .line 62
    .line 63
    return p1

    .line 64
    :sswitch_4
    const-string v0, "pager"

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_4

    .line 71
    .line 72
    goto/16 :goto_0

    .line 73
    .line 74
    :cond_4
    const/4 p1, 0x6

    .line 75
    return p1

    .line 76
    :sswitch_5
    const-string v0, "other"

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :cond_5
    const/4 p1, 0x7

    .line 87
    return p1

    .line 88
    :sswitch_6
    const-string v0, "work"

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_6

    .line 95
    .line 96
    goto/16 :goto_0

    .line 97
    .line 98
    :cond_6
    const/4 p1, 0x3

    .line 99
    return p1

    .line 100
    :sswitch_7
    const-string v0, "main"

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_7

    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :cond_7
    const/16 p1, 0xc

    .line 111
    .line 112
    return p1

    .line 113
    :sswitch_8
    const-string v0, "isdn"

    .line 114
    .line 115
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_8

    .line 120
    .line 121
    goto/16 :goto_0

    .line 122
    .line 123
    :cond_8
    const/16 p1, 0xb

    .line 124
    .line 125
    return p1

    .line 126
    :sswitch_9
    const-string v0, "home"

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-nez p1, :cond_9

    .line 133
    .line 134
    goto/16 :goto_0

    .line 135
    .line 136
    :cond_9
    const/4 p1, 0x1

    .line 137
    return p1

    .line 138
    :sswitch_a
    const-string v0, "mms"

    .line 139
    .line 140
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-nez p1, :cond_a

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_a
    const/16 p1, 0x14

    .line 149
    .line 150
    return p1

    .line 151
    :sswitch_b
    const-string v0, "car"

    .line 152
    .line 153
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-nez p1, :cond_b

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_b
    const/16 p1, 0x9

    .line 161
    .line 162
    return p1

    .line 163
    :sswitch_c
    const-string v0, "callback"

    .line 164
    .line 165
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-nez p1, :cond_c

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_c
    const/16 p1, 0x8

    .line 173
    .line 174
    return p1

    .line 175
    :sswitch_d
    const-string v0, "companyMain"

    .line 176
    .line 177
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-nez p1, :cond_d

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_d
    const/16 p1, 0xa

    .line 185
    .line 186
    return p1

    .line 187
    :sswitch_e
    const-string v0, "ttyTdd"

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-nez p1, :cond_e

    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_e
    const/16 p1, 0x10

    .line 197
    .line 198
    return p1

    .line 199
    :sswitch_f
    const-string v0, "mobile"

    .line 200
    .line 201
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-nez p1, :cond_f

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_f
    const/4 p1, 0x2

    .line 209
    return p1

    .line 210
    :sswitch_10
    const-string v0, "faxWork"

    .line 211
    .line 212
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-nez p1, :cond_10

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_10
    const/4 p1, 0x4

    .line 220
    return p1

    .line 221
    :sswitch_11
    const-string v0, "workMobile"

    .line 222
    .line 223
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-nez p1, :cond_11

    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_11
    const/16 p1, 0x11

    .line 231
    .line 232
    return p1

    .line 233
    :sswitch_12
    const-string v0, "faxHome"

    .line 234
    .line 235
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result p1

    .line 239
    if-nez p1, :cond_12

    .line 240
    .line 241
    goto :goto_0

    .line 242
    :cond_12
    const/4 p1, 0x5

    .line 243
    return p1

    .line 244
    :sswitch_13
    const-string v0, "otherFax"

    .line 245
    .line 246
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    if-nez p1, :cond_13

    .line 251
    .line 252
    goto :goto_0

    .line 253
    :cond_13
    const/16 p1, 0xd

    .line 254
    .line 255
    return p1

    .line 256
    :cond_14
    :goto_0
    const/4 p1, 0x0

    .line 257
    return p1

    .line 258
    nop

    .line 259
    :sswitch_data_0
    .sparse-switch
        -0x45ce8613 -> :sswitch_13
        -0x4000e264 -> :sswitch_12
        -0x40000ced -> :sswitch_11
        -0x3ffa1032 -> :sswitch_10
        -0x3fb56f5e -> :sswitch_f
        -0x3372e8c5 -> :sswitch_e
        -0x1e50d02a -> :sswitch_d
        -0xa43dfbb -> :sswitch_c
        0x17fd4 -> :sswitch_b
        0x1a6d3 -> :sswitch_a
        0x30f4df -> :sswitch_9
        0x317734 -> :sswitch_8
        0x3305b9 -> :sswitch_7
        0x37c711 -> :sswitch_6
        0x6527f10 -> :sswitch_5
        0x657efc3 -> :sswitch_4
        0x67413fb -> :sswitch_3
        0x692320e -> :sswitch_2
        0x4023fb32 -> :sswitch_1
        0x553972de -> :sswitch_0
    .end sparse-switch
.end method
