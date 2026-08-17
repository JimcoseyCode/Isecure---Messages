.class public final Lexpo/modules/medialibrary/albums/DeleteAlbumsKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "",
        "",
        "albumIds",
        "",
        "deleteAlbums",
        "(Landroid/content/Context;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;",
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


# direct methods
.method public static final deleteAlbums(Landroid/content/Context;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[",
            "Ljava/lang/String;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;

    .line 7
    .line 8
    iget v1, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;-><init>(Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object p2

    .line 45
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_2
    iget-object p0, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->L$2:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Ljava/lang/String;

    .line 56
    .line 57
    iget-object p1, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->L$1:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, [Ljava/lang/String;

    .line 60
    .line 61
    iget-object v2, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Landroid/content/Context;

    .line 64
    .line 65
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v9, v2

    .line 69
    move-object v2, p0

    .line 70
    move-object p0, v9

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p2, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 76
    .line 77
    invoke-virtual {p2, p1}, Lexpo/modules/medialibrary/MediaLibraryUtils;->queryPlaceholdersFor([Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    new-instance v5, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v6, "bucket_id IN ("

    .line 87
    .line 88
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v2, ")"

    .line 95
    .line 96
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {p2, p1}, Lexpo/modules/medialibrary/MediaLibraryUtils;->queryPlaceholdersFor([Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    new-instance v8, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iput-object p0, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->L$0:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object p1, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->L$1:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v2, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->L$2:Ljava/lang/Object;

    .line 130
    .line 131
    iput v4, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->label:I

    .line 132
    .line 133
    invoke-virtual {p2, p0, v5, p1, v0}, Lexpo/modules/medialibrary/MediaLibraryUtils;->deleteAssets(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    if-ne p2, v1, :cond_4

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-eqz p2, :cond_6

    .line 147
    .line 148
    sget-object p2, Lexpo/modules/medialibrary/MediaLibraryUtils;->INSTANCE:Lexpo/modules/medialibrary/MediaLibraryUtils;

    .line 149
    .line 150
    const/4 v4, 0x0

    .line 151
    iput-object v4, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->L$0:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v4, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->L$1:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v4, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->L$2:Ljava/lang/Object;

    .line 156
    .line 157
    iput v3, v0, Lexpo/modules/medialibrary/albums/DeleteAlbumsKt$deleteAlbums$1;->label:I

    .line 158
    .line 159
    invoke-virtual {p2, p0, v2, p1, v0}, Lexpo/modules/medialibrary/MediaLibraryUtils;->deleteAssets(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    if-ne p0, v1, :cond_5

    .line 164
    .line 165
    :goto_2
    return-object v1

    .line 166
    :cond_5
    return-object p0

    .line 167
    :cond_6
    const/4 p0, 0x0

    .line 168
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0
.end method
