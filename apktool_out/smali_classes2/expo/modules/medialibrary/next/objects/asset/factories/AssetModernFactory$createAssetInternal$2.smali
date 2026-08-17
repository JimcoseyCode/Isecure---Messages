.class final Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;->createAssetInternal-7lvfX64(Landroid/net/Uri;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;
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
        "Lexpo/modules/medialibrary/next/objects/asset/Asset;",
        "<anonymous>",
        "(LR8/N;)Lexpo/modules/medialibrary/next/objects/asset/Asset;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.objects.asset.factories.AssetModernFactory$createAssetInternal$2"
    f = "AssetModernFactory.kt"
    l = {
        0x45,
        0x52
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $filePath:Landroid/net/Uri;

.field final synthetic $forceUniqueName:Z

.field final synthetic $relativePath:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;Landroid/net/Uri;ZLjava/lang/String;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;",
            "Landroid/net/Uri;",
            "Z",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$filePath:Landroid/net/Uri;

    .line 4
    .line 5
    iput-boolean p3, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$forceUniqueName:Z

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$relativePath:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 6
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
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$filePath:Landroid/net/Uri;

    .line 6
    .line 7
    iget-boolean v3, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$forceUniqueName:Z

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$relativePath:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;-><init>(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;Landroid/net/Uri;ZLjava/lang/String;Ln7/f;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->L$0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, LR8/N;

    .line 32
    .line 33
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v1, p1

    .line 43
    check-cast v1, LR8/N;

    .line 44
    .line 45
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;

    .line 46
    .line 47
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;)Landroid/content/ContentResolver;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object v5, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$filePath:Landroid/net/Uri;

    .line 52
    .line 53
    invoke-virtual {p1, v5}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-static {p1}, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;->constructor-impl(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    sget-object p1, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType;->Companion:Lexpo/modules/medialibrary/next/objects/wrappers/MimeType$Companion;

    .line 65
    .line 66
    iget-object v5, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$filePath:Landroid/net/Uri;

    .line 67
    .line 68
    invoke-virtual {p1, v5}, Lexpo/modules/medialibrary/next/objects/wrappers/MimeType$Companion;->from-dctPOJs(Landroid/net/Uri;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_0
    iget-boolean v5, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$forceUniqueName:Z

    .line 73
    .line 74
    if-eqz v5, :cond_4

    .line 75
    .line 76
    iget-object v5, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$filePath:Landroid/net/Uri;

    .line 77
    .line 78
    invoke-static {v5}, Lexpo/modules/medialibrary/next/objects/asset/factories/BuildUniqueDisplayNameKt;->buildUniqueDisplayName(Landroid/net/Uri;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    iget-object v5, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$filePath:Landroid/net/Uri;

    .line 84
    .line 85
    invoke-virtual {v5}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-nez v5, :cond_5

    .line 90
    .line 91
    const-string v5, "asset"

    .line 92
    .line 93
    :cond_5
    :goto_1
    iget-object v6, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$relativePath:Ljava/lang/String;

    .line 94
    .line 95
    if-nez v6, :cond_6

    .line 96
    .line 97
    sget-object v6, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath;->Companion:Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;

    .line 98
    .line 99
    invoke-static {v6, p1, v3, v2, v3}, Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;->create-wht0CjE$default(Lexpo/modules/medialibrary/next/objects/wrappers/RelativePath$Companion;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    :cond_6
    iget-object v7, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;

    .line 104
    .line 105
    invoke-static {v7}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;)Landroid/content/ContentResolver;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    iput-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    iput v4, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->label:I

    .line 112
    .line 113
    invoke-static {v7, v5, p1, v6, p0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->insertPendingAsset-cT81_0k(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v0, :cond_7

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_7
    :goto_2
    check-cast p1, Landroid/net/Uri;

    .line 121
    .line 122
    :try_start_0
    invoke-static {v1}, LR8/O;->d(LR8/N;)V

    .line 123
    .line 124
    .line 125
    iget-object v5, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;

    .line 126
    .line 127
    invoke-static {v5}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;)Landroid/content/ContentResolver;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    iget-object v6, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$filePath:Landroid/net/Uri;

    .line 132
    .line 133
    invoke-static {v5, v6, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/TransferExtensionsKt;->copyUriContent(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/net/Uri;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v1}, LR8/O;->d(LR8/N;)V

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;

    .line 140
    .line 141
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;)Landroid/content/ContentResolver;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {v1, p1}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->publishPendingAsset(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 146
    .line 147
    .line 148
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;

    .line 149
    .line 150
    invoke-virtual {v1, p1}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;->create(Landroid/net/Uri;)Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 151
    .line 152
    .line 153
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    return-object p1

    .line 155
    :catch_0
    move-exception v1

    .line 156
    iget-object v5, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;

    .line 157
    .line 158
    invoke-static {v5}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;)Landroid/content/ContentResolver;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-virtual {v5, p1, v3, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-eqz p1, :cond_9

    .line 170
    .line 171
    const-string v5, "Failed to build unique file"

    .line 172
    .line 173
    invoke-static {p1, v5, v4}, LP8/q;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-ne p1, v4, :cond_9

    .line 178
    .line 179
    iget-boolean p1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$forceUniqueName:Z

    .line 180
    .line 181
    if-nez p1, :cond_9

    .line 182
    .line 183
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;

    .line 184
    .line 185
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$filePath:Landroid/net/Uri;

    .line 186
    .line 187
    iget-object v5, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->$relativePath:Ljava/lang/String;

    .line 188
    .line 189
    iput-object v3, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->L$0:Ljava/lang/Object;

    .line 190
    .line 191
    iput v2, p0, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory$createAssetInternal$2;->label:I

    .line 192
    .line 193
    invoke-static {p1, v1, v5, v4, p0}, Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;->access$createAssetInternal-7lvfX64(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetModernFactory;Landroid/net/Uri;Ljava/lang/String;ZLn7/f;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    if-ne p1, v0, :cond_8

    .line 198
    .line 199
    :goto_3
    return-object v0

    .line 200
    :cond_8
    :goto_4
    check-cast p1, Lexpo/modules/medialibrary/next/objects/asset/Asset;

    .line 201
    .line 202
    return-object p1

    .line 203
    :cond_9
    throw v1
.end method
