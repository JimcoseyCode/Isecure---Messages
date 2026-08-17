.class final Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/contacts/next/domain/ContactRepository;->getAllPaginated(Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ln7/f;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LR8/N;",
        "",
        "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;",
        "<anonymous>",
        "(LR8/N;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.contacts.next.domain.ContactRepository$getAllPaginated$2"
    f = "ContactRepository.kt"
    l = {
        0xc5,
        0xd9
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $extractableFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lexpo/modules/contacts/next/domain/model/ExtractableField<",
            "*>;>;"
        }
    .end annotation
.end field

.field final synthetic $limit:Ljava/lang/Integer;

.field final synthetic $offset:Ljava/lang/Integer;

.field final synthetic $searchedDisplayName:Ljava/lang/String;

.field final synthetic $sortOrder:Lexpo/modules/contacts/next/records/SortOrder;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/contacts/next/domain/ContactRepository;


# direct methods
.method constructor <init>(Ljava/util/Set;Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ljava/lang/Integer;Ljava/lang/Integer;Ln7/f;)V
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
            "Lexpo/modules/contacts/next/records/SortOrder;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$extractableFields:Ljava/util/Set;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$searchedDisplayName:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$sortOrder:Lexpo/modules/contacts/next/records/SortOrder;

    .line 8
    .line 9
    iput-object p5, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$limit:Ljava/lang/Integer;

    .line 10
    .line 11
    iput-object p6, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$offset:Ljava/lang/Integer;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 8
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
    new-instance v0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$extractableFields:Ljava/util/Set;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$searchedDisplayName:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$sortOrder:Lexpo/modules/contacts/next/records/SortOrder;

    .line 10
    .line 11
    iget-object v5, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$limit:Ljava/lang/Integer;

    .line 12
    .line 13
    iget-object v6, p0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$offset:Ljava/lang/Integer;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;-><init>(Ljava/util/Set;Lexpo/modules/contacts/next/domain/ContactRepository;Ljava/lang/String;Lexpo/modules/contacts/next/records/SortOrder;Ljava/lang/Integer;Ljava/lang/Integer;Ln7/f;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$0:Ljava/lang/Object;

    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

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
    iget v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->label:I

    .line 8
    .line 9
    const-string v8, "CONTENT_URI"

    .line 10
    .line 11
    const/4 v10, 0x2

    .line 12
    const/4 v11, 0x1

    .line 13
    const/4 v12, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-eq v0, v11, :cond_1

    .line 17
    .line 18
    if-ne v0, v10, :cond_0

    .line 19
    .line 20
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$1:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lexpo/modules/contacts/next/domain/query/QueryAggregator;

    .line 23
    .line 24
    iget-object v1, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$0:Ljava/lang/Object;

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
    goto/16 :goto_a

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
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$2:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lexpo/modules/contacts/next/domain/query/QueryBuilder;

    .line 47
    .line 48
    iget-object v1, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$1:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lexpo/modules/contacts/next/domain/query/QueryAggregator;

    .line 51
    .line 52
    iget-object v2, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$0:Ljava/lang/Object;

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
    const/16 v16, 0x0

    .line 63
    .line 64
    move-object/from16 v0, p1

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_2
    invoke-static/range {p1 .. p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v13, v0

    .line 74
    check-cast v13, LR8/N;

    .line 75
    .line 76
    new-instance v14, Lexpo/modules/contacts/next/domain/query/QueryAggregator;

    .line 77
    .line 78
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$extractableFields:Ljava/util/Set;

    .line 79
    .line 80
    invoke-direct {v14, v0}, Lexpo/modules/contacts/next/domain/query/QueryAggregator;-><init>(Ljava/util/Collection;)V

    .line 81
    .line 82
    .line 83
    new-instance v15, Lexpo/modules/contacts/next/domain/query/QueryBuilder;

    .line 84
    .line 85
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$extractableFields:Ljava/util/Set;

    .line 86
    .line 87
    invoke-direct {v15, v0}, Lexpo/modules/contacts/next/domain/query/QueryBuilder;-><init>(Ljava/util/Collection;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 91
    .line 92
    invoke-virtual {v0}, Lexpo/modules/contacts/next/domain/ContactRepository;->getContentResolver()Landroid/content/ContentResolver;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    .line 97
    .line 98
    invoke-static {v1, v8}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v15}, Lexpo/modules/contacts/next/domain/query/QueryBuilder;->buildContactsProjection()[Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iget-object v3, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$searchedDisplayName:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    const-string v4, "display_name LIKE ?"

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    move-object v4, v12

    .line 113
    :goto_0
    if-eqz v3, :cond_4

    .line 114
    .line 115
    new-array v5, v11, [Ljava/lang/String;

    .line 116
    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    new-instance v7, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    const-string v10, "%"

    .line 125
    .line 126
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    aput-object v3, v5, v16

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    const/16 v16, 0x0

    .line 143
    .line 144
    move-object v5, v12

    .line 145
    :goto_1
    iget-object v3, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$sortOrder:Lexpo/modules/contacts/next/records/SortOrder;

    .line 146
    .line 147
    if-eqz v3, :cond_5

    .line 148
    .line 149
    invoke-virtual {v3}, Lexpo/modules/contacts/next/records/SortOrder;->toColumn()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    goto :goto_2

    .line 154
    :cond_5
    move-object v3, v12

    .line 155
    :goto_2
    iput-object v13, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$0:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v14, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$1:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v15, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$2:Ljava/lang/Object;

    .line 160
    .line 161
    iput v11, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->label:I

    .line 162
    .line 163
    move-object/from16 v17, v5

    .line 164
    .line 165
    move-object v5, v3

    .line 166
    move-object v3, v4

    .line 167
    move-object/from16 v4, v17

    .line 168
    .line 169
    invoke-static/range {v0 .. v6}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->safeQuery(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-ne v0, v9, :cond_6

    .line 174
    .line 175
    goto/16 :goto_9

    .line 176
    .line 177
    :cond_6
    :goto_3
    move-object v1, v0

    .line 178
    check-cast v1, Ljava/io/Closeable;

    .line 179
    .line 180
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$offset:Ljava/lang/Integer;

    .line 181
    .line 182
    iget-object v2, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$limit:Ljava/lang/Integer;

    .line 183
    .line 184
    :try_start_0
    move-object v3, v1

    .line 185
    check-cast v3, Landroid/database/Cursor;

    .line 186
    .line 187
    invoke-static {v13}, LR8/O;->d(LR8/N;)V

    .line 188
    .line 189
    .line 190
    if-eqz v0, :cond_7

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    goto :goto_4

    .line 197
    :catchall_0
    move-exception v0

    .line 198
    move-object v2, v0

    .line 199
    goto/16 :goto_d

    .line 200
    .line 201
    :cond_7
    move/from16 v7, v16

    .line 202
    .line 203
    :goto_4
    sub-int/2addr v7, v11

    .line 204
    invoke-interface {v3, v7}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 205
    .line 206
    .line 207
    invoke-static {v3}, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt;->asSequence(Landroid/database/Cursor;)LO8/i;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-eqz v2, :cond_8

    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    goto :goto_5

    .line 218
    :cond_8
    const v2, 0x7fffffff

    .line 219
    .line 220
    .line 221
    :goto_5
    invoke-static {v0, v2}, LO8/l;->P(LO8/i;I)LO8/i;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-interface {v0}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_9

    .line 234
    .line 235
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    check-cast v2, Landroid/database/Cursor;

    .line 240
    .line 241
    invoke-virtual {v14, v3}, Lexpo/modules/contacts/next/domain/query/QueryAggregator;->aggregateContactsRow(Landroid/database/Cursor;)V

    .line 242
    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_9
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    .line 247
    invoke-static {v1, v12}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$limit:Ljava/lang/Integer;

    .line 251
    .line 252
    if-nez v0, :cond_b

    .line 253
    .line 254
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$offset:Ljava/lang/Integer;

    .line 255
    .line 256
    if-nez v0, :cond_b

    .line 257
    .line 258
    iget-object v0, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->$searchedDisplayName:Ljava/lang/String;

    .line 259
    .line 260
    if-eqz v0, :cond_a

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_a
    move-object v0, v12

    .line 264
    goto :goto_8

    .line 265
    :cond_b
    :goto_7
    invoke-virtual {v14}, Lexpo/modules/contacts/next/domain/query/QueryAggregator;->getContactIdsFromBuilders()Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    :goto_8
    iget-object v1, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->this$0:Lexpo/modules/contacts/next/domain/ContactRepository;

    .line 270
    .line 271
    invoke-virtual {v1}, Lexpo/modules/contacts/next/domain/ContactRepository;->getContentResolver()Landroid/content/ContentResolver;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    move-object v2, v1

    .line 276
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    .line 277
    .line 278
    invoke-static {v1, v8}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    move-object v3, v2

    .line 282
    invoke-virtual {v15}, Lexpo/modules/contacts/next/domain/query/QueryBuilder;->buildDataProjection()[Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    move-object v4, v3

    .line 287
    invoke-virtual {v15, v0}, Lexpo/modules/contacts/next/domain/query/QueryBuilder;->buildSelection(Ljava/util/Collection;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-virtual {v15, v0}, Lexpo/modules/contacts/next/domain/query/QueryBuilder;->buildSelectionArgs(Ljava/util/Collection;)[Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    iput-object v13, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$0:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v14, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$1:Ljava/lang/Object;

    .line 298
    .line 299
    iput-object v12, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->L$2:Ljava/lang/Object;

    .line 300
    .line 301
    const/4 v5, 0x2

    .line 302
    iput v5, v6, Lexpo/modules/contacts/next/domain/ContactRepository$getAllPaginated$2;->label:I

    .line 303
    .line 304
    const/4 v5, 0x0

    .line 305
    const/16 v7, 0x10

    .line 306
    .line 307
    const/4 v8, 0x0

    .line 308
    move-object/from16 v17, v4

    .line 309
    .line 310
    move-object v4, v0

    .line 311
    move-object/from16 v0, v17

    .line 312
    .line 313
    invoke-static/range {v0 .. v8}, Lexpo/modules/contacts/next/extensions/ContentResolverExtensionsKt;->safeQuery$default(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ln7/f;ILjava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    if-ne v0, v9, :cond_c

    .line 318
    .line 319
    :goto_9
    return-object v9

    .line 320
    :cond_c
    move-object v1, v13

    .line 321
    :goto_a
    move-object v2, v0

    .line 322
    check-cast v2, Ljava/io/Closeable;

    .line 323
    .line 324
    :try_start_1
    move-object v0, v2

    .line 325
    check-cast v0, Landroid/database/Cursor;

    .line 326
    .line 327
    invoke-static {v1}, LR8/O;->d(LR8/N;)V

    .line 328
    .line 329
    .line 330
    invoke-static {v0}, Lexpo/modules/contacts/next/extensions/CursorExtensionsKt;->asSequence(Landroid/database/Cursor;)LO8/i;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-interface {v1}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-eqz v3, :cond_d

    .line 343
    .line 344
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    check-cast v3, Landroid/database/Cursor;

    .line 349
    .line 350
    invoke-virtual {v14, v0}, Lexpo/modules/contacts/next/domain/query/QueryAggregator;->aggregateDataRow(Landroid/database/Cursor;)V

    .line 351
    .line 352
    .line 353
    goto :goto_b

    .line 354
    :catchall_1
    move-exception v0

    .line 355
    move-object v1, v0

    .line 356
    goto :goto_c

    .line 357
    :cond_d
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 358
    .line 359
    invoke-static {v2, v12}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v14}, Lexpo/modules/contacts/next/domain/query/QueryAggregator;->buildContacts()Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    return-object v0

    .line 367
    :goto_c
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 368
    :catchall_2
    move-exception v0

    .line 369
    invoke-static {v2, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 370
    .line 371
    .line 372
    throw v0

    .line 373
    :goto_d
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 374
    :catchall_3
    move-exception v0

    .line 375
    invoke-static {v1, v2}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    throw v0
.end method
