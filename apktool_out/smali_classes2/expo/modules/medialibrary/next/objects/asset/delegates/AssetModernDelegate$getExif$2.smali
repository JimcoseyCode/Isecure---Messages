.class final Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;->getExif(Ln7/f;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "Landroid/os/Bundle;",
        "<anonymous>",
        "(LR8/N;)Landroid/os/Bundle;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate$getExif$2"
    f = "AssetModernDelegate.kt"
    l = {
        0x95
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;

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
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, LR8/N;

    .line 15
    .line 16
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->L$0:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, LR8/N;

    .line 34
    .line 35
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;

    .line 36
    .line 37
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    iput v2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->label:I

    .line 40
    .line 41
    invoke-virtual {v1, p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;->getMediaType(Ln7/f;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-ne v1, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    move-object v0, p1

    .line 49
    move-object p1, v1

    .line 50
    :goto_0
    sget-object v1, Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;->IMAGE:Lexpo/modules/medialibrary/next/objects/wrappers/MediaType;

    .line 51
    .line 52
    if-eq p1, v1, :cond_3

    .line 53
    .line 54
    new-instance p1, Landroid/os/Bundle;

    .line 55
    .line 56
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_3
    new-instance p1, Landroid/os/Bundle;

    .line 61
    .line 62
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;

    .line 66
    .line 67
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;)Landroid/content/ContentResolver;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v3, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getExif$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;

    .line 72
    .line 73
    invoke-virtual {v3}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;->getContentUri()Landroid/net/Uri;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v1, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_c

    .line 82
    .line 83
    :try_start_0
    invoke-static {v0}, LR8/O;->d(LR8/N;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, LX0/a;

    .line 87
    .line 88
    invoke-direct {v0, v1}, LX0/a;-><init>(Ljava/io/InputStream;)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lexpo/modules/medialibrary/next/objects/asset/ExifTagsKt;->getEXIF_TAGS()[[Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    array-length v4, v3

    .line 96
    const/4 v5, 0x0

    .line 97
    move v6, v5

    .line 98
    :goto_1
    if-ge v6, v4, :cond_b

    .line 99
    .line 100
    aget-object v7, v3, v6

    .line 101
    .line 102
    aget-object v8, v7, v5

    .line 103
    .line 104
    aget-object v7, v7, v2

    .line 105
    .line 106
    invoke-virtual {v0, v7}, LX0/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    if-eqz v9, :cond_a

    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    const v10, -0x4f08842f

    .line 117
    .line 118
    .line 119
    if-eq v9, v10, :cond_8

    .line 120
    .line 121
    const v10, -0x352a9fef    # -6991880.5f

    .line 122
    .line 123
    .line 124
    if-eq v9, v10, :cond_6

    .line 125
    .line 126
    const v10, 0x197ef

    .line 127
    .line 128
    .line 129
    if-eq v9, v10, :cond_4

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    const-string v9, "int"

    .line 133
    .line 134
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    if-nez v8, :cond_5

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_5
    invoke-virtual {v0, v7, v5}, LX0/a;->m(Ljava/lang/String;I)I

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    invoke-virtual {p1, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catchall_0
    move-exception p1

    .line 150
    goto :goto_3

    .line 151
    :cond_6
    const-string v9, "string"

    .line 152
    .line 153
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-nez v8, :cond_7

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    invoke-virtual {v0, v7}, LX0/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    invoke-virtual {p1, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_8
    const-string v9, "double"

    .line 169
    .line 170
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-nez v8, :cond_9

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_9
    const-wide/16 v8, 0x0

    .line 178
    .line 179
    invoke-virtual {v0, v7, v8, v9}, LX0/a;->l(Ljava/lang/String;D)D

    .line 180
    .line 181
    .line 182
    move-result-wide v8

    .line 183
    invoke-virtual {p1, v7, v8, v9}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 184
    .line 185
    .line 186
    :cond_a
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_b
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    .line 191
    const/4 v0, 0x0

    .line 192
    invoke-static {v1, v0}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    return-object p1

    .line 196
    :goto_3
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 197
    :catchall_1
    move-exception v0

    .line 198
    invoke-static {v1, p1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_c
    return-object p1
.end method
