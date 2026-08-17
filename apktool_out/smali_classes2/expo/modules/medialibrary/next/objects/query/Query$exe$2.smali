.class final Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/objects/query/Query;->exe(Ln7/f;)Ljava/lang/Object;
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
        "Lexpo/modules/medialibrary/next/objects/asset/Asset;",
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
    c = "expo.modules.medialibrary.next.objects.query.Query$exe$2"
    f = "Query.kt"
    l = {
        0x65
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/objects/query/Query;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/next/objects/query/Query;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/next/objects/query/Query;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 2
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
    new-instance v0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;-><init>(Lexpo/modules/medialibrary/next/objects/query/Query;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->label:I

    .line 6
    .line 7
    const-string v2, "media_type"

    .line 8
    .line 9
    const-string v3, "_id"

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    if-ne v1, v4, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LR8/N;

    .line 19
    .line 20
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, LR8/N;

    .line 39
    .line 40
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v5, 0x1e

    .line 43
    .line 44
    if-lt v1, v5, :cond_2

    .line 45
    .line 46
    new-instance v6, Lexpo/modules/medialibrary/next/objects/query/builder/QueryModernExecutor;

    .line 47
    .line 48
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 49
    .line 50
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getClauses$p(Lexpo/modules/medialibrary/next/objects/query/Query;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 55
    .line 56
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getArgs$p(Lexpo/modules/medialibrary/next/objects/query/Query;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 61
    .line 62
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getOrderBy$p(Lexpo/modules/medialibrary/next/objects/query/Query;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 67
    .line 68
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getLimit$p(Lexpo/modules/medialibrary/next/objects/query/Query;)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 73
    .line 74
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getOffset$p(Lexpo/modules/medialibrary/next/objects/query/Query;)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    invoke-direct/range {v6 .. v11}, Lexpo/modules/medialibrary/next/objects/query/builder/QueryModernExecutor;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    new-instance v7, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;

    .line 83
    .line 84
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 85
    .line 86
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getClauses$p(Lexpo/modules/medialibrary/next/objects/query/Query;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 91
    .line 92
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getArgs$p(Lexpo/modules/medialibrary/next/objects/query/Query;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 97
    .line 98
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getOrderBy$p(Lexpo/modules/medialibrary/next/objects/query/Query;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 103
    .line 104
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getLimit$p(Lexpo/modules/medialibrary/next/objects/query/Query;)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 109
    .line 110
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getOffset$p(Lexpo/modules/medialibrary/next/objects/query/Query;)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    invoke-direct/range {v7 .. v12}, Lexpo/modules/medialibrary/next/objects/query/builder/QueryLegacyExecutor;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 115
    .line 116
    .line 117
    move-object v6, v7

    .line 118
    :goto_0
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v5, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 123
    .line 124
    invoke-static {v5}, Lexpo/modules/medialibrary/next/objects/query/Query;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/query/Query;)Landroid/content/ContentResolver;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    iput v4, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->label:I

    .line 131
    .line 132
    invoke-interface {v6, v1, v5, p0}, Lexpo/modules/medialibrary/next/objects/query/builder/QueryExecutor;->exe([Ljava/lang/String;Landroid/content/ContentResolver;Ln7/f;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-ne v1, v0, :cond_3

    .line 137
    .line 138
    return-object v0

    .line 139
    :cond_3
    move-object v0, p1

    .line 140
    move-object p1, v1

    .line 141
    :goto_1
    check-cast p1, Landroid/database/Cursor;

    .line 142
    .line 143
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/query/Query$exe$2;->this$0:Lexpo/modules/medialibrary/next/objects/query/Query;

    .line 144
    .line 145
    :try_start_0
    invoke-static {v0}, LR8/O;->d(LR8/N;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-static {p1}, Lexpo/modules/medialibrary/next/extensions/CursorExtensionsKt;->asIterable(Landroid/database/Cursor;)Ljava/lang/Iterable;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    new-instance v4, Ljava/util/ArrayList;

    .line 161
    .line 162
    const/16 v5, 0xa

    .line 163
    .line 164
    invoke-static {v3, v5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-eqz v6, :cond_4

    .line 180
    .line 181
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    check-cast v6, Landroid/database/Cursor;

    .line 186
    .line 187
    invoke-static {v6, v0, v2}, Lexpo/modules/medialibrary/next/extensions/resolver/CursorExtensionsKt;->extractAssetContentUri(Landroid/database/Cursor;II)Landroid/net/Uri;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :catchall_0
    move-exception v0

    .line 196
    move-object v1, v0

    .line 197
    goto :goto_4

    .line 198
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-static {v4, v5}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_5

    .line 216
    .line 217
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    check-cast v3, Landroid/net/Uri;

    .line 222
    .line 223
    invoke-virtual {v1}, Lexpo/modules/medialibrary/next/objects/query/Query;->getAssetFactory()Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-interface {v4, v3}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;->create(Landroid/net/Uri;)Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_5
    invoke-static {v0}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    const/4 v1, 0x0

    .line 240
    invoke-static {p1, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    :goto_4
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 245
    :catchall_1
    move-exception v0

    .line 246
    invoke-static {p1, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    throw v0
.end method
