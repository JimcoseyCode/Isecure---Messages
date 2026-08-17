.class final Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/next/domain/ContactRepository;->getById-m7AL99Q(Ljava/util/Set;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;",
        "<anonymous>",
        "(LR8/N;)Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.contacts.next.domain.ContactRepository$getById$2"
    f = "ContactRepository.kt"
    l = {
        0xa2,
        0xad
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $contactId:Ljava/lang/String;

.field final synthetic $extractableFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField<",
            "*>;>;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/contacts/next/domain/ContactRepository;


# direct methods
.method constructor <init>(Ljava/util/Set;Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField<",
            "*>;>;",
            "Lexpo/modules/contacts/next/domain/ContactRepository;",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->$extractableFields:Ljava/util/Set;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->$contactId:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->$extractableFields:Ljava/util/Set;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->$contactId:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;-><init>(Ljava/util/Set;Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Ln7/f;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v9

    .line 7
    iget v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->label:I

    .line 8
    .line 9
    const-string v10, "CONTENT_URI"

    .line 10
    .line 11
    const/4 v11, 0x2

    .line 12
    const/4 v1, 0x1

    .line 13
    const/4 v12, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    if-ne v0, v11, :cond_0

    .line 19
    .line 20
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$1:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lexpo/modules/contacts/next/domain/query/QueryAggregator;

    .line 23
    .line 24
    iget-object v1, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, LR8/N;

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v14, v0

    .line 32
    move-object/from16 v0, p1

    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_1
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$2:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lexpo/modules/contacts/next/domain/query/QueryBuilder;

    .line 47
    .line 48
    iget-object v1, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lexpo/modules/contacts/next/domain/query/QueryAggregator;

    .line 51
    .line 52
    iget-object v2, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, LR8/N;

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v15, v0

    .line 60
    move-object v14, v1

    .line 61
    move-object v13, v2

    .line 62
    move-object/from16 v0, p1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-static/range {p1 .. p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v13, v0

    .line 71
    check-cast v13, LR8/N;

    .line 72
    .line 73
    new-instance v14, Lexpo/modules/contacts/next/domain/query/QueryAggregator;

    .line 74
    .line 75
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->$extractableFields:Ljava/util/Set;

    .line 76
    .line 77
    invoke-direct {v14, v0}, Lexpo/modules/contacts/next/domain/query/QueryAggregator;-><init>(Ljava/util/Collection;)V

    .line 78
    .line 79
    .line 80
    new-instance v15, Lexpo/modules/contacts/next/domain/query/QueryBuilder;

    .line 81
    .line 82
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->$extractableFields:Ljava/util/Set;

    .line 83
    .line 84
    invoke-direct {v15, v0}, Lexpo/modules/contacts/next/domain/query/QueryBuilder;-><init>(Ljava/util/Collection;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 88
    .line 89
    invoke-virtual {v0}, Lexpo/modules/contacts/next/domain/ContactRepository;->getContentResolver()Landroid/content/ContentResolver;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v2, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    .line 94
    .line 95
    invoke-static {v2, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    move-object v3, v2

    .line 99
    invoke-virtual {v15}, Lexpo/modules/contacts/next/domain/query/QueryBuilder;->buildContactsProjection()[Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    iget-object v4, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->$contactId:Ljava/lang/String;

    .line 104
    .line 105
    filled-new-array {v4}, [Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    iput-object v13, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v14, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$1:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v15, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$2:Ljava/lang/Object;

    .line 114
    .line 115
    iput v1, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->label:I

    .line 116
    .line 117
    move-object v1, v3

    .line 118
    const-string v3, "_id = ?"

    .line 119
    .line 120
    const/4 v5, 0x0

    .line 121
    const/16 v7, 0x10

    .line 122
    .line 123
    const/4 v8, 0x0

    .line 124
    invoke-static/range {v0 .. v8}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->safeQuery$default(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-ne v0, v9, :cond_3

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_3
    :goto_0
    move-object v1, v0

    .line 132
    check-cast v1, Ljava/io/Closeable;

    .line 133
    .line 134
    :try_start_0
    move-object v0, v1

    .line 135
    check-cast v0, Landroid/database/Cursor;

    .line 136
    .line 137
    invoke-static {v0}, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt;->asSequence(Landroid/database/Cursor;)LO8/i;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-interface {v2}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_4

    .line 150
    .line 151
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, Landroid/database/Cursor;

    .line 156
    .line 157
    invoke-virtual {v14, v0}, Lexpo/modules/contacts/next/domain/query/QueryAggregator;->aggregateContactsRow(Landroid/database/Cursor;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    move-object v2, v0

    .line 163
    goto/16 :goto_6

    .line 164
    .line 165
    :cond_4
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    .line 167
    invoke-static {v1, v12}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 168
    .line 169
    .line 170
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 171
    .line 172
    invoke-virtual {v0}, Lexpo/modules/contacts/next/domain/ContactRepository;->getContentResolver()Landroid/content/ContentResolver;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    .line 177
    .line 178
    invoke-static {v1, v10}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v15}, Lexpo/modules/contacts/next/domain/query/QueryBuilder;->buildDataProjection()[Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    iget-object v3, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->$contactId:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v3}, Lexpo/modules/contacts/next/domain/wrappers/ContactId;->box-impl(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/wrappers/ContactId;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-static {v3}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v15, v3}, Lexpo/modules/contacts/next/domain/query/QueryBuilder;->buildSelection(Ljava/util/Collection;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    iget-object v4, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->$contactId:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v4}, Lexpo/modules/contacts/next/domain/wrappers/ContactId;->box-impl(Ljava/lang/String;)Lexpo/modules/contacts/next/domain/wrappers/ContactId;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-static {v4}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v15, v4}, Lexpo/modules/contacts/next/domain/query/QueryBuilder;->buildSelectionArgs(Ljava/util/Collection;)[Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    iput-object v13, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$0:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v14, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$1:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v12, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->L$2:Ljava/lang/Object;

    .line 218
    .line 219
    iput v11, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getById$2;->label:I

    .line 220
    .line 221
    const/4 v5, 0x0

    .line 222
    const/16 v7, 0x10

    .line 223
    .line 224
    const/4 v8, 0x0

    .line 225
    invoke-static/range {v0 .. v8}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->safeQuery$default(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-ne v0, v9, :cond_5

    .line 230
    .line 231
    :goto_2
    return-object v9

    .line 232
    :cond_5
    move-object v1, v13

    .line 233
    :goto_3
    move-object v2, v0

    .line 234
    check-cast v2, Ljava/io/Closeable;

    .line 235
    .line 236
    :try_start_1
    move-object v0, v2

    .line 237
    check-cast v0, Landroid/database/Cursor;

    .line 238
    .line 239
    invoke-static {v1}, LR8/O;->d(LR8/N;)V

    .line 240
    .line 241
    .line 242
    invoke-static {v0}, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt;->asSequence(Landroid/database/Cursor;)LO8/i;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-interface {v1}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_6

    .line 255
    .line 256
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    check-cast v3, Landroid/database/Cursor;

    .line 261
    .line 262
    invoke-virtual {v14, v0}, Lexpo/modules/contacts/next/domain/query/QueryAggregator;->aggregateDataRow(Landroid/database/Cursor;)V

    .line 263
    .line 264
    .line 265
    goto :goto_4

    .line 266
    :catchall_1
    move-exception v0

    .line 267
    move-object v1, v0

    .line 268
    goto :goto_5

    .line 269
    :cond_6
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 270
    .line 271
    invoke-static {v2, v12}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v14}, Lexpo/modules/contacts/next/domain/query/QueryAggregator;->buildContacts()Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-nez v1, :cond_7

    .line 283
    .line 284
    const/4 v1, 0x0

    .line 285
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    check-cast v0, Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;

    .line 290
    .line 291
    return-object v0

    .line 292
    :cond_7
    return-object v12

    .line 293
    :goto_5
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 294
    :catchall_2
    move-exception v0

    .line 295
    invoke-static {v2, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    throw v0

    .line 299
    :goto_6
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 300
    :catchall_3
    move-exception v0

    .line 301
    invoke-static {v1, v2}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    throw v0
.end method
